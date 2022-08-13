libraries{
    maven
    unitTest
    docker
    sonarqube
}
stages{
    continuous_integration{
        build
        test
        build_docker
        static_code_analysis
    }
}

