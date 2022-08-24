

void call(){

    stage("SCM Checkout: Checkout the code from github ")
    {      node ('git-agent'){
            echo "Checkout the code from github"
            checkout scm
            }
            }
           
     }
