void call(){
    stage("SonarQube: Static Code Analysis"){
        withSonarQubeEnv(installationName: 'sq1') { 
          bat './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
        }    }
}