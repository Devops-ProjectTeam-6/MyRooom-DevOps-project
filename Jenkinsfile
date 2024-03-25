pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building auth-server'
                sh 'auth-server/./gradlew clean build --no-daemon'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}