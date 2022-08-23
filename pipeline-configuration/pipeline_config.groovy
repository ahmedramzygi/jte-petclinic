libraries{
    github
    maven
    //sonarqube
    docker
    smoke
    
}
stages{
    continuous_integration{
        scm_checkout
        build
      //  static_code_analysis
        build_docker
        smoke_test
        
    }
}

