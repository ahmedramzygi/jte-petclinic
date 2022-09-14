/*
  Copyright © 2018 Booz Allen Hamilton. All Rights Reserved.
  This software package is licensed under the Booz Allen Public License. The license can be found in the License file or at http://boozallen.github.io/licenses/bapl
*/

package libraries.git.steps

void call(Map args = [:], body){

// get notified by the build
// get the src branch 
// put the build cause inside the git.buildcause variable
// trigger the body 

  

  // do nothing if not pr
  if (!(env.GIT_BUILD_CAUSE in ["demand"]))
    return

  def source_job = env.JOB_NAME
//   def target_branch = env.CHANGE_TARGET
  println("The job name is from ${source_job}")
//   println("target branch is ${target_branch}")

//   // do nothing if source branch doesn't match
//   if (args.from)
//   if (!source_branch.collect{ it ==~ args.from}.contains(true))
//     return

//   // do nothing if target branch doesnt match
//   if (args.to)
//   if (!(target_branch ==~ args.to))
//     return


  println "running on demand from ${source_job}"
  body()
}
