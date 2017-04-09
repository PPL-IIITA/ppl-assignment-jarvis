/*! Type of Girls */
public class Choosy extends Girls{
/*! Function which calculates happiness of Choosy Girls */
	double happyness(Boys boy, gift gf[], int k){
	
	int i = 0,n = 0,sum = 0;
	double happy;
	for(i=0;i<n;i++){
			sum += gf[i].gift_price;
			if(gf[i].gift_type.equals("Luxury")){
					sum += 2*(gf[i].gift_value);
				}
			else{
				sum = sum + gf[i].gift_value;
			}
	}
	
		happy = Math.log(sum - this.expense);	
	return happy;
	}
}
