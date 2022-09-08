void call(){
    stage("SonarQube: Static Code Analysis"){
      node( 'maven-agent'){
        echo 'Doing the Static Code Analysis from jte by SQ'
        withSonarQubeEnv(installationName: 'sq1') { 
          sh 'mvn clean package sonar:sonar'
        }  
          }
    }
}
