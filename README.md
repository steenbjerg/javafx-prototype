# javafx-prototype

This repository contains an javafx application used for doing gui prototyping with javafx/fxml based applications.

Each prototype will be a separate branch.


## Compilation

Download Liberica from https://bell-sw.com/pages/downloads/

Setup environment variables for jdk 21:

```{script}
export JAVA_HOME=/opt/bellsoft/liberica-vm-full-23.1.9-openjdk21
export PATH=/opt/bellsoft/liberica-vm-full-23.1.9-openjdk21/bin:$PATH
```
or this for jdk 25:

```{script}
export JAVA_HOME=/opt/bellsoft/liberica-vm-full-25.0.1-openjdk25
export PATH=/opt/bellsoft/liberica-vm-full-25.0.1-openjdk25/bin:$PATH
```

In order to compile native you must install the following packages:

```{script}
sudo apt install zlib1g-dev
```

## Graalvm Gradle plugin for Native Client

see https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html

Run this to collect information about classes accessed via reflections and resources needed.  

Do this for creating the necessary metadata files:

```{script}
./gradlew -Pagent=standard run
./gradlew metadataCopy
```

Run this for doing the actual native compilation:

```{script}
./gradlew nativeCompile
```

or commit an the github actions will do it for you.

## Problems with this branch

This branch uses jdk25 but the native compilation fails with this jdk. It has been reported to bell-sw and will be fixed in the near future. Until then jdk21 must be used.

## Contact

* Feel free to contact me.

## Links
* Github actions: https://bell-sw.com/blog/how-to-create-javafx-native-images/
* https://github.com/actions/runner-images?tab=readme-ov-file

