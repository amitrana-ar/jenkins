def call() {

    sh """
    export IMAGE_TAG=${env.IMAGE_TAG}

    docker compose down || true
    docker compose up -d
    """
}