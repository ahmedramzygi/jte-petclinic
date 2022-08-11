libraries{
    maven
    unitTest
    docker
}
stages{
    continuous_integration{
        build
        test
        build_docker
    }
}

