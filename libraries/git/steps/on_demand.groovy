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

  

  // do nothing if not on demand
  if (!(env.GIT_BUILD_CAUSE in ["demand"]))
    return

  def source_job = env.JOB_NAME
  println("The job name is from ${source_job}")
  
  if (args.from)
  if (!source_job.collect{ it ==~ args.from}.contains(true))
    return  

  println "running on demand from ${source_job}"
  body()
}
