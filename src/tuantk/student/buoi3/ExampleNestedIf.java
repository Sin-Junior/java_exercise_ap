package tuantk.student.buoi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleNestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "Hello";
		
		List<String> arr = new ArrayList<>();
		arr.add(str);
		arr.add("123");
		// for(type var: list) dung de in ra tung phan tu (not tung chi so o nho)
		for(String once: arr) {
			System.out.println(once);
		}
	}
}
