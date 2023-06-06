// job('DSL - Create Pipeline Job') {
//     scm {
//         git('https://github.com/bohemian-coder/nodeJS-jenkins-docker.git') {  node -> // is hudson.plugins.git.GitSCM
//             node / gitConfigName('bohemian-coder')
//             node / gitConfigEmail('jenniferejeme@gmail.com')
//              branches('jenkins-pipeline')
//         }
//     }
//     triggers {
//         scm('H/5 * * * *')
//     }
//     wrappers {
//         nodejs('nodejs') 
//     }
//     steps {
//     }
// }