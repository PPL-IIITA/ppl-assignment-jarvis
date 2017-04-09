import java.io.*;
/*! Class MyLogger  */
public class MyLogger {
/*! Function to make log.log file */	
	 static void logfile(String str){
		 
		
		try(FileWriter log = new FileWriter("log.log")){
			log.write(str);			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}