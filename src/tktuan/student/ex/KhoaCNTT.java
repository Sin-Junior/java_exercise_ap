package tktuan.student.ex;

public class KhoaCNTT extends Khoa implements NgayHoiIT{
	
	private String chungChiIT;
	
	public KhoaCNTT(int maKhoa, String ten) {
		super(maKhoa, ten);
	}
	
	public KhoaCNTT(int maKhoa, String ten, String chungChiIT) {
		super(maKhoa, ten);
		this.chungChiIT = chungChiIT;
	}

	public String getChungChiIT() {
		return chungChiIT;
	}

	public void setChungChiIT(String chungChiIT) {
		this.chungChiIT = chungChiIT;
	}
	
	@Override
	public void joinNgayHoiIT() {
		System.out.println("Tui la sinh vien khoa CNTT, tui co the tham gia ngay hoi IT.");
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Chung chi IT: " + getChungChiIT());
		joinNgayHoiIT();
	}
	
}
