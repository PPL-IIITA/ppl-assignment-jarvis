import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/*! Contain breakup details */
public class breakup_couple {
	Couple cp[];
	int k;
	int n;
	String s;
	int m;
	
	breakup_couple(Couple cp[],int k, int n ,String content,int m){
		this.cp = cp;
		this.k = k;
		this.n = n;
		this.s = content;
		this.m = m;
	}
/*! Function to print least n happy couple */
	String break_print()
	{
		int i;
		for(i = 0 ; i < k; i++){
			if(cp[i].girl.status != "Single" && cp[i].happiness < n) {
		//	System.out.println(cp[i].boy.name+" brokeup with "+cp[i].girl.name);
			String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
			s = s.concat("\n"+timeStamp+" Day " + 30/m +" Boy "+cp[i].boy.name+" brokeup with Girl "+cp[i].girl.name+"\n\n");
			cp[i].boy.status = "Single";
			cp[i].girl.status = "Single";
		}
		
	}
		return s;
}
}
	
