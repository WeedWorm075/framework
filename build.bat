
cd Framework
javac -d . *.java
jar -cvf ../framework.jar etu1769/*
cd ../
mkdir test-Framework\WEB-INF
mkdir test-Framework\WEB-INF\lib


move framework.jar test-Framework\WEB-INF\lib
