

void call(){
    stage("Checkout: Checkout the code from github ")
    {      node{
            echo "Checkout the code from github"
            checkout scm
            }
            // withCredentials([usernamePassword(credentialsId:'github-for-jenkins',passwordVariable:'PASS',usernameVariable:'USER')]){
            // bat 'git clone https://github.com/ahmedramzygi/petclinic C:/ProgramData/Jenkins/.jenkins/workspace/jte-petclinic-task_main'
            }
           
     }
