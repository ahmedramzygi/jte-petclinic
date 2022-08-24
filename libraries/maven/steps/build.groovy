void call(){
    agent{
         label 'maven-agent'
    }
    stage("Maven: Build the jar file")
    {
        echo "building jar from jte"     
        node{
            sh 'mvn clean install'
        }   
    }
}

