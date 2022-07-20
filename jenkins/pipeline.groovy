pipeline{
  agent any
  tools{
    maven "Maven_Jenkins"
  }
  stages{
    stage("Build"){
      steps{
        sh "mvn --version"
        echo "Running my custom BUILD stage..."
      }
    }
  }
}
