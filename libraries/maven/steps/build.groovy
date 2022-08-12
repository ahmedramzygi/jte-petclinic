void call(){
    stage("Maven: Build"){
        echo "building jar from jte"     
        node{
            bat'mvn clean install'
        }   
    }
}