libraries{
    maven
    {
        mavenID="maven"
    }
    unitTest
    docker
}
steps{
    build
    {
    maven.run(["clean", "install"], profiles: ["integration-test"])
    }
}
stages{
    continuous_integration{
        build
    }
}

