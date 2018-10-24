package tktuan.student.zoo;

public class Cho extends ThuNuoi {
	private int tuoi;
	public Cho(String ten, int code, int tuoi) {
		super(ten, code);
		this.tuoi = tuoi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Tuoi: " + getTuoi());
		canChoAn();
		canTamRua();
	}
}
