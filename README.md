# This Is Stone
- Originally from https://github.com/Numerosityy/WhatIsStone by Numerosityy
- Continued under the permissive MIT license as per the original repo.

# Behavior
- Adds additional forms of stone to world generation and allows their use as cobblestone alternatives.

# Motivations
- Playing without this makes stone feel very bland. 
- Want to use it in 1.21.1. 
- Sad that a 1.21.1 version wasn't available

# Major modifications from ancestor repository
- Updated to 1.21.1 target
- Scrubbed all MCreator ties
- Moved Blocks to common base classes
- Updated recipes to newer formats
- Updated block strength and explosion resistances based on real world counterparts.

# Caveats

# Bugs
- Much more likely to be addressed if you raise an issue.

# Performance Notes
- Uses standard feature generation pathways, pretty efficient.

# Dev notes
- IDE: IntelliJ & Gradle tab reload top right 
- Debugging: Run > Debug Client
- Terminal: .\gradlew clean build
- Decompile method (FernFlower via IntelliJ)
java -cp "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3\plugins\java-decompiler\lib\java-decompiler.jar" org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler -dgs=1 "C:\Modding\MC\What-Is-Stone_1.20.4_NEOFORGE_v1.0.jar" ".\Decompiled"
