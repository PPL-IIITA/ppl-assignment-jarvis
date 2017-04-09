/*! Type of Girls */
public class Desprate extends Girls{
	double happy = 0;
/*! Function which calculates happiness of Desparate Girls */
	double happyness(Boys boy, gift gf[], int n){
		
		int	sum = 0,i = 0;
		for(i=0;i<n;i++){
				sum +=gf[i].gift_price;
		}
		if(sum > this.expense){
			happy = Math.exp(sum - this.expense);
		}
		else{
			happy = 0;
		}
		return happy ;
}	
}
