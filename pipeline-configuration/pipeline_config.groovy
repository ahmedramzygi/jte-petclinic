libraries{
    github
    maven
    sonarqube
    docker
    
}
stages{
    continuous_integration{
        scm_checkout
        build
        static_code_analysis
        build_docker
        
    }
}

