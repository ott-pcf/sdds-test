pipeline {
    agent any

    stages {

        stage ('Building Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn clean package'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                bat 'cf push'
            }
        }
    }
}
