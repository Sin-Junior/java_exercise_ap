package tktuan.student.zoo;

public abstract class DVAnCo extends Animal implements TamRua {
	
	public DVAnCo(String ten, int code) {
		super(ten, code);
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		canChoAn();
		canTamRua();
	}
	
	@Override
	public void canChoAn() {
		System.out.println("Gio cho an: " + EatTimeEnum.eight);
	}
	
	@Override
	public void canTamRua() {
		System.out.println(getTen() + " can duoc tam rua.");
	}
}
