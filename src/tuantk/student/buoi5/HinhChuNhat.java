package tuantk.student.buoi5;

public class HinhChuNhat extends Shape {
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat() {
	};

	public HinhChuNhat(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public void dienTich() {
		area = chieuDai * chieuRong;
		System.out.println("Dien tich hcn: " + area);
	}

	@Override
	public void chuVi() {
		p = (chieuDai + chieuRong) * 2;
		System.out.println("Chu vi hcn: " + p);
	}
}
