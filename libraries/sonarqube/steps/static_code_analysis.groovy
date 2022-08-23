void call(){
    stage("SonarQube: Static Code Analysis"){
      node{
        echo 'Doing the Static Code Analysis from jte by SQ'
        withSonarQubeEnv(installationName: 'sq1') { 
          bat 'mvn clean package sonar:sonar'
        }  
          }
    }
}