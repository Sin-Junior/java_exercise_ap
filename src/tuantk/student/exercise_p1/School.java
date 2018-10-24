package tuantk.student.exercise_p1;

public abstract class School {
	String school;
	
	public School(String school) {
		this.school = school;
	}
	
	public void inThongTin() {
		System.out.println("Truong: " + school);
	}
}
