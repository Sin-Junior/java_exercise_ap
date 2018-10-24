package tuantk.student.buoi2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class decisionMask {
	
	public static void checkNumber(int num) {
		if(num%2==0) {
			System.out.println(num + " la so chan");
		} else {
			System.out.println(num + " la so le");
		}
	}
	
	public static String checkPerson(String ps) {
		if(ps.equals("sinh vien")) { // ps == "sinh vien"
			return "Sinh vien";
		}
		else if(ps.equals("nhan vien")) {
			return "Nhan vien";
		}
		return "nguoi la.";
	}
	
	public static String checkPersonHello(String ps) {
		if(ps.equals("sinh vien") || ps.equals("nhan vien")) { // ps == "sinh vien"
			return "Xin chao!!";
		}
		return "nguoi la.";
	}
	
	
	/**
	 * CheckNum()
	 * kiem tra so nhap vao la chan hay le
	 * 
	 * @param number
	 * 
	 * @return
	 * @true chan
	 * @false le
	 * 
	 * 
	 */
	public static boolean CheckNum(int number) {
		int check = number%2;
		switch(check) {
		case 0:
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Check job
		System.out.println("Nhan cong viec: ");
		String cv = scanner.nextLine();
		System.out.println("Ban la: " +checkPerson(cv));
		System.out.println(checkPersonHello(cv));
		
		// Kiem tra thu::
		System.out.println("Nhap vao mot so: ");
		int n = scanner.nextInt();
		
		checkNumber(n);
		// if..else
		if(n == 2) {
			System.out.println("Thu 2");
		} else if(n == 3) {
			System.out.println("Thu 3");
		} else if(n == 4) {
			System.out.println("Thu 4");
		} else if(n == 5) {
			System.out.println("Thu 5");
		} else if(n == 6) {
			System.out.println("Thu 6");
		} else if(n == 7) {
			System.out.println("Thu 7");
		} else if(n == 8) {
			System.out.println("Chu nhat");
		} else {
			System.out.println("Bo tay");
		}
		
		//
		int check = n%2;
		switch(check) {
		case 1:
			System.out.println(n + " la so le.");
			break;
		default:
			System.out.println(n + " la so chan.");
			break;
		}
		
		// Switch
		
		switch(n) {
		case 2: 
			System.out.println("Thu 2");
			break;
		case 3: 
			System.out.println("Thu 3");
			break;
		case 4: 
			System.out.println("Thu 4");
			break;
		case 5: 
			System.out.println("Thu 5");
			break;
		case 6: 
			System.out.println("Thu 6");
			break;
		case 7: 
			System.out.println("Thu 7");
			break;
		case 8: 
			System.out.println("Chu nhat");
			break;
		default:
			System.out.println("Bo tay");
			break;
		}
	}

}
