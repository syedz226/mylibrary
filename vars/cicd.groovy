def GD(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def MB()
{
  sh 'mvn package'
}
def CDeploy(ip)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/DP1SCP/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/testapp1.war'
}
def CT(ft)
{
  git 'https://github.com/IntelliqDevops/${ft}.git'
  sh 'java -jar /home/ubuntu/.jenkins/workspace/DP1SCP/testing.jar'
}
def CDelivery(ip)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/DP1SCP/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/testapp1.war'
}
  
