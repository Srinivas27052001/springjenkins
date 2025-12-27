pipeline {
    agent any

    tools {
        maven 'maven_3_9_12'
    }

    stages {
        stage('Build maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/master']],
                    extensions: [],
                    userRemoteConfigs: [[url: 'https://github.com/Srinivas27052001/springjenkins']]
                )
                sh 'mvn clean install'
            }
        }

        stage('Build docker image') {
            steps {
                script {
                    sh 'docker build -t srinivas071/jenkinspipeline .'
                }
            }
        }

        stage('Push image to Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u srinivas071 -p $dockerhubpwd'
                        sh 'docker push srinivas071/jenkinspipeline'
                    }
                }
            }
        }
    }
}
