job('NodeJS app') {
    scm {
        git('https://github.com/bohemian-coder/nodeJS-jenkins-docker.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('bohemian-coder')
            node / gitConfigEmail('jenniferejeme@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') 
    }
    steps {
        shell("npm install")
    }
}