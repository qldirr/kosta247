package kosta.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamList {

	public static void main(String[] args) {
		//함수형으로 List 구현
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i=0;i<10;i++) {
//			list.add(i);
//		}
//		
//		list.forEach(i -> System.out.print(i + ", "));
		
		//Stream을 이용한 List 구현
		String arr[] = {"aa", "cc", "bb"};
		List<String> list = Arrays.asList(arr);// array => List
		
		Stream<String> stream1 = Arrays.stream(arr);
		Stream<String> stream2 = list.stream();
		
		stream1.sorted().forEach(System.out::println);
		stream2.sorted().forEach(System.out::println);

	}

}







