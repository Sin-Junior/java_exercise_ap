package buoi1;

import java.util.Scanner;

public class ConNguoi {
	private String ten;
	private int tuoi;

	public ConNguoi() {}
	
	public ConNguoi(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	
	public void displayInfo(String ten, int tuoi) {
		System.out.println("Thong tin sinh vien:");
		System.out.println("Ten: " + ten);
		System.out.println("Tuoi: " + tuoi);
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten nhan vien: ");
		String ten = scanner.nextLine();
		
		System.out.println("Tuoi: ");
		int tuoi = scanner.nextInt();
		this.ten = ten;
		this.tuoi = tuoi;
		scanner.nextLine();
	}
}
