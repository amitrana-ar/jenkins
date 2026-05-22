def call(String imageName) {
    sh "docker build -t ${imageName} ."
    sh "docker push ${imageName}"
}
