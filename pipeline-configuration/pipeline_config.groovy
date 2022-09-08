jte{
  permissive_initialization = true // pipeline will fail if not set
}

libraries{
    github
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
