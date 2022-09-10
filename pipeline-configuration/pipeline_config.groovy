
libraries{
    sdp
    git{
          github
    }
    maven
    sonarqube
    //docker
    // ansible
    // smoke
    
}
stages{
    continuous_integration{
        build
        static_code_analysis
      //  build_docker
        //ansible
        // smoke_test
        
    }
}
keywords{
  develop = ~/^[Dd]ev(elop|elopment|eloper|)$/
  main = ~/^[Mm](ain|aster)$/
}
