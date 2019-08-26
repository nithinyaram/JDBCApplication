import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintRecords {
	Connection con;
	Statement stmt;
	ResultSet rs;

	public PrintRecords(Connection con, Statement stmt) {
		this.con = con;
		this.stmt = stmt;
	}

	public void Print() throws SQLException {
		String sql = "Select * from Student";
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  

		}
	}

}
