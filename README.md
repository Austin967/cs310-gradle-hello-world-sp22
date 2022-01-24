# Hello World
This repository will allow you to build your first Java project of the semester, including unit and acceptance tests, using Gradle as the build tool.

## Building the Project
After you have cloned the repository, you should be able to navigate to the directory containing the `build.gradle` file. There, you can build the project by running this command:

`gradle build`

You can then run the acceptance tests using the Robot Framework plugin:

`gradle runrobot`

Finally, you can run the unit test coverage report using the Java Code Coverage (JaCoCo) plugin:

`gradle jacocoTestReport`

You can even do all of those things in one command:

`gradle build jacocoTestReport runrobot`

When you want to get rid of all of the temporary files (compiled class files, etc.), enter this command:

`gradle clean`

If you want to do a full build and reporting from a clean project, you can just string it all together:

`gradle clean build jacocoTestReport runrobot`

## Structure
The directory structure that is assumed by Gradle (though it can be changed if you want) is as follows:

    project root     (root directory of project, probably "gradle-hello-world")
               |
                - build.gradle    (contains the instructions for the build tasks)
               |
                - src             (root directory of the source code; main and tests)
                    |
                     - main       (root directory of normal source code)
                    |     |
                    |      - java (all packages go here)
                    |           |
                    |            - edu    
                    |           |    |
                    |           |     - jsu
                    |           |         |
                    |           |          - mcis (source code goes here)
                    |           |
                    |            - keywords (Robot Framework keyword code goes here)
                    |
                     - test       (root directory of test code, both unit and acceptance)
                          |
                           - acceptancetest    (all Robot Framework test files go here)
                          |
                           - java (all packages go here)
                                |
                                 - edu    
                                     |
                                      - jsu
                                          |
                                           - mcis (unit test code goes here)

After you run `gradle build`, a new `build` directory will automatically be created. This will contain all of the generated files (compiled class files, JAR files, reports, etc.). The most important of these are as follows:

`build/reports/tests/test/index.html`

This file holds the results of all of the unit tests.

`build/reports/jacoco/test/html/index.html`

This file holds the unit test code coverage results from JaCoCo.

`build/robot-results/report.html`

This file holds the Robot Framework test results.

`build/robot-results/debug.log`

This file holds all of the debug information from the Robot Framework tests.

`build/libs/<name>.jar`

This file (where *name* is specified in the jar settings of `gradle.build`) is the fully bundled code for the project. You can run this JAR by entering the following command from the project root:

`java -jar build/libs/<name>.jar`