#!/bin/bash

mvn clean package
ssh gaudi "chown gaudi:gaudi /opt/gaudi/startup_openj9.sh"
ssh gaudi "chmod 777 /opt/gaudi/startup_openj9.sh"
ssh gaudi "pkill -9 java"
scp target/gaudi-1.0-SNAPSHOT-jar-with-dependencies.jar gaudi:/opt/gaudi
ssh gaudi "chown gaudi:gaudi" /opt/gaudi/gaudi-1.0-SNAPSHOT-jar-with-dependencies.jar

ssh gaudi "/opt/gaudi/startup_openj9.sh"
