void call(){

    stage("Maven: Build the jar file")
    {
        node('maven-agent'){
        echo "building jar from jte"     
            sh 'cd jte-petclinic_main'
            sh 'mvn clean install'
           
    }
    }
}

