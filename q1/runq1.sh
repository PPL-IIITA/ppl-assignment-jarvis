file="log.txt"
if [ -f $file ] ; then
		rm $file
fi
javac Boys.java csv_gen.java Girls.java MyLogger.java q1.java
java q1

