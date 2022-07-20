pipeline{
  agent any
  tools{
    maven "Maven_Jenkins"
  }
  stages{
    stage("Build"){
      steps{
        echo "Running my custom BUILD stage..."
        bat "mvn clean install -Dmaven.test.skip=true"
      }
    }
  }
}
