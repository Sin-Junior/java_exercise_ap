package tktuan.student.test;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// if have exception in 'catch'. Program will stop
//		try {
//			System.out.println(5/0);
//		} catch(Exception e) {
//			System.out.println(5/0);
//		} finally {
//			System.out.println("finally");
//		}
		
		check();

	}
	
	public static void check() {
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a = sc.nextInt();
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		try {
			c = a/b;
			System.out.println((float)a/b);
		} catch (ArithmeticException e) {
			System.out.println("Ban da nhap loi: " + e.getMessage());
			System.out.println("Vui long nhap lai>");
			check();
		}
	}

}
