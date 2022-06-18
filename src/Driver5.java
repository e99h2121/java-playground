import java.util.Arrays;
import java.util.HashSet;

/**
 * C:\git\java-playground\src> java Driver1.java 1 1
 */
public class Driver5 {

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
	// Time: O(N)
	// Space: O(N)
	// 100/100 baby! elhamdolelah
	public static int solution(int[] A) {
		String binarystr = Integer.toBinaryString (A[0]);
		System.out.println(binarystr);
		int len = binarystr.length();
		int count = 0;
		int zantei = 0;
		for (int i = 0; i < len; i++) {
			//System.out.println(binarystr.substring(i, i+1));
			if (binarystr.substring(i, i+1).equals("0")) {
				count++;				
			} 
			else {
				if (zantei < count) {
					zantei = count;
					count = 0;
				}
			}
			if (i == len-1) {
				if (zantei < count) {
					zantei = count;
				}
			}
		}
		return zantei;
	}
}
