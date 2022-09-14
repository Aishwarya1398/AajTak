call mvn compile exec:java -Dexec.mainClass="com.aajtak.android.testrunner.TestSuiteGenerator"
call mvn clean test -DsuiteXMLFile=testng.xml