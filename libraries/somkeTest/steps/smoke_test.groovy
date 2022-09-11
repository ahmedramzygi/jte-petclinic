void call(){
    stage("Docker: Build docker image from CI  ")
         {
             node('docker-agent'){
            echo "building the docker image using docker agent"

            }
                 }
         
         }