void call(){

    stage("Maven: Build the jar file")
    {
        node{
        echo "building jar from jte"    
            checkout scm
            bat 'mvn clean install'
           // stash includes: 'target/*.jar', name: 'targetfiles'
           
    }
    }
}

