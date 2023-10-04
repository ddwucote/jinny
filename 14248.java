import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    int n;
    int check[], 
    int bridge[];
    int dir[] = {1, -1};
    int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bridge = new int[n]; 
        check = new int[n]; 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            stoneBridge[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()); //3
        System.out.println(bfs(s-1)); //2

    }

    public static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        check[node] = 1; 
        while (!queue.isEmpty()) {
            node = queue.poll();
            int j = bridge[node];
            for (int d : dir) {
                int direction = (d * j) + node;
                if (direction >= 0 && direction < n && check[direction] == 0) {
                    check[direction] = 1;
                    queue.offer(direction);
                    count++;
                }
            }
        }
        return count;
    }
}
