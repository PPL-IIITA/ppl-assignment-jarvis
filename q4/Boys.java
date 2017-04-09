/*! Boys class */
public class Boys {
	String name;
	int intelligence;
	int attractivness;
	int min_attr_req;
	int budget;
	String girlf;
	String status;
	String boy_type;
	double happiness_boy;

/*! Function to check eligibility of Boys */
	boolean is_eligible(int expense,int attar){
		if (this.budget >= expense && this.min_attr_req <= attar && this.status.equals("Single")){
			return true;
		}else{
			return false;
		}
			
		}
/*! Function to calculate happiness of boy */
	
	void happiness(int value){
		
		this.happiness_boy = value;
}
	
	
	
		
	}
