def call(String url) {

    sh """
    sleep 5
    docker ps
    curl -I ${url}
    """
}