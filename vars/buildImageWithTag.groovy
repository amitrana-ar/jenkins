def call(String imageName, String dockerfilePath = '.') {

    stage('Generate Image Tag') {

        env.IMAGE_TAG = sh(
            script: 'git rev-parse --short HEAD',
            returnStdout: true
        ).trim()

        echo "Generated Image Tag: ${env.IMAGE_TAG}"
    }

    stage('Build Docker Image') {

        sh """
        docker build \
        -t ${imageName}:${env.IMAGE_TAG} \
        ${dockerfilePath}
        """
    }
}