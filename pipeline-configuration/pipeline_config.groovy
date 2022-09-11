
libraries{
    sdp
    git{
          github
    }
    maven
    sonarqube
    docker
    deploy
    // ansible

    
}
stages{
    continuous_integration{
        build
        static_code_analysis
        build_docker
    }

}
application_environments{
  staging
  test
  prod
}
keywords{
  dev = ~/^[Dd]ev(elop|elopment|eloper|)$/
  main = ~/^[Mm](ain|aster)$/
}
