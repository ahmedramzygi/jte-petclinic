
void call(){
    stage("Docker: Build docker image ")
         {
                 node('master'){
            echo "building the docker image from jte..."
            withCredentials([usernamePassword(credentialsId:'docker-hub',passwordVariable:'PASS',usernameVariable:'USER')]){
            sh "docker login -u $USER -p $PASS"         
            sh 'docker-compose up -d'
            sh 'docker-compose push'   
            }
                 }
         }
}



