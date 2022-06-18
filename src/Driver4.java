import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * C:\git\java-playground\src> java Driver1.java 1 1
 */
public class Driver4 {

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
		
		// System.out.println ( solution (new int[] {1041})); // 2進数
		// System.out.println ( solution (new int[] {15})); // 2進数
		// System.out.println ( solution (new int[] {32})); // 2進数
		System.out.println(solution(10, 4));

  }
	// Time: O(N)
	// Space: O(N)
	// 100/100 baby! elhamdolelah
	public static int solution(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			map.putIfAbsent(Integer.valueOf(A[i]), Integer.valueOf(1));
			if (map.containsKey(A[i])) {
				int current = map.get(A[i]);
				current++;
				map.replace(A[i], current);
			}
		}
		return map.size();
	}
	/**
	 * gcd http://codility-lessons-jp.blogspot.com/2015/03/lesson-10-chocolatesbynumbers.html
	 * @param N
	 * @param M
	 * @return
	 */
	public static int solution(int N, int M) {
		N = 10; 
		M = 4;
		int count = 0;
		int current = 0;
		int mod = 1;
		while (mod != 0) {
			mod = current%M;
			count++;
			current = current + M;
		}
		for (int i = 0; i < 10-1; i++) {
			if (i%M == 0) {
				count++;
			}
		}
		return count;
	}
}
