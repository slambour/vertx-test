## Vertx Groovy Test 3.4.0-SNAPSHOT ##
 
## Build ##

    gradle shadowJar

## Run (in the project root) ##

    java8 -jar build/libs/GroovyBackCompatibility-fat.jar -conf conf.json

## Issue ##

The config fails only if vertx-web is added as dependencies 