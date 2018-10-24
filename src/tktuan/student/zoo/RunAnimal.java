package tktuan.student.zoo;

import java.util.ArrayList;
import java.util.List;

public class RunAnimal {

	public static void main(String[] args) {
		List<Animal> soThu = new ArrayList<>();
		
		Cho choCon = new Cho("Cho con", 1, 3);
		Ngua ngua = new Ngua("Ngua bach", 2);
		SuTu st = new SuTu("Su tu bo", 3);
		
		soThu.add(choCon);
		soThu.add(ngua);
		soThu.add(st);
		
		for(Animal dongVat : soThu) {
			dongVat.hienThiTT();
			if(dongVat instanceof Cho || dongVat instanceof Ngua) {
				ChupHinh chup = new ChupHinh() {
					
					@Override
					public void coTheChupHinh() {
						System.out.println("Ban co the chup hinh voi " + dongVat.getTen());
					}
				};
				chup.coTheChupHinh();
			}
			enterLine();
		}
	}
	
	public static void enterLine() {
		System.out.println("\n");
	}

}
