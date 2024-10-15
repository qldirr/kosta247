package kosta.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
//		서울특별시 마포구에 사는 사람은 1명
//		부산광역시 동구에 사는 사람은 2명
//		서울특별시 중랑구에 사는 사람은 2명
//		서울특별시 노원구에 사는 사람은 1명
//		인천광역시 남동구에 사는 사람은 1명
//		경기도 구리시에 사는 사람은 1명
//		서울 중랑구에 사는 사람은 1명
//		서울특별시 구로구에 사는 사람은 1명
//		충청남도 예산군에 사는 사람은 1명
//		충청남도 천안시에 사는 사람은 1명
//		충청남도 당진시에 사는 사람은 1명
		
		String reg = "((([가-힣]+(시|도))|서울|부산|대구)\\s[가-힣]+(시|구|군))";
		//~시에 살거나 서울, 인천, 대구, 광주, 부산, 울산 의 주소를 가지고 뒤쪽에 시, 군,구 로 끝나는 부분을
		Map<String, Integer> map = new HashMap<String, Integer>();
		//키워드와 갯수를 가지는 리스트에
		String[] addresses = { "서울특별시 중랑구 공릉로 13길 27", "서울특별시 중랑구 겸재로 68 (면목동)",
				"서울특별시 노원구 공릉로 95 (공릉동)",
				"서울특별시 구로구 가마산로 77 (구로동)", "서울특별시 마포구 가양대로 1 (상암동)",
				"충청남도 천안시 동남구 성남면 5산단1로 22",
				"부산광역시 동구 고관로 5 (초량동)", "인천광역시 남동구 간석로 2 (간석동)",
				"충청남도 예산군 신암면 오신로 852-2", "충청남도 당진시 우강면 박원로 138",
				"부산광역시 동구 중앙대로 243-13 (초량동)", "경기도 구리시 동구릉로136번길 47 (인창동)",
				"서울 중랑구 공릉로 13길 27" };		
		
		Pattern p = Pattern.compile(reg);
		for (String address : addresses) {
			Matcher m = p.matcher(address);
			if (m.find())
				map.put(m.group(), map.getOrDefault(m.group(), 0) + 1);
		}

		for (Entry<String, Integer> s : map.entrySet())
			System.out.println(s.getKey() + "에 사는 사람은 " + s.getValue() + "명");

	}

}
