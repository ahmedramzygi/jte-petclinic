
void call(){
    stage("Testing:Perform the unit tests"){
                echo 'Testing Petclinic Application from jte'
                bat 'mvn test'
    }
}