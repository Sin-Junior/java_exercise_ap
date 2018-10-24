package tktuan.student.ex;

public class SinhVien {
	private int maSV;
	private String ten;
	private Khoa khoa;
	private String hocLuc;

	public SinhVien() {
	}
	
	public SinhVien(int maSV, String ten, Khoa khoa, String hocLuc) {
		this.maSV = maSV;
		this.ten = ten;
		this.khoa = khoa;
		this.hocLuc = hocLuc;
	}
	
	public void dangKyHocTiengNhat() {
		if ("Gioi".equals(getHocLuc()) && getKhoa() instanceof KhoaCNTT) {
			DangKyHocTiengNhat register = new DangKyHocTiengNhat() {
				@Override
				public void hocTiengNhat() {
					System.out.println("Tui la hoc sinh gioi, tui duoc hoc tieng nhat mien phi.");
				}
			};
			register.hocTiengNhat();
		}
	}
	
	public void thongTinSinhVien() {
		System.out.println("__Thong tin sinh vien");
		System.out.println("Ten: " + getTen());
		System.out.println("Ma: " + getMaSV());
		System.out.println("Hoc luc: " + getHocLuc());
		getKhoa().hienThiTT();
		
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	public String getHocLuc() {
		return hocLuc;
	}

	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}
	
	
}
