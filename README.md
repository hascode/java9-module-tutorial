# JAVA 9 Module Tutorial

Playing around with the Java 9 module system.

## Compile Modules

```bash
mkdir -p mods
javac -d mods --module-source-path src $(find src -name "*.java")
```

## Running the Sample
```bash
java --module-path mods -m com.hascode.sample/com.hascode.sample.Main
```

## Creating Module Jars

```bash
jar --create --file=mlib/com.hascode.datetool@1.0.jar -C mods/com.hascode.datetool .
jar --create --file=mlib/com.hascode.sample@1.0.jar --main-class=com.hascode.sample.Main -C mods/com.hascode.sample .
```
## Running Sample from Jar

```bash
java -p mlib -m com.hascode.sample
```

## Displaying Module Information

```bash
jar -d --file=mlib/com.hascode.datetool@1.0.jar

module com.hascode.datetool (module-info.class)
  requires mandated java.base
  exports com.hascode.datetool.api
  contains com.hascode.datetool.internal
```

```bash
jar -d --file=mlib/com.hascode.sample@1.0.jar  

module com.hascode.sample (module-info.class)
  requires com.hascode.datetool
  requires mandated java.base
  contains com.hascode.sample
  main-class com.hascode.sample.Main
```

## Creating Modular Run-Time

```bash
jlink --module-path $JAVA_HOME/jmods:mlib --add-modules com.hascode.sample --output sampleapp
```

Please feel free to visit my blog at [www.hascode.com] for further tutorials and information.

------

**2017 Micha Kops / hasCode.com**

   [www.hascode.com]:http://www.hascode.com/

