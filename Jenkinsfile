pipeline{
    agent any
    stages{
        stage('------clean------'){
            steps{
                //not needed when running using a Jenkins file
                //deleteDir()
                //bat "git clone https://github.com/avshabavsha/CleanCode_tdd.git"
                //no need to use the '-f' when runnig from Jenkins file--> bat "mvn clean -f bowling"
                bat "mvn clean -f bowling"
            }
            
        }
        stage('------test------'){
            steps{
                bat "mvn test -f bowling"
            }
            
        }
        stage('------package------'){
            steps{
                bat "mvn package -f bowling"
            }
            
        }
    }
}
