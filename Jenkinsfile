pipeline {
    agent any

    stages {

        stage ('Building Stage') {

            steps {
               
                   'mvn clean package'
               
            }
        }


        stage ('Deployment Stage') {
            steps {
                'cf push'
            }
        }
    }
}
