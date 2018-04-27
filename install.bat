

echo %M2_HOME%
@REM set M2_HOME=
@REM set PATH=%PATH%;%M2_HOME%/bin
call mvn clean install -Dmaven.test.skip=true
pause