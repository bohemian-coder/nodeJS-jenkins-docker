job('NodeJS Docker example') {
    scm {
        git('https://github.com/bohemian-coder/nodeJS-jenkins-docker.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('bohemian-coder')
            node / gitConfigEmail('jenniferejeme@gmail.com')
             branches('jenkins-dsl')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') 
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('maybellemo/node-jenkins-docker')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('dockercredentials')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}