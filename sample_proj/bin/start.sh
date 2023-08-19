#!/bin/bash
#Refer: 
# https://www.baeldung.com/java-memory-beyond-heap
# https://stackoverflow.com/questions/31455644/should-i-set-a-maxmetaspacesize

JAVA_VER=`java -version`
echo "Java version is $JAVA_VER, APP_NAME is $APP_NAME, APP_ARG is $APP_ARG, HEAP_OPTS is $HEAP_OPTS"

GC_OPTS=(
-Xlog:gc*=info,age*=trace:/app/logs/enigma.gc.log:time,level,tags:filecount=10,filesize=100m
-verbose:gc
)

#HEAP_OPTS=(-Xms10M -Xmx10M)
#STACK_OPTS=(-Xss50M)
#META_SPACE_SIZE=(-XX:MaxMetaspaceSize=10M)

java $GC_OPTS $HEAP_OPTS $STACK_OPTS $META_SPACE_SIZE -cp /app/jar/sample_proj-0.0.1-SNAPSHOT.jar $APP_NAME $APP_ARG