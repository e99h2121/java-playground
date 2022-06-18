import java.util.Arrays;
import java.util.HashSet;

/**
 * C:\git\java-playground\src> java Driver1.java 1 1
 */
public class Driver2 {

    public static void main(String[] args ) throws Exception { 
        // args= new String[5];
        // args[0] = "a";
        // args[1] = "b";
        // String token1 = args[0];
        // String token2 = args[1];
		System.out.println(solution(new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println(solution(new int[] { 1, 3, 1, 4, 5, 3, 2, 5 }));
		System.out.println(solution(new int[] { 1, 3, 1, 4, 5, 3, 5, 2 }));
		System.out.println(solution(new int[] { 1, 1, 1, 2 }));
		System.out.println(solution(new int[] { 10, 2, 5, 6, 7, 1, 3, 4, 7, 9, 8, 10, 9, 10, 10 }));
		System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 }));

    }
	// Time: O(N)
	// Space: O(N)
	// 100/100 baby! elhamdolelah
	public static int solution(int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> seen = new HashSet<Integer>();
		int min = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) seen.add(A[i]);
		}
		
		for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
			if(!seen.contains(i)) return i;
		}

		return min;
	}
}
