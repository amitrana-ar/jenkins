def call(String url) {

    stage('Validate Deployment') {

        sh """
        sleep 5
        docker ps
        curl -I ${url}
        """
    }
}