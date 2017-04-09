/* Abstract Girls Class */
public abstract class Girls {
	String name;
	int attar;
	int expense;
	int intelligence;
	String status;
	String girl_type;
	String boyf;
	double happiness_girl;
/*! Function to calculate happiness of a Girl */
	abstract double happyness(Boys boy, gift gf[], int n);
	
/*! Function to calculate eligibility of a Girl */
	boolean is_eligible(int budget){
	if (this.expense <= budget) {
			return true;
		}
	else {
			return false;
		}
	}

}


