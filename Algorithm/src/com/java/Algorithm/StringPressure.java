package com.java.Algorithm;

public class StringPressure {
	public int solution(String s) {
		StringBuilder prevStr = new StringBuilder();
		StringBuilder answerStr = new StringBuilder();
		StringBuilder key = new StringBuilder();
		int presure = 0;
		int answer = 9999;
		int length = (int)Math.ceil((double)s.length() / 2);
		int begin = 0;
		int lastIndex = 0;

		for(int i = 1; i <= length; i++) { // 자를 자릿수
			System.out.println(i);
			answerStr.delete(0, answerStr.length());
			prevStr.delete(0, prevStr.length());
			presure = 0;
			
			for(int j = 0; j < Math.ceil((double)s.length() / i) + 1; j++) { // 시작점
				begin = j * i;
				lastIndex = begin + i;
				if(lastIndex > s.length()) lastIndex = s.length();
				
				key.delete(0, key.length());
				if(j == (int)Math.ceil((double)s.length() / i)) {
					key = key.append("//");
				} else {
					key = key.append(s.substring(begin, lastIndex));					
				}
				
				
				if(prevStr.length() == 0) prevStr.append(key);
				
				if(prevStr.toString().equals(key.toString())) {
					presure++;
				} else {
					if(presure > 1) {
						answerStr.append(presure);
						answerStr.append(prevStr);
					} else {
						answerStr.append(prevStr);
					}
					
					prevStr.delete(0, prevStr.length());
					prevStr.append(key);
					presure = 1;
				}
			}
			
			if(answer > answerStr.length()) {
				answer = answerStr.length();
			}
		}
		return answer;
	}
}

//public int solution(String s) {
//	StringBuilder str = new StringBuilder();
//	StringBuilder key = new StringBuilder();
//	int presure = 0; 
//	int answer = 9999;
//	
//	for(int i = 1; i < s.length(); i++) {
//		str.delete(0, str.length());
//		key.delete(0, key.length());
//		
//		key.append(s.substring(0, i));
//		String[] count = s.split(s.substring(0, i));
//
//		for(int j = 0; j < count.length; j++) {
//			if(count[j].length() > 0) {
//				if(presure > 1) {
//					str.append(presure);
//				}
//
//				str.append(key);
//				str.append(count[j]);
//				presure = 0;
//			} else {
//				presure++;
//			}
//		}
//		if(answer > str.length()) answer = str.length();
//		System.out.println(str + " " + answer);
//	}
//	
//	return answer;
//}
