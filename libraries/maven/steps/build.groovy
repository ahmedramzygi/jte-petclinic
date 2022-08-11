void call(){
    stage("Maven: Build"){
        echo "building jar"
        bat "mvn clean install"
        
    }
}