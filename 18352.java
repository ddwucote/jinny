class Main {
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int n,k,x,m;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt(); 
        x = sc.nextInt();

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new int[n+1];
        for (int i=0; i<=n; i++) {
            visited[i] = -1;
        }

        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        BFS(x);

        boolean flag = false;
 
        for (int i=1; i<=n; i++) {
            if (visited[i] == k) {
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag) System.out.println("-1");

    }

    public static void BFS(int start) {
      
        visited[start] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start); 
        while (!q.isEmpty()) {
            int cv = q.poll();
            for (int i : graph.get(cv)) {
                if (visited[i] == -1) {
                    visited[i] = visited[cv] + 1;
                    q.offer(i);
                }
            }
        }

    }
}
