import java.io.*;
public class q1{
	public static void main(String args[]){
		int i;
		i=0;
		Boys b[] = new Boys[1000];
		String csvFile = "/home/jarvis/workspace/my_PPL/src/boys.csv/";
		String line = "";
		String csvSplit = ",";
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader(csvFile));
			while((line = buff.readLine() )!= null){
				String[] boy = line.split(csvSplit);
			//	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
				b[i] = new Boys();
			    b[i].name = boy[0];
				b[i].intelligence = Integer.parseInt(boy[1]);
				b[i].attractivness = Integer.parseInt(boy[2]);
				b[i].budget = Integer.parseInt(boy[3]);
				i++;
			}
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		Girls g[] = new Girls[1000];
		csvFile = "/home/jarvis/workspace/my_PPL/src/boys.csv/";
		line = "";
		csvSplit = ",";
		buff = null;
		
		
		try{
			buff = new BufferedReader(new FileReader(csvFile));
			while((line = buff.readLine() )!= null){
				String[] girl = line.split(csvSplit);
			//	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
				g[i] = new Girls();
			    g[i].name = girl[0];
				g[i].maintenance = Integer.parseInt(girl[1]);
				g[i].intelligence = Integer.parseInt(girl[2]);
				g[i].budget = Integer.parseInt(girl[3]);
				//g[i].status = girl[4];
				
				i++;
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
				if(buff != null){
					try{
						buff.close();
					}catch(IOException e){
					e.printStackTrace();
					}
				}
		}
/*		int k;
		k=0;
		for(k=0;k<i;k++){
			System.out.println(b[k].name+","+b[k].intelligence+","+b[k].attractivness+","+b[k].budget);
			System.out.println(g[k].name+","+g[k].maintenance+","+g[k].intelligence+","+b[k].budget+","+g[k].status);
		}*/
	}
}