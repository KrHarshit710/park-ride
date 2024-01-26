pipeline {
    agent any
    tools {
        maven 'maven_3_9_6'
    }
    stages {
        stage('Initialize') {
            steps {
                script {
                    def dockerHome = tool 'docker'
                    env.PATH = "${dockerHome}/bin:${env.PATH}"
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build Docker image') {
            steps {
                sh 'docker build . -t krharshit/park-ride'
            }
        }
    }
}