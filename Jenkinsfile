node{
    
    def docker=tool name: 'docker-jenkins', type: 'dockerTool'
    def dockerCMD = "$docker/bin/docker"
    
    stage('git checkout'){
        git 'https://github.com/KapilDhall/DevOps.git'
    }
    
    stage('code build & test'){
        def mavenHome = tool name: 'maven-3' , type: 'maven'
        sh "${mavenHome}/bin/mvn clean package"
    }
  
    stage('docker build'){
        sh "$dockerCMD build -t dhallk/cicd-demo:4.0 ."
    }
    
    stage('docker push to docker hub'){
        withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhub_pwd')]) {
    
        sh "$dockerCMD login -u dhallk -p $dockerhub_pwd"
        }
        sh "$dockerCMD push dhallk/cicd-demo:4.0"
    }
    
    stage('docker image deploy to cloud foundry'){
        withCredentials([string(credentialsId: 'pcf_pwd', variable: 'pcf_pwd')]) {
            // some block
            sh "cf login -a https://api.run.pivotal.io -u dhall.kapil@gmail.com -p $pcf_pwd -o KapilDhall -s development"
        }
        sh "cf push -t 180 kapildhall_myapp_sb_pcf --docker-image dhallk/cicd-demo:4.0"
    }
    
}