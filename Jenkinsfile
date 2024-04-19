pipeline {
    agent any

    stages {
        stage('Build auth-server') {
            steps {
                dir('frontend/myroom-admin client') {
                    sh 'npm install'
                    cleanWs()
                }  
            }
        }

        // stage('Build App 2') {
        //     steps {
        //         dir("app2") {
        //             sh 'docker build -t app-builder .'
        //         }
        //     }
        // }

        // Add more stages for testing, deployment, etc.
    }
}
