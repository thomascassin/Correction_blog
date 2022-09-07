pipeline {
   
   environment {
       PROJET_URL           = 'https://github.com/SylvaineDidier/jenkins_java_maven_test.git'
       GITHUB_ID            = credentials('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')
   }

   agent any

   stages {
      stage('Clone') {
         steps {
            checkout([$class: 'GitSCM',
                branches: [[name: '*/master' ]],
                extensions: scm.extensions,
                userRemoteConfigs: [[
                    url: 'https://github.com/SylvaineDidier/jenkins_java_maven_test.git',
                    credentialsId: '34743330-2f85-4c07-bcac-58fa0bb18701'
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