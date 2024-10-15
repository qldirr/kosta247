package kosta.oop3;

public class Main {

	public static void main(String[] args) {
		OracleDao dao1 = new OracleDao();
		MySQLDao dao2 = new MySQLDao();
		
		Service service = new Service(dao2);
		service.insertService();

	}

}
