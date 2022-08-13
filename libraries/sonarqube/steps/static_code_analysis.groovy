void call(){
    stage("SonarQube: Static Code Analysis"){
      node{
        echo 'Doing the Static Code Analysis from jte by SQ'
        withSonarQubeEnv(installationName: 'sq1') { 
          bat './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
        }  
          }
    }
}