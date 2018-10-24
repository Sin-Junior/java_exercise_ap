package tktuan.student.ex;

public class KhoaNgoaiGiao extends Khoa implements UngCuCongDoan{
	
	private boolean engLish;
	private boolean french;
	
	public KhoaNgoaiGiao(int maKhoa, String ten) {
		super(maKhoa, ten);
	}
	
	public KhoaNgoaiGiao(int maKhoa, String ten, boolean engLish, boolean french) {
		super(maKhoa, ten);
		this.engLish = engLish;
		this.french = french;
	}
	
	public boolean isEngLish() {
		return engLish;
	}

	public void setEngLish(boolean engLish) {
		this.engLish = engLish;
	}

	public boolean isFrench() {
		return french;
	}

	public void setFrench(boolean french) {
		this.french = french;
	}

	@Override
	public void coTheUngCu() {
		System.out.println("Tui la sinh vien khoa ngoai giao, du dieu kien de ung cu.");
	}
	
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Biet tieng Anh: " + isEngLish());
		System.out.println("Biet tieng Phap: " + isFrench());
		coTheUngCu();
	}
}
