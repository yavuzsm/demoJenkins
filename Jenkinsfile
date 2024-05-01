pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/yavuzsm/demoJenkins']]
                )
                bat 'mvn clean install'
            }
        }

        stage('Build docker image'){
            steps{
                script{
                    docker.build("deneme1:${env.BUILD_NUMBER}")
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    docker.image("deneme1:${env.BUILD_NUMBER}").run("-d -p 8083:8083 --name demo-container")
                }
            }
        }
    }

}