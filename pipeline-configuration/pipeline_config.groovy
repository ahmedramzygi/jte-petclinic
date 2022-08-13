libraries{
    maven
    // unitTest
    sonarqube
    docker
    
}
stages{
    continuous_integration{
        build
        // test
        static_code_analysis
        build_docker
        
    }
}

