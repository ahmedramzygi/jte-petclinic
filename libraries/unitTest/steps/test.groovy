void call(){
    stage("Testing:Perform the unit tests"){
                echo 'Testing Petclinic Application'
                bat 'mvn test'
    }
}