package tuantk.student.buoi5;

public class RunShape {

	public static void main(String[] args) {
//		HinhVuong hv = new HinhVuong(5);
//		hv.chuVi();
//		hv.dienTich();
//		
//		HinhChuNhat hcn = new HinhChuNhat(7,3);
//		hcn.chuVi();
//		hcn.dienTich();
//		
//		HinhTamGiac htg = new HinhTamGiac();
//		htg.setCanhDay(3);
//		htg.setCanhMot(4);
//		htg.setCanhHai(5);
//		htg.setChieuCao(4);
//		htg.chuVi();
//		htg.dienTich();
		
		
		Shape hh = new HinhVuong(5);
		hh.chuVi();
		hh.dienTich();
		
		Shape shape = new Shape() {

			@Override
			public void dienTich() {
				System.out.println("Dien tich: " + 3);
			}

			@Override
			public void chuVi() {
				System.out.println("Chu vi: " + 2);
			}
			
		};
		
		shape.chuVi();
		shape.dienTich();
	}

}
