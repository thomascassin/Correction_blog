pipeline {
   environment {
       PROJET_URL           = 'https://github.com/SylvaineDidier/jenkins_java_maven_test.git'
       GITHUB_ID            = credentials('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')
   }

   agent any

   stages {
      stage('Clone') {
         steps {
            //Clone the repository
            //git credentialsId: '${GITHUB_ID}', url: '${PROJET_URL}'
            //git credentialsId: '$GITHUB_ID', url: '$PROJET_URL'
            checkout([$class: 'GitSCM',
                branches: [[name: '*/master' ]],
                extensions: scm.extensions,
                userRemoteConfigs: [[
                    url: 'https://github.com/SylvaineDidier/jenkins_java_maven_test.git',
                    credentialsId: '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'
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

      stage('Tests'){
         steps{
            withMaven(maven: 'apache-maven-3.8.6') {
               sh "mvn test"
            }
         }

         post {
            always {
               //Save report inside .xml
               junit(
                  allowEmptyResults: true,
                  testResults: '*/test-reports/test-result-*.xml'
               )
               //Archive inside artifact
               archiveArtifacts 'target/*.jar'
            }
         }
      }

      stage('Deploy'){
         steps{
            echo "Deploy"
         }
      }
   }
}