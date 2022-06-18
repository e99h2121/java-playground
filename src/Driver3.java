import java.util.Arrays;
import java.util.HashSet;

/**
 * C:\git\java-playground\src> java Driver1.java 1 1
 */
public class Driver3 {

    public static void main(String[] args ) throws Exception { 
        // args= new String[5];
        // args[0] = "a";
        // args[1] = "b";
        // String token1 = args[0];
        // String token2 = args[1];
		// System.out.println(solution(new int[] { 1 }));
		// System.out.println(solution(new int[] { 10 }));
		// System.out.println(solution(new int[] { 11 }));
		// System.out.println(solution(new int[] { 12 }));
		
		System.out.println ( solution (new int[] {1041})); // 2進数
		System.out.println ( solution (new int[] {15})); // 2進数
		System.out.println ( solution (new int[] {32})); // 2進数

  }
    public static int solution(int A, int B, int C) {
		HashSet<Integer> answer = new HashSet<Integer>();
		for (int i = 0; i < B-A; i++) {
			if (i%C ==0) {
				answer.add(i);
			}
		}
		return answer.size();		
	}

  // Time: O(N)
	// Space: O(N)
	// 100/100 baby! elhamdolelah
	public static int solution(int[] A) {
		HashSet<Integer> result = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (result.contains(A[i])) {
				continue;
			}
			result.add(A[i]);
		}
		return result.size();
	}
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int len = 0;
        int ret = 0;
        len = A.length;
        for (int i = 0; i < len; i++) {
            if (X >= A[i]) {
	    		ret = i;
    	    }
        }
        return ret-1;
    }
}
