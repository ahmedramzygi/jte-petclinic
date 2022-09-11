// void call(){

//     stage("Maven: Build the jar file")
//     {
//         // checkout scm
//         node('maven-agent'){
//         echo "building jar from jte"    
//             sh 'mvn clean install'
//            // stash includes: 'target/*.jar', name: 'targetfiles'
           
//     }
//     }
// }

void call(){
        stage("Maven: Build the jar file")
    {
        node('maven-agent'){
        echo "building the jar from CI stage "    
        }

        
           
    }
    }

