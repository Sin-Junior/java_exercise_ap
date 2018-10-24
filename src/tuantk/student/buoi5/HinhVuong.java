package tuantk.student.buoi5;

public class HinhVuong extends Shape {

	private int canh;

	public HinhVuong() {
	}

	public HinhVuong(int canh) {
		this.canh = canh;
	}

	@Override
	public void dienTich() {
		super.area = canh * canh;
		System.out.println("Dien tich hv: " + area);
	}

	@Override
	public void chuVi() {
		super.p = 4 * canh;
		System.out.println("Chu vi hv: " + p);
	}
}
