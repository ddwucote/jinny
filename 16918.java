import java.util.*;

public class Main {
	
	public static int R, C, N;
	public static char[][] map;
	public static int time=0;
	public static Queue<Node> q = new LinkedList<>();
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	R = sc.nextInt();
    	C = sc.nextInt();
    	N = sc.nextInt();
    	map = new char[R][C];
    	
    	
    	for(int i=0;i<R;i++) {
    		String str = sc.next();
    		for(int j=0;j<C;j++) {
    			map[i][j] = str.charAt(j);
    		}
    	}
    	
    
    	for(int time=2; time<=N;time++) {
    		if( time % 2 == 0) {
    			for(int i=0;i<R;i++) {
    				for(int j=0;j<C;j++) {
    					if(map[i][j] == 'O') {
    						q.offer(new Node(i, j));
    					}
    				}
    			}
    			
    			
    			for(int i=0;i<R;i++) {
    				for(int j=0;j<C;j++) {
    					map[i][j] = 'O';
    				}
    			}
    			
    		}
    		
    		
    		if( time%2 == 1) { 			
    			BFS();
    		}
    	}
    	
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
    	
    }
    public static void BFS() {
    	int[] dx = {-1,1,0,0};
    	int[] dy = {0,0,-1,1};
    	while(!q.isEmpty()) {
    		Node temp = q.poll();
    		int x = temp.r;
    		int y = temp.c;
    		map[x][y] = '.';
    		
    		for(int dir=0;dir<4;dir++) {
    			int nx = x + dx[dir];
    			int ny = y + dy[dir];
    			if(nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
    			
    			map[nx][ny] = '.';
    		}
    	}
    }
    
}

class Node{
	int r;
	int c;
	public Node(int r, int c) {
		this.r = r;
		this.c = c;
	}
}
