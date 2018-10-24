package tuantk.student.exercise_p1;

public class KhoaNgoaiGiao extends School{
	private final String KHOA = "Khoa ngoai giao";
	private String ten;
	private int tuoi;
	
	public KhoaNgoaiGiao(String school, String ten, int tuoi) {
		super(school);
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	public void ungCuCongDoan() {
		System.out.println(ten + " vua dang ky ung cu Cong doan.");
	}
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Khoa: " + KHOA);
		System.out.println("Ten: " + ten);
		System.out.println("Tuoi: " + tuoi);
	}
}
