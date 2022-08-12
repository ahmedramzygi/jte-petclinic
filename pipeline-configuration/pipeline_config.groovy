libraries{
    maven
    {
        mavenID="maven"
    }
    unitTest
    docker
}
// steps{
//         unit_test{
//         stage = "Unit Test"
//         image = "maven"
//         command = "mvn -v"
//     }
// }
stages{
    continuous_integration{
        build
        test
        build_docker
    }
}

