void call(){

    stage("Maven: Build the jar file")
    {
        node('maven-agent'){
        echo "building jar from jte"     
            sh 'find'
            sh 'mvn -v'
           
    }
    }
}

