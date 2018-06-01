def waitingUrl(url) {
        timeout(time:5, unit:'MINUTES') { // waiting application is running
                sh 'while( true ) do { http=$(curl -s -o /dev/null -w "%{http_code}" -X PUT ' + url + '); if [ ! $http -eq "000" ]; then echo "application is running ! ($http)"; break; fi; echo "waiting application is running ($http)"; sleep 1;} || { echo "waiting application is running"; sleep 1;} done'                                                                         
        }
}

pipeline {

    agent none

    stages {

                stage('checkout and reset to branch') {
                        agent { label 'master' }
                        steps {
                                sh 'git checkout $BRANCH_NAME'
                                sh 'git reset origin/$BRANCH_NAME --hard'
            }
                }


        stage('Build - back') {
                        agent { label 'master' }
                        steps {
                                sh "cd location && mvn clean install"
                        }
        }


                    stage('Docker') {
                        agent { label 'master' }
                        steps {
                                sh "cd location && docker build -t locationImage ."
                        } 
        }
    }
}
