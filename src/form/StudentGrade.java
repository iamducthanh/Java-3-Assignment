package form;

public class StudentGrade {
	String maSV;
	String hoTen;
	double tiengAnh;
	double tinHoc;
	double GDTC;
	
	public StudentGrade(String maSV, String hoTen, double tiengAnh, double tinHoc, double gDTC) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.tiengAnh = tiengAnh;
		this.tinHoc = tinHoc;
		GDTC = gDTC;
	}
	
	public double getDTB() {
		return (tiengAnh + tinHoc + GDTC) / 3;
	}
}
