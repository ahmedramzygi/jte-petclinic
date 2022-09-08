

void call(){

    stage("SCM Checkout: Checkout the code from github ")
    {  
        node('maven-agent'){
            echo "Checkout the code from github"
            checkout scm
            }
    }
           
     }
