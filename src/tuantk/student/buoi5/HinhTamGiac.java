package tuantk.student.buoi5;

public class HinhTamGiac extends Shape {
	private float chieuCao;
	private float canhDay;
	private float canhMot;
	private float canhHai;

	public HinhTamGiac() {
	};

	public HinhTamGiac(float canhMot, float canhHai, float canhDay) {
		this.canhMot = canhMot;
		this.canhHai = canhHai;
		this.canhDay = canhDay;
	}

	public HinhTamGiac(float chieuCao, float canhDay) {
		this.chieuCao = chieuCao;
		this.canhDay = canhDay;
	}

	@Override
	public void dienTich() {
		super.area = (float) 0.5 * canhDay * chieuCao;
		System.out.println("Dien tich htg: " + area);
	}

	@Override
	public void chuVi() {
		super.p = canhMot + canhHai + canhDay;
		System.out.println("Chu vi htg: " + p);
	}

	public float getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(float chieuCao) {
		this.chieuCao = chieuCao;
	}

	public float getCanhDay() {
		return canhDay;
	}

	public void setCanhDay(float canhDay) {
		this.canhDay = canhDay;
	}

	public float getCanhMot() {
		return canhMot;
	}

	public void setCanhMot(float canhMot) {
		this.canhMot = canhMot;
	}

	public float getCanhHai() {
		return canhHai;
	}

	public void setCanhHai(float canhHai) {
		this.canhHai = canhHai;
	}
}
