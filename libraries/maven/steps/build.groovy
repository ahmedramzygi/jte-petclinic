void call(){
    stage("Maven: Build"){
        echo "building jar from jte"
        maven.run(["clean", "install"])
        // bat "mvn clean install"
        
    }
}