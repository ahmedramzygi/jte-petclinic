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
    maven.run(["clean", "install"])
    }
}
stages{
    continuous_integration{
        build
    }
}

