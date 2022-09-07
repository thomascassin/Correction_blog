pipeline {

   agent any

   tools{
      maven 'mon_maven_auto'
   }

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

      stage('Compile'){
         steps{
            withMaven(maven:'mon_maven_auto')
            {
              sh "mvn -T"
            }
         }
      }
      stage('Build'){
         steps{
            sh "mvn -B -DskipTests clean package"
         }
      }




   }
}
