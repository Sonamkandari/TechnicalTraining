public class solution {
    public boolean isSubsetSum(int[] set, int n, int sum) {    if (sum == 0)        return true;        if (n == 0)        return false;        // Missing line - If last element is greater than sum, ignore it        // Check if sum can be obtained by including or excluding the last element
            return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);}
}
