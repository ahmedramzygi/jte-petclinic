libraries{
   maven {
    mavenId = "maven"
  }
}
steps{
    build{
maven.run(["clean", "install"], profiles: ["integration-test"])
    }
}
stages{
    continuous_integration{
        build
    }
}

