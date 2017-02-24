import java.io.*;
public class boys {
	String name;
	int intelligence;
	int attractivness;
	int budget;
	public static void main(String args[]){
		int i;
		i=0;
		boys b[] = new boys[100];
		String csvFile = "/home/jarvis/workspace/my_PPL/src/boys.csv/";
		String line = "";
		String csvSplit = ",";
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader(csvFile));
			while((line = buff.readLine() )!= null){
				String[] boy = line.split(csvSplit);
				b[i] = new boys();
				b[i].name = boy[0];
				b[i].intelligence = Integer.parseInt(boy[1]);
				b[i].attractivness = Integer.parseInt(boy[2]);
				b[i].budget = Integer.parseInt(boy[3]);
				i++;
			}
		}catch(FileNotFoundException e){
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
		int k;
		k=0;
		for(k=0;k<i;k++){
			System.out.println(b[k].name+","+b[k].intelligence+","+b[k].attractivness+","+b[k].budget);
		}
	}
}