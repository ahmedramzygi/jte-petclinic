/*
  Copyright © 2018 Booz Allen Hamilton. All Rights Reserved.
  This software package is licensed under the Booz Allen Public License. The license can be found in the License file or at http://boozallen.github.io/licenses/bapl
*/

package libraries.github

// @Init
void call(context) {
  node{
      unstash "workspace"

      env.GIT_URL = scm.getUserRemoteConfigs()[0].getUrl()
      env.GIT_CREDENTIAL_ID = scm.getUserRemoteConfigs()[0].credentialsId.toString()
      def parts = env.GIT_URL.split("/")
      for (part in parts){
          parts = parts.drop(1)
          if (part.contains(".")) break
      }
      env.ORG_NAME = parts.getAt(0)
      env.REPO_NAME = parts[1..-1].join("/") - ".git"
      env.GIT_SHA = sh(script: "git rev-parse HEAD", returnStdout: true).trim()

      if (env.CHANGE_TARGET){
        env.GIT_BUILD_CAUSE = "pr"
      } else {
        env.GIT_BUILD_CAUSE = sh (
          script: 'git rev-list HEAD --parents -1 | wc -w', // will have 2 shas if commit, 3 or more if merge
          returnStdout: true
        ).trim().toInteger() > 2 ? "merge" : "commit"
      }

      println "Found Git Build Cause: ${env.GIT_BUILD_CAUSE}"
  }
  return
}
