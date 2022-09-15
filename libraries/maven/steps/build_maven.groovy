

void call(){
        stage("Maven: Build the jar file")
    {
      //  node("${config.agent}")
      node('master')
       {
                println( "building maven jar's from CI stage "    )

       }
    }

        
           
    }
    

