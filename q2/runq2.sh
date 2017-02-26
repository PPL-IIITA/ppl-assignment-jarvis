file="log.txt"
if [ -f $file ] ; then
	rm $file
fi
javac Boys.java Couple.java csv_gen.java gift.java Girls.java MyLogger.java q2.java
java q2
