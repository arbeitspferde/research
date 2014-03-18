# Quick Experimental Analysis Workflow
This only works on Linux for the moment.

# Requirements
1. Protocol Buffer 2.5.0 in ${PATH}
2. Sawzall from SVN HEAD in ${PATH}

# Workflow
    $ mvn compile assembly:assembly assembly:single
    $ java -jar target/trial-1.0-SNAPSHOT-jar-with-dependencies.jar > example.recordio
    $ szl -program example.szl -use_recordio=true example.recordio