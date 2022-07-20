pipeline{
  agent any
  stages{
    stage("Build"){
      steps{
        echo "Running my custom BUILD stage..."
      }
    }
  }
}
