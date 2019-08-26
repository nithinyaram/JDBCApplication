import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	Connection con;
	Statement stmt;

	public Delete(Connection con, Statement stmt) {
		this.con = con;
		this.stmt = stmt;
	}

	public void DeleteRecord() throws SQLException {
		String sql="Delete from STUDENT where id=3";
		stmt.executeUpdate(sql);
	}

}
