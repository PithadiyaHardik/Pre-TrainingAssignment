package issassignment.java.Collections;

public class Marks {
	int english;
	int maths;
	int hindi;
	int socialScience;
	int science;
	public Marks(int english, int maths, int hindi, int socialScience, int science) {
		super();
		this.english = english;
		this.maths = maths;
		this.hindi = hindi;
		this.socialScience = socialScience;
		this.science = science;
	}
	@Override
	public String toString() {
		return "Marks [english=" + english + ", maths=" + maths + ", hindi=" + hindi + ", socialScience="
				+ socialScience + ", science=" + science + "]";
	}
	

}
