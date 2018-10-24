package buoi1;

import java.util.Scanner;

public class SinhVien extends ConNguoi {
	private String truong;
	
	public SinhVien(String ten, int tuoi, String truong) {
		super(ten, tuoi);
		this.truong = truong;
	}
	
	public void displayInfo(String ten, int tuoi, String truong) {
		super.displayInfo(ten, tuoi);
		System.out.println("Cong ty: " + truong);
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cong ty: ");
		String truong = scanner.nextLine();
		displayInfo(super.getTen(), super.getTuoi(),truong);
	}
}
