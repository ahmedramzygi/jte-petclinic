void call(){
    stage("Docker: Build docker image ")
    {
        node{
            echo "building the docker image from jte..."
            withCredentials([usernamePassword(credentialsId:'docker-for-jenkins',passwordVariable:'PASS',usernameVariable:'USER')]){
            bat "docker login -u $USER -p $PASS"
            bat 'docker ps -a'            
            bat 'docker-compose -f docker-compose.yaml up'
            bat 'docker ps -a'
            // bat 'docker-compose push'   
            }
     }
}
}
