
void call(){
    stage("Docker: Build docker image ")
         {
            echo "building the docker image from jte..."
            unstash 'targetfiles'
            withCredentials([usernamePassword(credentialsId:'docker-hub',passwordVariable:'PASS',usernameVariable:'USER')]){
            bat "docker login -u $USER -p $PASS"         
            bat 'docker-compose up -d'
            // bat 'docker-compose push'   
            }
                 }
         
}



