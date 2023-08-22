import java.util.*;
import java.io.*;
 
public class Main {
 
 
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int cnt=0;
        int head,tail;
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)=='.') {
 
        		head = cnt/4;
        		tail = cnt%4;
        		for(int j=0; j<head; j++) {
        			sb.append("AAAA");
        		}
        		if(tail==2) {
        			sb.append("BB");
        		}
        		sb.append('.');
        		cnt=0;
        	}else {
        		cnt++;
        	}
 
        	
 
        }        
		head = cnt/4;
		tail = cnt%4;
		for(int j=0; j<head; j++) {
			sb.append("AAAA");
		}
		if(tail==2) {
			sb.append("BB");
		}
		
		if(str.length()!=sb.length()) {
			sb.delete(0, sb.length());
			sb.append("-1");
		}
 
        
 
        System.out.println(sb);
 
    }
}
