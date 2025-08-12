def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def mavenBuild()
{
  sh "mvn package'
}
