void call(){

    stage("Maven: Build the jar file")
    {
        node('maven-agent'){
        echo "building jar from jte"     
            sh 'cd .'
            sh'find'
            sh'find . -maxdepth 3'
            sh 'mvn -v'
           
    }
    }
}

