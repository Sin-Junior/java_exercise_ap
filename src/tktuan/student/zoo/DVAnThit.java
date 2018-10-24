package tktuan.student.zoo;

public abstract class DVAnThit extends Animal {
	
	public DVAnThit(String ten, int code) {
		super(ten, code);
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		canChoAn();
	}
	
	@Override
	public void canChoAn() {
		System.out.println("Gio cho an: " + EatTimeEnum.ten);
	}
	
}
