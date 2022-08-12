libraries{
    maven
}
steps{
    build
    {
    println "running from maven!"
    }
}
stages{
    continuous_integration{
        build
    }
}

