/*! Type of Girls */
public class Normal extends Girls{
	double happy = 0;
/*! Function which calculates happiness of Normal Girls */
	double happyness(Boys boy, gift gf[], int n){
	
		int sum = 0,i = 0;
		for(i=0;i<n;i++){
				sum = sum +gf[i].gift_price+gf[i].gift_value;
		}
		if(sum > this.expense){
			happy = sum - this.expense;
		}
		else{
			happy = 0;
		}
		return happy;
	}
	
}