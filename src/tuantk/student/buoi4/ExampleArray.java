package tuantk.student.buoi4;

import java.util.Scanner;

public class ExampleArray {

	public static void nhapMang(int arr[], int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + " :");
			arr[i] = sc.nextInt();
		}
	}
	
	public static void inMang(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}
	
	public static void inPhanTuChan(int arr[]) {
		boolean flagChan = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				if(!flagChan) {
					System.out.println("Vi tri: " + i);
				}
				System.out.print(arr[i] + "\t");
			}
		}
	}
	
	public static int inViTriPTChan(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		int n = 10;
		
		System.out.println("Nhap gia tri cho mang: \n");
		nhapMang(arr, n);
		
		System.out.println("Cac phan tu chan trong mang:");
		inPhanTuChan(arr);
		
		if(inViTriPTChan(arr) >= 0) {
			System.out.println("\nVi tri cac phan tu chan dau tien: " + inViTriPTChan(arr));
		}
		
	}

}
