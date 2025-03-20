def call(GitUrl,Branch){
    echo "cloning the code"
    git url : "${GitUrl}", branch: "${Branch}"
}
