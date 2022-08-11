void call(){
    stage("Docker: Build docker image ")
    {
            echo "building the docker image..."
            withCredentials([usernamePassword(credentialsId:'docker-for-jenkins',passwordVariable:'PASS',usernameVariable:'USER')]){
            bat "docker login -u $USER -p $PASS"
            bat 'docker-compose up -d'
            bat 'docker-compose push'   
     }
}
}