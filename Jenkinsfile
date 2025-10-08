pipeline{
    agent any

    environment{
        DOCKERHUB_REPO = 'madhavgirdhar/calculator'
        IMAGE_TAG = 'latest'
    }

    stages{

        stage("Checkout"){
            steps{
                git "https://github.com/madhav8511/Calculator.git"
            }
        }

        stage("Check Build"){
            steps{
                echo "Building phase..."
                sh 'mvn clean install -DskipTests'
            }
        }

        stage("Run tests"){
            steps{
                echo "Testing phase..."
                sh 'mvn test'
            }
        }

        stage("Build Docker Image"){
            steps{
                echo "Building Docker Image..."
                script{
                    sh "docker build -t ${DOCKERHUB_REPO}:${IMAGE_TAG} ."
                }
            }
        }

        stage("Push to Docker Hub"){
            steps{
                echo "Pushing Image to Hub..."
                script{
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-hub-credentials') {
                        docker.image("${DOCKERHUB_REPO}:${IMAGE_TAG}").push()
                    }
                }
            }
        }

        stage('Ansible Deployment'){
            steps{
                echo "Deploying on Local System via Ansible..."
                sh 'ansible-playbook -i inventory.ini deployment.yml'
            }
        }
    }

    post {
        success {
            echo 'Build and push completed successfully!'
            mail to: 'mgirdhar027@gmail.com',
                         subject: "Build Passed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                         body: "Build completed successfully. Check details here: ${env.BUILD_URL}"
        }
        failure {
            echo 'Build or push failed.'
             mail to: 'mgirdhar027@gmail.com',
                         subject: "Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                         body: "Build failed. See logs for more info: ${env.BUILD_URL}"
        }
    }
}