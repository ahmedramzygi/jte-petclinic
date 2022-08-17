

void call(){
    stage("SCM Checkout: Checkout the code from github ")
    {      node{
            echo "Checkout the code from github"
            checkout scm
            }
            }
           
     }
