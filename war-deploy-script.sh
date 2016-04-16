#!/bin/bash

cd $OPENSHIFT_REPO_DIR

# Building WAR file
./gradlew war
mv build/libs/*.war diy/glassfish4/glassfish/domains/domain1/autodeploy/

# Batch loading SQL to MySQL
cd sql/
ls -1 *.sql | awk '{ print "source",$0 }' | mysql --batch --host=$OPENSHIFT_MYSQL_DB_HOST --user=$OPENSHIFT_MYSQL_DB_USERNAME --password=$OPENSHIFT_MYSQL_DB_PASSWORD $OPENSHIFT_APP_NAME

cd $OPENSHIFT_REPO_DIR