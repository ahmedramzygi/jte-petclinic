void call(){
    stage("Maven: Build the jar file"){
        echo "building jar from jte"     
        node{
            bat'mvn clean install'
        }   
    }
}