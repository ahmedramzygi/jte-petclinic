libraries{
 github{
     source_type = "github"
  }
    maven
    {
        mavenID="maven"
    }
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

