
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
        on_pull_request
        build
        static_code_analysis
      //  build_docker
        //ansible
        // smoke_test
        
    }
}
