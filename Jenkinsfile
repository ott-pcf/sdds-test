pipeline {
    agent sdds

    stages {

        stage ('Building Stage') {

            steps {
                  step 'mvn clean package'
            }
        }

        stage ('Deployment Stage') {
            steps {
             	   step 'cf push'
            }
        }
    }
}