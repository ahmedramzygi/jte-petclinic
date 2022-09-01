void call(){

    stage("Maven: Build the jar file")
    {
        node('maven-agent'){
        echo "building jar from jte"    
            sh 'scm checkout'
            sh 'mvn clean install'
            stash includes: 'target/*.jar', name: 'targetfiles'
           
    }
    }
}

