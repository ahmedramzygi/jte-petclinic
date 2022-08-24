

void call(){

    stage("SCM Checkout: Checkout the code from github ")
    {      node ('master'){
            echo "Checkout the code from github"
            checkout scm
            }
            }
           
     }
