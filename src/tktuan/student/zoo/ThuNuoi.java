package tktuan.student.zoo;

public abstract class ThuNuoi extends Animal implements TamRua {
	
	public ThuNuoi(String ten, int code) {
		super(ten, code);
	}
	
	public void hienThiTT() {
		super.hienThiTT();
	}
	
	@Override
	public void canChoAn() {
		System.out.println("Gio cho an: " + EatTimeEnum.twelve);
	}
	
	@Override
	public void canTamRua() {
		System.out.println(getTen() + " can duoc tam rua.");
	}
	
}
