package tktuan.student.zoo;

public abstract class Animal implements ChoAn{
	protected String ten;
	private int code;
	
	public Animal(String ten, int code) {
		this.ten = ten;
		this.code = code;
	}
	
	public void hienThiTT() {
		System.out.println("___Dong vat:");
		System.out.println("Ten: " + getTen());
		System.out.println("Ma: " + getCode());
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
