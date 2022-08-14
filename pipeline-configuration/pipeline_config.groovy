import static io.wcm.devops.jenkins.pipeline.utils.ConfigConstants.*

libraries{
    // github
    maven
    // unitTest
    sonarqube
    docker
    
}
stages{
 checkoutScm( 
        (SCM) : [
        (SCM_URL) :  "https://github.com/ahmedramzygi/petclinic" ,
        ]
    )    
    continuous_integration{

        build
        // test
        static_code_analysis
        build_docker
        
    }
}

