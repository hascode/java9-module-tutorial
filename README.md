# JAVA 9 Module Tutorial

**Compile**

```bash

javac -d mods/com.hascode.datetool src/com.hascode.datetool/module-info.java src/com.hascode.datetool/com/hascode/datetool/Main.java

```

**Run**

```bash

java --module-path mods -m com.hascode.datetool/com.hascode.datetool.Main

```

------

**2017 Micha Kops / hasCode.com**
