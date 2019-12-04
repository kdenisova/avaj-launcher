find . -name "*.java" > sources.txt
javac -d bin -sourcepath src/org/java/Avaj/AvajLauncher.java @sources.txt
