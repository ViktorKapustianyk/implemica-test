package org.viktor_kapustianyk;

public class CatalanCalculator {
    public long calculatorCatalan(int n){
        if(n < 0){
            throw new IllegalArgumentException("N must be a non-negative integer.");
        }

        // Array to store Catalan numbers for 0 to N
        long[] catalan = new long[n +1];
        catalan[0] = 1; // Base case: C_0 = 1

        // Fill the Catalan numbers using dynamic programming
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i -1 -j];
            }
        }

        return catalan[n];
    }
}
