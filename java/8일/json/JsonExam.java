package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExam {
	//{"address":"가산","name":"홍길동","age":20}
	public JSONObject createJson() {
		JSONObject obj = new JSONObject();
		obj.put("name", "홍길동");
		obj.put("address", "가산");
		obj.put("age", 20);
		
		return obj;
	}
	
	public JSONObject createJson2() {
		JSONObject obj = new JSONObject();
		obj.put("name", "박길동");
		obj.put("address", "강남");
		obj.put("age", 30);
		
		return obj;
	}

	public static void main(String[] args) {
		//JSONObject => Json문자열
		JsonExam e = new JsonExam();
		
		JSONObject obj = e.createJson();
		JSONObject obj2 = e.createJson2();
		//System.out.println(obj.toJSONString());
		
		//[{"address":"가산","name":"홍길동","age":20},{"address":"강남","name":"박길동","age":30}]
		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(obj2);
		//System.out.println(ja.toJSONString());
		
		//List<Member> => Json문자열 변환
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍기동", "독산", 50));
		list.add(new Member("김기동", "광명", 40));
		
		//[{"address":"독산","age":50,"name":"홍기동"},{"address":"광명","age":40,"name":"김기동"}]
		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();
		//System.out.println(jsonCode);
		
		//json문자열 ==> 자바객체
		JSONParser parser = new JSONParser();
		Object re = null;		
		
		try {
			re = parser.parse(jsonCode);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		//Object => JSONArray => Iterator => JSONObject => Member
				
		if(re instanceof JSONArray) {
			JSONArray array = (JSONArray)re;
			Iterator iter = array.iterator();
			List<Member> list2 = new ArrayList<Member>();
			
			while(iter.hasNext()) {
				JSONObject jo = (JSONObject)iter.next();
				String name = (String)jo.get("name");
				String address = (String)jo.get("address");
				int age = ((Long)jo.get("age")).intValue();
				
				list2.add(new Member(name, address, age));
			}
			System.out.println(list2);
		}

	}

}







