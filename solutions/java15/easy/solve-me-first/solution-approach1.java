// ──────────────────────────────────────────────────
// Problem     Solve Me First
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-06-04, 04:44 p.m.
// Technique   arithmetic-summation
// Time        O(1)
// Space       O(1)
// Trick       Perform a direct integer addition of two inputs using the plus operator to return the sum immediately.
// Hint        Use Scanner for standard input reading.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below 
      return a+b;
	}

  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}
