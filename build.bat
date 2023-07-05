if exist framework.jar ( del framework.jar )
if exist test-Framework.war ( del test-Framework.war )
cd Framework
javac -d . *.java
jar -cvf ../framework.jar etu1769/*
cd ..
rmdir /s /q test-Framework\WEB-INF
mkdir test-Framework\WEB-INF\lib
IF EXIST framework.jar (
    rem /Y option de la move ne demande pas de confirmation pour remplacer
    move framework.jar test-Framework\WEB-INF\lib
    echo Le fichier framework.jar existe.
) ELSE (
    echo Le fichier framework.jar n'existe pas.
)

set CLASSPATH=%CLASSPATH%;F:\Mianatra\S4\INF-209-Web_Dyn-(Mr.Naina)\sprint\MOI\framework\framework\test-Framework\WEB-INF\lib\framework.jar
cd test-Framework
mkdir WEB-INF\classes
move /Y etu1769 WEB-INF\classes
jar -cvf Test-Framework.war test-Framework/WEB-INF/*
move /Y Test-Framework.war "C:\apache-tomcat-10.0.22\webapps"
