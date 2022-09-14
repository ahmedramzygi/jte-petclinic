

void call(){
        stage("Maven: Build the jar file")
    {
       node("${agent}")
       {
                println( "building maven jar's from CI stage "    )

       }
    }

        
           
    }
    

