
libraries{
  github{
     source_type = "github"
  }
    maven
    sonarqube
    //docker
    // ansible
    // smoke
    
}
stages{
    continuous_integration{
        scm_checkout
        build
        static_code_analysis
      //  build_docker
        //ansible
        // smoke_test
        
    }
}
