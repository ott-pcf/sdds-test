pipeline {
    agent any

    stages {

        stage ('Building Stage') {

            steps {
                  bat 'mvn clean package'
            }
        }

        stage ('Deployment Stage') {
            steps {
             	   bat 'cf push'
            }
        }
    }
}