void call(){

    stage("Maven: Build the jar file")
    {
        node('maven-agent'){
        echo "building jar from jte"     
            sh 'ls'
            sh 'mvn -v'
           
    }
    }
}

