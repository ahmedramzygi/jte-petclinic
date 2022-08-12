void call(){
    stage("Maven: Build"){
        echo "building jar from jte"
        bat "mvn clean install"
        
    }
}