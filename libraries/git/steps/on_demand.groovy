/*
  Copyright © 2018 Booz Allen Hamilton. All Rights Reserved.
  This software package is licensed under the Booz Allen Public License. The license can be found in the License file or at http://boozallen.github.io/licenses/bapl
*/

package libraries.git.steps

void call(Map args = [:], body){

 

  // do nothing if not on demand
  if (!(env.GIT_BUILD_CAUSE in ["demand"]))
    return
  // Get the source job where the trigger is fired
  def source_job = env.JOB_BASE_NAME
  println("The job name is from ${source_job}")


  if (args.from){
  println(args.from)
  
  if( source_job.equals("main"))
  {
  println "running on demand from ${source_job}"
  body()
  return
  }
  else if( source_job.equals("dev"))
  {
  println "running on demand from ${source_job}"
  body()
  return   

  }
  else if( source_job.equals("feature"))
  {
  println "running on demand from ${source_job}"
  body()
  return

  }  
  // if (!source_job.collect{ it ==~ args.from}.contains(true))
  //   println('doesnt read the from args')
  //   return  
  // }


  // println "running on demand from ${source_job}"
  // // After the on_demand logic finishes the body of stages will start
  // body()
}
}