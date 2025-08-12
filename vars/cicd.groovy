def GD(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def MB()
{
  sh 'mvn package'
}
def CDeploy(ip,testapp)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/DP1SCP/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${testapp}.war'
}
def CT(ft)
{
  git "https://github.com/IntelliqDevops/${ft}.git"
  sh 'java -jar /home/ubuntu/.jenkins/workspace/DP1SCP/testing.jar'
}
def CDelivery(ip,prodapp)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/DP1SCP/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${prodapp}.war'
}
  
