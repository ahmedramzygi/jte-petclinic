
void call(){
    stage("Smoke test:Test the pet clinic application ")
    {      node{
            echo "Smoke test the pet clinic application "
            bat 'curl -I http://localhost:8081/'
            }
            }
           
     }