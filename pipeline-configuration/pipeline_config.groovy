libraries{
    maven
    {
        mavenID="maven"
    }
}
steps{
    build
    {
    println "running as ${stepContext.name}!"
    }
}
stages{
    continuous_integration{
        build
    }
}

