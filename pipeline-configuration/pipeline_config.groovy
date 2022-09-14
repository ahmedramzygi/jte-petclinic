
libraries{
    sdp
    // {
    //   agent='maven-agent-2'
    // }
    git
    //{
          github

          //agent='maven-agent'
    //}
    maven
    {
      agent='maven-agent-2'
    }
    
    sonarqube
    // {
    //   agent='maven-agent-2'
    // }
    docker
    // {
    //   agent='docker-slave'
    // }

    
}
stages{
    continuous_integration{
        build_maven
        static_code_analysis
        build_docker
    }

}
application_environments{
  master
  staging
  development
  test
  prod
}
keywords{
  dev = ~/^[Dd]ev(elop|elopment|eloper|)$/
  main = ~/^[Mm](ain|aster)$/
}
