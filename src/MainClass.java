import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws Exception {
		CreateTable create;
		Insertion insert;
		Delete delete;
		Update update;
		PrintRecords print;
		ByPreparedStatementE pred;
		Connection con = DriverManager.getConnection("jdbc:sqlserver://ggku2ser6;databaseName=NithinJava", "Nithin",
				"nithin@123");
		Statement stmt = con.createStatement();
		boolean Continue = false;
		do {
			System.out.println("1.Create Table");
			System.out.println("2.Insert Record");
			System.out.println("3.Delete Record");
			System.out.println("4.Update Record");
			System.out.println("5.Select Records");
			System.out.println("6.Prepared Statement");
			Scanner in = new Scanner(System.in);
			int Choice = in.nextInt();
			Continue=false;

			switch (Choice) {
			case 1:
				create = new CreateTable(con, stmt);
				create.CreateTable();
				break;
			case 2:
				insert = new Insertion(con, stmt);
				insert.InsertValues();
				break;
			case 3:
				delete = new Delete(con, stmt);
				delete.DeleteRecord();
				break;
			case 4:
				update = new Update(con, stmt);
				update.UpdateValues();
				break;
			case 5:
				print = new PrintRecords(con, stmt);
				print.Print();
				break;
			case 6:
				pred=new ByPreparedStatementE(con);
				pred.Create();
				break;
			default:
				System.out.println("enter Correct Choice");
			}
			System.out.println("Do u want to Continue(y/n)");
			char ch = in.next().charAt(0);
			if (ch == 'y') {
				Continue = true;
			}
		} while (Continue);
	}
}
