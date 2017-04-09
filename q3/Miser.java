/*! Type of a Boys */
public class Miser extends Boys {
/* Function which calculates happiness of Miser boys */
	double happyness(Girls gl, double sum, double happy_girl)
	{
		double happy;
		happy = this.budget - sum;
		return happy;
	}
}