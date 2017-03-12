@ECHO OFF

SET BROWSER=firefox

mvn clean verify -Dwebdriver.driver=%BROWSER%
## -Dcucumber.options="--tags @webStoriesGoogleSearch"