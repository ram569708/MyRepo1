pipeline{
  agent any
  stages{
    stage("Build"){
      steps{
        sh 'mvn --version'
        echo "Running my custom BUILD stage..."
      }
    }
  }
}
