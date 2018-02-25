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
             	  pushToCloudFoundry 
             	  	cloudSpace: 'development', 
             	  	credentialsId: 'ottpcf', 
             	  	organization: 'ott-pcf', 
             	  	target: 'https://api.run.pivotal.io'
            }
        }
    }
}