package tuantk.student.buoi4;

public class HinhChuNhat {
	
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat() {}
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public void hienThiTT() {
		System.out.println("Day la hinh chu nhat!!! \n");
		System.out.println("Chieu dai: " + chieuDai);
		System.out.println("Chieu rong: " + chieuRong);
	}
	
	public void hienThiTT(double chieuDai, double chieuRong) {
		System.out.println("Day la hinh chu nhat!!! \n");
		System.out.println("Chieu dai: " + chieuDai);
		System.out.println("Chieu rong: " + chieuRong);
	}
	
	public double tinhDienTich() {
		return chieuDai*chieuRong;
	}
	
	public double tinDienTich(double chieuDai, double chieuRong) {
		return chieuDai*chieuRong;
	}
	
	public double tinhChuVi() {
		return chieuDai*chieuRong;
	}
	
	public double tinChuVi(double chieuDai, double chieuRong) {
		return 2*chieuDai + 2*chieuRong;
	}
	
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	
	public double getChieuDai() {
		return chieuDai;
	}
	
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public double getChieuRong() {
		return chieuRong;
	}
	
//	public static void main(String[] a) {
//		HinhChuNhat hcn = new HinhChuNhat();
//		
//	}
}
