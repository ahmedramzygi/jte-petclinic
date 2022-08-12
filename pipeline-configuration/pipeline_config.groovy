
@Library('sdp')_
libraries{
  sdp{
    images{
      registry = "https://docker.pkg.github.com" 
      repository = "boozallen/sdp-images" 
      cred = "github" 
    }
  }
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

