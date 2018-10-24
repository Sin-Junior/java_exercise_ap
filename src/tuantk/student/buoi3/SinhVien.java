package tuantk.student.buoi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
	
	private String name;
	private String gender;
	private String phone;
	private String address;
	
	// Tao contructor khong tham so
	public SinhVien() {}
	
	// Contructor 4 tham so
	public SinhVien(String name, String gender, String phone, String address) {
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	// Bonus Nhap thong tin sinh vien
	public void insertInfoStudent() {
		System.out.println("Nhap thong tin cua ban  :))");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String name = scanner.nextLine();
		System.out.print("Nhap ten: ");
		String gender = scanner.nextLine();
		System.out.print("Nhap ten: ");
		String phone = scanner.nextLine();
		System.out.print("Nhap ten: ");
		String address = scanner.nextLine();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	// Hien thi thong tin sinh vien
	public void displayInfoStudent() {
		System.out.println("-----------------------------");
		System.out.println("Student's Information: ");
		System.out.println("Ten: " + name);
		System.out.println("Gioi tinh: " + gender);
		System.out.println("So dien thoai: " + phone);
		System.out.println("Dia chi: " + address);
		System.out.println("-----------------------------");
	}
	
	// Thay doi thong tin so dien thoai
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void editPhone() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dien thoai cua che: ");
		String phone = scanner.nextLine();
		setPhone(phone);
	}
	
	// In ra message Hello neu gioi tinh la nu
	public void sayHello() {
		if(this.gender.equals("nu")) {
			System.out.println("Hello baby");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public static boolean findNY(String addressOne, String addressTwo) {
		if(addressOne.equals(addressTwo))  {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SinhVien> arrSV = new ArrayList<>();
		SinhVien sv1 = new SinhVien();
		sv1.name = "Tuan";
		sv1.gender = "nam";
		sv1.phone = "0985204903";
		sv1.address = "DL";
		sv1.displayInfoStudent();
		sv1.sayHello();
		
		System.out.println("Ban muon thay doi sdt: ");
		System.out.println("1. Co");
		System.out.println("2. KO");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.nextLine();
		String phone = null;
		if(choice == 1) {
			sv1.editPhone();
		}
		
		sv1.displayInfoStudent();
		
		System.out.println("\n\n\n");
		
		SinhVien sv2 = new SinhVien("Ha", "nu", "01654845720", "GL");
		sv2.displayInfoStudent();
		sv2.sayHello();
		
		arrSV.add(sv1);
		arrSV.add(sv2);
//		System.out.println(arrSV.size() + "///");
		System.out.println("Nhap que ban muon tim nguoi yeu: ");
		String searchNY = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < arrSV.size(); i++ ) {
			
			if(findNY(searchNY,arrSV.get(i).getAddress()) == true) {
				System.out.println("\n\n");
				System.out.println("Da tim thay nguoi yeu!!");
				System.out.println("Ten: " + arrSV.get(i).getName());
				System.out.println("Gioi tinh: " + arrSV.get(i).getGender());
				System.out.println("SDT: " + arrSV.get(i).getPhone());
				System.out.println("Dia chi: " + arrSV.get(i).getAddress());
				
				break;
			}
			else {
				count ++;
			}
		}
		if(count == arrSV.size()) {
			System.out.println("Chua tim thay!");
		}	
	}
}
