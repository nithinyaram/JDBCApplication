import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	Connection con;
	Statement stmt;

	public CreateTable(Connection con, Statement stmt) {
		this.con = con;
		this.stmt=stmt;
	}

	public void CreateTable() throws SQLException {
		String sql= 
				"CREATE TABLE STUDENT(" + 
				"	ID INT IDENTITY(1,1) PRIMARY KEY," + 
				"	NAME VARCHAR(50)," + 
				"	COLLEGE VARCHAR(50)," + 
				"	BRANCH VARCHAR(50)," + 
				")" + 
				";";
		stmt.executeUpdate(sql);
	}
	

}
