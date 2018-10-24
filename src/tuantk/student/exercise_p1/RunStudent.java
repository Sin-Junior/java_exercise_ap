package tuantk.student.exercise_p1;

public class RunStudent {

	public static void main(String[] args) {
		KhoaNgoaiGiao sv1 = new KhoaNgoaiGiao("Dai hoc Da Nang", "Tran Khac Tuan", 19);
		sv1.ungCuCongDoan();
		sv1.inThongTin();
		
		KhoaCNTTTT sv2 = new KhoaCNTTTT("Dai hoc Da Nang", "PX. T", 19);
		sv2.ngayHoiIT();
		sv2.inThongTin();
	}

}
