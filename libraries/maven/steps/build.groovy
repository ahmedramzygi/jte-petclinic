void call(){
    stage("Maven: Build"){
        echo "building jar from jte"
        maven.run(["clean", "install"], profiles: ["integration-test"])        // bat "mvn clean install"
        
    }
}