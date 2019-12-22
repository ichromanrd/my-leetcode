/* WORKS! */

public class BuddyStrings2 {
	public static void main(String[] args) {
		String A = "ab", B = "ab";
		System.out.println(buddyStrings(A, B));
		
		boolean[] c = new boolean[2];
//		System.out.println(c[0]);
		
		char[] arr = new char[5];
		arr[2] = 'a';
		for (int ii = 0; ii < arr.length; ii++) {
			//System.out.print(arr[ii] + " ");
		}
	}
	
	// abadce
	// abadce
	
    public static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length()) return false;
		
		if (A.equals(B)) {
			char[] aArr = A.toCharArray();
			
			if (aArr.length == 0)
				return false;
			
			boolean[] check = new boolean[26];
			for (int ii = 0; ii < aArr.length; ii++) {
				if (ii + 1 == aArr.length - 1 && aArr[ii] == aArr[ii + 1]) 
					break;
				
				char c = aArr[ii];
				if (check[c - 'a'])
					break;
				check[c - 'a'] = (c - 'a' == 0);
				if (ii == aArr.length - 1)
					return false;
			}
		} else {
			int[] pIdx = new int[2];
			int idx = 0;
			int diffCount = 0;
			for (int ii = 0; ii < A.length(); ii++) {
				if (A.charAt(ii) != B.charAt(ii)) {
					diffCount++;
					if (diffCount > 2) 
						return false;
					pIdx[idx++] = ii;
				}
			}
			
			if (diffCount != 2) return false;
			char[] aArr = A.toCharArray();
			char temp = aArr[pIdx[0]];
			aArr[pIdx[0]] = aArr[pIdx[1]];
			aArr[pIdx[1]] = temp;
			
			if (!String.valueOf(aArr).equals(B))
				return false;
		}
		
		return true;
    }
}