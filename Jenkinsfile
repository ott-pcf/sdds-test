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
             	  wrap([$class: 'CloudFoundryCliBuildWrapper',
        			cloudFoundryCliVersion: 'Cloud Foundry CLI (built-in)',
        			apiEndpoint: 'https://api.run.pivotal.io',
			        skipSslValidation: true,
			        credentialsId: 'ottpcf',
			        organization: 'ott-pcf',
			        space: 'development']) {
				           bat 'cf push'
				    }
            }
        }
    }
}