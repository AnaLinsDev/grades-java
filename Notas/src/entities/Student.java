package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double finalGrade() {

		return n1 + n2 + n3;
	}

	public boolean result() {
		if (this.finalGrade() >= 60.0) {
			return true;
		}

		return false;
	}

	public double missingpoints() {
		if (this.finalGrade() < 60) {
			return 60 - this.finalGrade();
		}
		return 0;
	}

}
