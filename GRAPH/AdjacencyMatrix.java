public class AdjacencyMatrix {
    public static void main(String[] args) {
        final int v = 5; // Number of vertices
        int[][] adjMatrix = new int[v][v]; // Create a 5x5 adjacency matrix

        // Add edges (0-based index)
        adjMatrix[0][1] = 1;
        adjMatrix[0][2] = 1;
        adjMatrix[0][0] = 1; // Self loop
        adjMatrix[0][1] = 1; // Redundant, already set

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

