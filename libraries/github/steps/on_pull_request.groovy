

import org.kohsuke.github.GitHub

void call(Map args = [:], body){
  println "Before the 1st if "
  // do nothing if not pr
  if (!env.GIT_BUILD_CAUSE.equals("pr")) 
    return
  println "After the 1st if "  
  def source_branch = get_source_branch()
  def target_branch = env.CHANGE_TARGET
  println "Before the 2nd if "
  // do nothing in source branch doesn't match
  if (args.from)
  if (!(source_branch ==~ (~args.from) ))// convert string to regex
    return
  println "After the 2nd if "
  // do nothing if target branch doesnt match
  if (args.to)
  if (!(target_branch ==~ (~args.to) ))// convert string to regex
    return
  println "After the 3rd if "
  
  println "running because of a PR from ${source_branch} to ${target_branch}"
  body()  
  println "After the body if "

}

def get_source_branch(){
  return impls().get_source_branch()
}
