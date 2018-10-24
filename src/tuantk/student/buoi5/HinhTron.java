package tuantk.student.buoi5;

public class HinhTron extends Shape {
	private float radius;
	private final float PI = 3.14f;

	public HinhTron() {
	};

	public HinhTron(int radius) {
		this.radius = radius;
	}

	@Override
	public void dienTich() {
		super.area = radius * radius * PI;
		System.out.println("Dien tich ht: " + area);
	}

	@Override
	public void chuVi() {
		super.p = 2 * radius * PI;
		System.out.println("Chu vi hinh tron: " + p);
	}
}
