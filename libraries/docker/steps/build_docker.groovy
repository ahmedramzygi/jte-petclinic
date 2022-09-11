
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




// void call(){
//     stage("Docker: Build docker image from CI  ")
//          {
//              node('docker-slave'){
//             echo "building the docker image using docker agent"

//             }
//                  }
         
//          }
void call(){
    stage("Docker: Build docker image from CI  ")
         {
            
            println("building the docker image using docker agent")

            }
                 }
         
         


