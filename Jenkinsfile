pipeline{
    agent any
    stages{
        stage('------clone repo and clean------'){
            steps{
                //not needed when running using a Jenkins file
                //deleteDir()
                //bat "git clone https://github.com/avshabavsha/CleanCode_tdd.git"
                //no need to use the '-f' when runnig from Jenkins file--> bat "mvn clean -f CleanCode_tdd/bowling"
                bat "mvn clean -f CleanCode_tdd/bowling"
            }
            
        }
        stage('------Test------'){
            steps{
                bat "mvn test -f CleanCode_tdd/bowling"
            }
            
        }
        stage('------Package------'){
            steps{
                bat "mvn package -f CleanCode_tdd/bowling"
            }
            
        }
    }
}
