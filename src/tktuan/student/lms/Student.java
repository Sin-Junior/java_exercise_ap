package tktuan.student.lms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private int maSV;
	private String ten;
	private String dateOfBirth;
	private float mark1;
	private float mark2;
	private float mark3;
	
	private List<Attendance> Attendances = new ArrayList<>();
	
	public Student() {
		
	}
	
	public Student(int maSV, String ten, String dateOfBirth, float mark1, float mark2, float mark3) {
		this.maSV = maSV;
		this.ten = ten;
		this.dateOfBirth = dateOfBirth;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public float getAverageMark() {
		return (getMark1() + getMark2() + getMark3()) / 3;
	}
	
	public float getAverageMark(float mark1, float mark2, float mark3) {
		return (mark1 + mark2 + mark3) / 3;
	}
	
	public String getLevel() {
		if(getAverageMark() >= 8) {
			return "A";
		} else if(getAverageMark() >= 7) {
			return "B";
		} else if(getAverageMark() >= 5) {
			return "C";		
		}
		return "D";
	}
	
	public void checkIn(SubjectNameEnum subjectName) {
		Attendance attendance = new Attendance();
		attendance.setSubjectName(subjectName.toString());
		attendance.setAttendanceDate(new Date());
		attendance.setStatus(AttendanceStatusEnum.Late.toString());
		
	}
	
	public void checkIn(SubjectNameEnum subjectName, Date date) {
		Attendance attendance = new Attendance();
		attendance.setSubjectName(subjectName.toString());
		attendance.setAttendanceDate(date);
		attendance.setStatus(AttendanceStatusEnum.Present.toString());
	}
	
	public void checkIn(SubjectNameEnum subjectName, String statusVang) {
		Attendance attendance = new Attendance();
		attendance.setSubjectName(subjectName.toString());
		attendance.setAttendanceDate(new Date());
		if(AttendanceStatusEnum.Absence.toString().equals(statusVang)) {
			attendance.setStatus(AttendanceStatusEnum.Absence.toString());
		} else {
			attendance.setStatus(AttendanceStatusEnum.Allowed.toString());
		}
		
	}
	
	public void printAttendance() {
		for(Attendance attendance : Attendances) {
			System.out.println("Subject: " + attendance.getSubjectName());
			System.out.println("Date: " + attendance.getAttendanceDate());
			System.out.println("Status: " + attendance.getStatus());
		}
	}
	
	public void printInfoStudent() {
		System.out.println("_____Student's Information: ");
		System.out.println("Ma SV: " + getMaSV());
		System.out.println("Ten: " + getTen());
		System.out.println("Ngay sinh: " + getDateOfBirth());
		System.out.println("Mark 1: " + getMark1());
		System.out.println("Mark 2: " + getMark2());
		System.out.println("Mark 3: " + getMark3());
		System.out.println("Diem trung binh: " + getAverageMark());
		System.out.println("Xep loai: " + getLevel());
		printAttendance();
	}
	
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getMark1() {
		return mark1;
	}

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

	public float getMark2() {
		return mark2;
	}

	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}

	public float getMark3() {
		return mark3;
	}

	public void setMark3(float mark3) {
		this.mark3 = mark3;
	}
	
	
}
