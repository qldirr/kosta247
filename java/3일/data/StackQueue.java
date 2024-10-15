package kosta.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();//Stact 자료구조
		LinkedList<Integer> q = new LinkedList<Integer>();//Queue 자료구조
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println("---Stack----");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		
		System.out.println("---Queue----");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}






