

pipeline {
agent any

 stages {

   stage('Check out') {
      steps {
        echo 'Checking out'
   }
 }
stage('Package') {
 steps {
 bat 'mvn clean package'
 }
}

stage('Run') {
 steps {
 bat 'java -jar InfraBookingApp'
 }
}
  
  

 
}
}