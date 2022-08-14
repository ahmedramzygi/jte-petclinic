

void call(){
    stage("Checkout: Checkout the code from github ")
    {      
            checkoutScm( 
                (SCM) : [
                    (SCM_URL) : "https://github.com/ahmedramzygi/petclinic",
                ]
            )
            
            // echo "Checkout the code from github"
            // withCredentials([usernamePassword(credentialsId:'github-for-jenkins',passwordVariable:'PASS',usernameVariable:'USER')]){
            // bat 'git clone https://github.com/ahmedramzygi/petclinic C:/ProgramData/Jenkins/.jenkins/workspace/jte-petclinic-task_main'
            }
     }
