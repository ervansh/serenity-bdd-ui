pipeline {
    agent any
    stages {
		stage('Initialize'){
			steps{
				echo "Running build #${env.BUILD_ID} on Jenkins ${env.JENKINS_URL}"
			}
		}
		stage('Checkout'){
			steps{
					echo 'Checkout git. >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'
				    git branch: 'main', url: 'https://github.com/ervansh/serenity-bdd-ui.git'
				    echo 'Checkout stage completed. >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'
			}
		}
        stage('Build') {
            steps {
                 echo "building >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
				 bat label: '', script: 'mvn package'
    			 echo "build stage completed. >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
            }
        }
        stage('Test') {
            steps {
                 echo "Testing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
				 bat label: '', script: 'mvn verify'
    			 echo "Testing stage completed. >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
            }
        }
        stage('Reporting'){
			steps{
				echo 'Publishing report....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'
				echo 'Write your code to publish reports.'
							}
		}
    }
   
}