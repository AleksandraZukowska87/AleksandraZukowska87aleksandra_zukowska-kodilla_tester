cd ./build/libs

del *.jar

cd ..

call gradlew build

PAUSE

cd ./build/libs

IF EXIST *.jar (goto create) ELSE (ECHO Compilation error)

PAUSE



:create
mkdir ./projects

cd ./build/libs

copy *.jar ./projects

cd ./projects

dir

PAUSE
