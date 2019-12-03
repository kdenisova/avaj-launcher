find . -name "*.java" > sources.txt
javac -d bin -sourcepath src/org/java/Avaj/AvajLAuncher.java @sources.txt
