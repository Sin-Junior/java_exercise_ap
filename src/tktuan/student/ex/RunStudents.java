package tktuan.student.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RunStudents {

	public static void main(String[] args) {
		
		Khoa khoaCNTT = new KhoaCNTT(1, "Khoa Cong nghe thong tin", "Chua co");
		Khoa khoaNgoaiGiao = new KhoaNgoaiGiao(2, "Khoa Ngoai giao", false ,false);
		Khoa khoaDuLich = new KhoaDuLich(3, "Khoa Du lich", false);
		Khoa khoaTruyenThong = new KhoaTruyenThong(4, "Khoa Truyen thong", "Chua co");
		
		List<SinhVien> truongDN = new ArrayList<>();
		
		truongDN.add(new SinhVien(1, "Tran Khac Tuan", khoaCNTT, "Gioi"));
		truongDN.add(new SinhVien(2, "Hoang", khoaNgoaiGiao, "Gioi"));
		truongDN.add(new SinhVien(3, "Hieu", khoaDuLich, "Kha"));
		truongDN.add(new SinhVien(4, "Thinh", khoaTruyenThong, "Gioi"));
		
		for(SinhVien sinhVien : truongDN) {
			sinhVien.thongTinSinhVien();
			sinhVien.dangKyHocTiengNhat();
			nextLi();
		}
	}
	
	public static void nextLi() {
		System.out.println("\n");
	}

}
