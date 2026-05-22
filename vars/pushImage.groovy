def call(String imageName, String imageTag = env.IMAGE_TAG) {

    stage('Push Image to DockerHub') {

        sh """
        docker push ${imageName}:${imageTag}
        """
    }
}