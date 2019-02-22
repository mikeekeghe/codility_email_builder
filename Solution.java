package codility;

import java.awt.List;
import java.util.ArrayList;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String myAnswer = solution("John Charles Doe; John Smith; Sandra Bullock; Peter Parker; John Doe; John James Doe; Mary Jane Watson-Parker", "example");
		String myAnswer = solution("John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker", "Example");
		System.out.println("solution is : " +myAnswer);

	}

	public static String solution(String S, String C) {
		String finlString = "", lastValue = "",newString = "";
		String[] newArrayOfNames2 = null;
		String[] staffNames = null;
		ArrayList<String> list1 = new ArrayList<String>();
		String strCount = "1";
		int intCount = 0;
		// split string s to get emails
		C = C.toLowerCase();

		S = S.toLowerCase();
		S = S.replace("-", "");
		S = S.replace("; ", "<seperator>");

		staffNames = S.split("<seperator>");
		for (int i = 0; i < staffNames.length; i++) {
			newString = staffNames[i];
			
			newArrayOfNames2 = newString.split(" ");
			// split each name to f mf l


			if (newArrayOfNames2.length > 2) {
		
				

				lastValue = newArrayOfNames2[2] + "_" + newArrayOfNames2[0];
				//--------------------


				if (list1.contains(lastValue)) {				
					
					intCount = Integer.parseInt(strCount);
					intCount++;
					strCount = String.valueOf(intCount);
					lastValue = lastValue + strCount;

				}
				
				list1.add(lastValue);


				//------------------
				lastValue = lastValue + "@" + C + ".com; ";
				
				strCount = "1";
				intCount = 1;
				finlString += lastValue;
			} else {
				lastValue = newArrayOfNames2[1] + "_" + newArrayOfNames2[0] ;
				//--------------------


				if (list1.contains(lastValue)) {				
					
					intCount = Integer.parseInt(strCount);
					intCount++;
					strCount = String.valueOf(intCount);
					lastValue = lastValue + strCount;

				}
				
				list1.add(lastValue);


				//------------------
				lastValue = lastValue + "@" + C + ".com; ";
				strCount = "1";
				intCount = 1;
				
				finlString += lastValue;
			}

		}

		return finlString;

	}
}
