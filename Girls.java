public class Girls {
	String name;
	int attar;
	int expense;
	int intelligence;
	String boyf;
	String status;
	

	boolean is_eligible(int budget){
	if (this.expense <= budget) {
			return true;
		}
	else {
			return false;
		}
	}
	
}
