package tktuan.student.ex;

public class KhoaTruyenThong extends Khoa implements NgayHoiIT{
	
	public String thietKe;
	
	public KhoaTruyenThong(int maKhoa, String ten) {
		super(maKhoa, ten);
	}
	
	public KhoaTruyenThong(int maKhoa, String ten, String thietKe) {
		super(maKhoa, ten);
		this.thietKe = thietKe;
	}
	
	@Override
	public void joinNgayHoiIT() {
		System.out.println("Tui la sinh vien khoa Truyen thong, tui co the tham gia ngay hoi IT.");
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Kha nang thiet ke: " + getThietKe());
		joinNgayHoiIT();
	}

	public String getThietKe() {
		return thietKe;
	}

	public void setThietKe(String thietKe) {
		this.thietKe = thietKe;
	}
	
}
