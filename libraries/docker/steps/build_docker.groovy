
// void call(){
//     stage("Docker: Build docker image ")
//          {
//              node{
//             echo "building the docker image from jte..."
 
//             withCredentials([usernamePassword(credentialsId:'docker-hub',passwordVariable:'PASS',usernameVariable:'USER')]){
//             bat "docker login -u $USER -p $PASS"         
//             bat 'docker-compose up -d'
//             // bat 'docker-compose push'   
//             }
//                  }
         
//          }}




void call(){
    stage("Docker: Build docker image from CI  ")
         {
             node('docker-agent'){
            echo "building the docker image using docker agent"

            }
                 }
         
         }



