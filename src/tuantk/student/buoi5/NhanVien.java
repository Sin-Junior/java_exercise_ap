package tuantk.student.buoi5;

public abstract class NhanVien {
	private int code;
	private String ten;
	
	public abstract void congViec();
	
	public NhanVien(int code) {
		this.code = code;
	};
}
