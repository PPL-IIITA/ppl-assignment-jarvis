/*
 * 
 */
import java.io.*;
/*! MyLogger class to Generate log file */
public class MyLogger {
	
	 static void logfile(String str){
		try(FileWriter log = new FileWriter("log.log")){
			log.write(str);			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}