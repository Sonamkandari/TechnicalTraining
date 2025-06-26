import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class sumofelements{

    // Method to find the maximum for each
    // and every contiguous subarray of size k.
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;

        // to store the results
        ArrayList<Integer> res = new ArrayList<Integer>();

        // to store the max value
        PriorityQueue<Pair> heap = new PriorityQueue<Pair>(new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return b.first - a.first;
            }
        });

        // Initialize the heap with the first k elements
        for (int i = 0; i < k; i++)
            heap.add(new Pair(arr[i], i));

        // The maximum element in the first window
        res.add(heap.peek().first);

        // Process the remaining elements
        for (int i = k; i < arr.length; i++) {

            // Add the current element to the heap
            heap.add(new Pair(arr[i], i));

            // Remove elements that are outside the current
            // window
            while (heap.peek().second <= i - k)
                heap.poll();

            // The maximum element in the current window
            res.add(heap.peek().first);
        }

        return res;
    }

    static class Pair {
        int first;
        int second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        ArrayList<Integer> res = maxOfSubarrays(arr, k);
        for (int maxVal : res) {
            System.out.print(maxVal + " ");
        }
    }
}