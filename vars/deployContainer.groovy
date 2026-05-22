def call(String composePath = '.') {

    stage('Deploy Container') {

        sh """
        export IMAGE_TAG=${env.IMAGE_TAG}

        cd ${composePath}

        docker compose down || true
        docker compose up -d
        """
    }
}