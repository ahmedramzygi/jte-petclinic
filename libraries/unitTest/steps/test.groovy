
void call(){
    stage("Testing:Perform the unit tests"){
                echo 'Testing Petclinic Application from jte'
                node{
                bat 'mvn test'
                }
    }
}