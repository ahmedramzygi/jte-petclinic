/*
  Copyright © 2018 Booz Allen Hamilton. All Rights Reserved.
  This software package is licensed under the Booz Allen Public License. The license can be found in the License file or at http://boozallen.github.io/licenses/bapl
*/

package libraries.git.steps

void call(Map args = [:], body){
  // do nothing if not pr
  if (!(env.GIT_BUILD_CAUSE in ["pr"]))
    return

  def source_branch = git_distributions.fetch().get_source_branch() // Get the source branch of the pull request
  def target_branch = env.CHANGE_TARGET //Get the target branch where the pr is requested at
  println("source branch is ${source_branch}")
  println("target branch is ${target_branch}")

  // do nothing if source branch doesn't match
  if (args.from)
  if (!source_branch.collect{ it ==~ args.from}.contains(true))
    return

  // do nothing if target branch doesnt match
  if (args.to)
  if (!(target_branch ==~ args.to))
    return


  println "running because of a PR from ${source_branch} to ${target_branch}"
  body()

}
