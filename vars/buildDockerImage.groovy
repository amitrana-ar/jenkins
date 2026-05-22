def call(String imageName) {

    sh """
    docker build \
    -t ${imageName}:${env.IMAGE_TAG} .
    """
}