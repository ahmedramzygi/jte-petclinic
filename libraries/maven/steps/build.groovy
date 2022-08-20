void call(){
    stage("Maven: Build the jar file"){
        echo "building jar from jte"     
    agent {
        docker { image 'maven:3.8.1-adoptopenjdk-11' }
      }
       steps {
        sh 'mvn --version'
      }
    }
}
