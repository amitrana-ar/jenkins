def call() {

    env.IMAGE_TAG = sh(
        script: 'git rev-parse --short HEAD',
        returnStdout: true
    ).trim()

    echo "Generated Image Tag: ${env.IMAGE_TAG}"
}