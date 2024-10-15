package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		list.add("사과");//get(0)
		list.add("포도");//get(1)
		list.add("수박");//get(2)
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//Iterator(List, Map, Set)
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}









