void call(){
    stage("Copy files to ansible server"){
        echo "Copy all files to ansible server in ubuntu ec2_instance"  
        
        node {
  sshagent (credentials: ['ec2-server-key']) {
      bat "scp -o StrictHostKeyChecking=no ansible_playbook/* root@34.235.179.44:/root" // I copied all the ansible playbook files to the remote ubuntu 
      withCredentials([sshUserPrivateKey(credentialsId:'ec2-server-key',keyFileVariable:'keyfile',usernameVariable:'user')]){
      bat 'scp $keyfile root@34.235.179.44:/root/ssh-key.pem'
  }
 
    }
}
}
}
