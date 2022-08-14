import static io.wcm.devops.jenkins.pipeline.utils.ConfigConstants.*
libraries{
    github
    maven
    // unitTest
    sonarqube
    docker
    
}
stages{
    continuous_integration{
        scm_checkout
        build
        // test
        static_code_analysis
        build_docker
        
    }
}

