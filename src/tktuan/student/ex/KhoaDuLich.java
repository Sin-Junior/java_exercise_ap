package tktuan.student.ex;

public class KhoaDuLich extends Khoa {

	private boolean engLish;

	public KhoaDuLich(int maKhoa, String ten) {
		super(maKhoa, ten);
	}

	public KhoaDuLich(int maKhoa, String ten, boolean engLish) {
		super(maKhoa, ten);
		this.engLish = engLish;
	}

	public boolean isEngLish() {
		return engLish;
	}

	public void setEngLish(boolean engLish) {
		this.engLish = engLish;
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Biet tieng Anh: " + isEngLish());
	}

}
