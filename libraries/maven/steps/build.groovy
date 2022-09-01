void call(){

    stage("Maven: Build the jar file")
    {
        node('master'){
        echo "building jar from jte"     
            sh 'mvn clean install'
           
    }
    }
}

