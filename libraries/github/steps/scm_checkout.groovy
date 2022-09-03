

void call(){

    stage("SCM Checkout: Checkout the code from github ")
    {      
            echo "Checkout the code from github"
            checkout scm
            }
            
           
     }
