
public class Assignment01Q05 {

    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int[] distances = new int[m[i].length];
        for (int k = 0; k < distances.length; k++) {
            distances[k] = -1;
        }
        distances[i] = 0;

        int[] queue = new int[m[i].length];

        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;

        while (head < tail) {
            int curr = queue[head];
            head++;

            if (j == curr) {
                return distances[curr];
            }

            for (int idx = 0; idx < m[curr].length; idx++) {
                if (m[curr][idx] == 1 && distances[idx] == -1) {
                    distances[idx] = distances[curr] + 1;
                    queue[tail] = idx;
                    tail++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][]{{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 0, 0, 0}}, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][]{{0, 1, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 1, 0}}, 0, 2)); // 2
    }
}
