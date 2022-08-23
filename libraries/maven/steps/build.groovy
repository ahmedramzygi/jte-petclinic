void call(){
    stage("Maven: Build the jar file"){
        echo "building jar from jte"     
        node{
            bat'mvn clean install'
        }   
    }
}
void call(){
    stage("Maven: Build the jar files"){
        echo "building jar from jte"     
        node{
            bat'mvn clean install'
        }   
    }
}
