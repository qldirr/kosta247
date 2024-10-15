package kosta.di;

public class WriteService implements Service {
	private Dao dao;
	
	public WriteService() {}	

	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		dao.insertBoard();
	}

}
