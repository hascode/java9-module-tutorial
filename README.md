# JAVA 9 Module Tutorial

**Compile**

```bash

javac -d mods --module-source-path src $(find src -name "*.java")

```

**Run**

```bash

java --module-path mods -m com.hascode.datetool/com.hascode.datetool.Main

```

**Create Jar**

```bash

jar --create --file=mlib/com.hascode.datetool@1.0.jar --main-class=com.hascode.datetool.Main -C mods/com.hascode.datetool .

```

**Run from Jar**

```bash

java -p mlib -m com.hascode.datetool

```

**Display Module Declaration**

```bash

jar -d --file=mlib/com.hascode.datetool@1.0.jar                                                                                                                                                                                                                        1 ↵

module com.hascode.datetool (module-info.class)
  requires mandated java.base
  contains com.hascode.datetool
  main-class com.hascode.datetool.Main

```

------

**2017 Micha Kops / hasCode.com**
