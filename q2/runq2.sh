file="log.txt"
if [ -f $file ] ; then
	rm $file
fi
javac *.java
java q2
