
void call(){
    stage("Smoke test:Test the pet clinic application ")
    {      node{
            echo "Smoke test the pet clinic application "
            bat 'curl http://localhost:8081/'
            }
            }
           
     }
void call(){
    stage("Smoke test:Test the pet clinic application ")
    {      node{
            echo "Smoke test the pet clinic application "
            bat ' C:/curl -I http://localhost:8081/'
            }
            }
           
     }