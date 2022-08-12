libraries{
    maven
    {
        mavenID="maven"
    }
}
steps{
    build
    {
    maven.run(["clean", "install"])
    }
}
stages{
    continuous_integration{
        build
    }
}

