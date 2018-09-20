# ps
Simple ps java implementation

## Basic Usage ##

```bash

    # get a full list of processes
    $ java -jar ps.jar

    # find a 'process name' and exclude the grep process from result
    $ java -jar ps.jar | grep 'process name' | grep -v 'grep.*process name'

```
