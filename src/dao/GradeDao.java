package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.StudentGrade;
import help.DataBaseConnection;

public class GradeDao {
	public static ArrayList<StudentGrade> loadGrade() throws ClassNotFoundException, SQLException{
		ArrayList<StudentGrade> listGrade = new ArrayList<StudentGrade>();
		Connection connection = DataBaseConnection.Connect();
		Statement statement = connection.createStatement();
		ResultSet tbGrade = statement.executeQuery("select * from Diem");
		while(tbGrade.next()) {
			String maSV = tbGrade.getString(1);
			double tiengAnh = tbGrade.getDouble(2);
			double tinHoc = tbGrade.getDouble(3);
			double GDTC = tbGrade.getDouble(4);
			listGrade.add(new StudentGrade(maSV, tiengAnh, tinHoc, GDTC));
		}
		connection.close();
		return listGrade;
	}
	
	public static void insertGrade(String maSV, String tiengAnh, String tinHoc, String GDTC) throws SQLException, ClassNotFoundException {
		Connection connection = DataBaseConnection.Connect();
		PreparedStatement insert = connection
				.prepareStatement("INSERT INTO Diem VALUES (?,?,?,?)");
		insert.setString(1, maSV);
		insert.setString(2, tiengAnh);
		insert.setString(3, tinHoc);
		insert.setString(4, GDTC);
		insert.execute();
		connection.close();
	}
}
