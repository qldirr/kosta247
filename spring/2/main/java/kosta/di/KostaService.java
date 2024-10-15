package kosta.di;

import org.springframework.stereotype.Service;

@Service
public class KostaService implements Kosta{

	public void insertService() {
		System.out.println("kosta insertService() 호출");
	}

	public void listService() {
		System.out.println("kosta listService() 호출");		
	}

}
