package buoi1;

import java.util.Scanner;

public class NhanVien extends ConNguoi {
	private String cty;

	public NhanVien() {}
	public NhanVien(String ten, int tuoi, String cty) {
		super(ten,tuoi);
		this.cty = cty;
	}
	
	public void setCty(String cty) {
		this.cty = cty;
	}
	
	public String getCty() {
		return cty;
	}
	
	public void displayInfo(String ten, int tuoi) {
		super.displayInfo(ten, tuoi);
		System.out.println("Cong ty: " + cty);
	}
	public void displayInfo(String ten, int tuoi, String cty) {
		super.displayInfo(ten, tuoi);
		System.out.println("Cong ty: " + cty);
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cong ty: ");
		String cty = scanner.nextLine();
		displayInfo(super.getTen(), super.getTuoi(),cty);
	}
}
