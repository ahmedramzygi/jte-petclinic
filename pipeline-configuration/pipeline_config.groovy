libraries{
    maven
    {
        mavenID="maven"
    }
}
steps{
    build
    {
    println "running from maven build!"
    }
}
stages{
    continuous_integration{
        build
    }
}

