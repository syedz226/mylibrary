def GD(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def MB()
{
  sh 'mvn package'
}
def CDeploy(jobname,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
def CT(ft)
{
  git "https://github.com/IntelliqDevops/${ft}.git"
  sh 'java -jar /home/ubuntu/.jenkins/workspace/DP1SCP/testing.jar'
}
def CDelivery(jobname,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
  
