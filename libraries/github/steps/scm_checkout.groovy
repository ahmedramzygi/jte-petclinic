

void call(){
    agent{
         label 'master'
    }
    stage("SCM Checkout: Checkout the code from github ")
    {      node{
            echo "Checkout the code from github"
            checkout scm
            }
            }
           
     }
