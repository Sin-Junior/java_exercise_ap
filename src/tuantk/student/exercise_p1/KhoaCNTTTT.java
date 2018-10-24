package tuantk.student.exercise_p1;

public class KhoaCNTTTT extends School {
	
	private final String KHOA = "Khoa Cong nghe thong tin va Truyen thong";
	private String ten;
	private int tuoi;
	
	public KhoaCNTTTT(String school, String ten, int tuoi) {
		super(school);
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	public void ngayHoiIT() {
		System.out.println(ten + " dang tham gia ngay hoi IT");
	}
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Khoa: " + KHOA);
		System.out.println("Ten: " + ten);
		System.out.println("Tuoi: " + tuoi);
	}
}
