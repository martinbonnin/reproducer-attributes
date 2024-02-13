```
$ ./gradlew -p test help

> Configure project :
e: file:///Users/mbonnin/git/reproducer-attributes/test/build.gradle.kts:13:11: Unresolved reference: MyAnnotation

FAILURE: Build failed with an exception.

* Where:
Build file '/Users/mbonnin/git/reproducer-attributes/test/build.gradle.kts' line: 13

* What went wrong:
Script compilation error:

  Line 13: @included.MyAnnotation
                     ^ Unresolved reference: MyAnnotation


$ sed -i.bak 's#id("dev.adamko.dokkatoo-html")#//id("dev.adamko.dokkatoo-html")#g' annotations/build.gradle.kts

$ ./gradlew -p test help                                                                                      
> Task :help

Welcome to Gradle 8.5.

To run a build, run gradlew <task> ...

To see a list of available tasks, run gradlew tasks

To see more detail about a task, run gradlew help --task <task>

To see a list of command-line options, run gradlew --help

For more detail on using Gradle, see https://docs.gradle.org/8.5/userguide/command_line_interface.html

For troubleshooting, visit https://help.gradle.org

BUILD SUCCESSFUL in 1s

```