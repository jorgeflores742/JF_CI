pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './store-webapp-sample-master/gradlew clean build -p store-webapp-sample-master'                   
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './store-webapp-sample-master/gradlew test -p store-webapp-sample-master'
                sh './store-webapp-sample-master/gradlew jacocoTestReport -p store-webapp-sample-master'   

                // Publish the JUnit test Report
                publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'store-webapp-sample-master/build/reports/tests/test',
                    reportFiles: 'index.html',
                    reportName: 'JUnit Report'
                  ]

                // Publish the Java Code Coverage Report
                publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'store-webapp-sample-master/build/jacocoHtml',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Report'
                  ]                              
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh './store-webapp-sample-master/gradlew jar -p store-webapp-sample-master'                
            }
        }
    }

    post {
        always {            
            archiveArtifacts artifacts: 'store-webapp-sample-master/build/libs/**/*.jar', fingerprint: true
            archiveArtifacts artifacts: 'store-webapp-sample-master/build/libs/**/*.war', fingerprint: true
            junit 'store-webapp-sample-master/build/test-results/**/*.xml'
        }
    }
}