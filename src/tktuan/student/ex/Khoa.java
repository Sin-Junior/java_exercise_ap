package tktuan.student.ex;

public abstract class Khoa {
	private String ten;
	private int maKhoa;
	
	public Khoa(int maKhoa, String ten) {
		this.ten = ten;
		this.maKhoa = maKhoa;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMaKhoa() {
		return maKhoa;
	}
	public void setMaKhoa(int maKhoa) {
		this.maKhoa = maKhoa;
	}
	
	public void hienThiTT() {
		System.out.println("____Thong tin Khoa");
		System.out.println("Ten khoa: " + ten);
		System.out.println("Ma khoa: " + maKhoa);
	}
}
