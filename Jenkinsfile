pipeline {
   
   agent any

   stages {
      stage('Clone') {
         steps {
            checkout([$class: 'GitSCM',
                branches: [[name: '*/master' ]],
                extensions: scm.extensions,
                userRemoteConfigs: [[
                    url: 'https://github.com/SylvaineDidier/jenkins_java_maven_test.git',
                    credentialsId: '86ebefd1-279b-46f1-be3a-ca3094b4750d'
                ]]
            ])
            
            //List all directories
            sh "ls -lart ./*" 
         }
      }
      

      stage('Build'){
         steps{
            withMaven(maven: 'apache-maven-3.8.6') {
               sh "mvn -B -DskipTests clean package"
            }
         }
      }

     

     
   }
}