import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        
        int res = 0;
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();

    
            if (a==1){
                res += 0;
                continue;
            }

       
            int x = 0;
            for (int j = 2; j < a; j++) {
                if (a%j == 0) {
                    x++;
                }
            }

            
            if (x == 0){
                res++;
            }

        }
        System.out.println(res);
    }
}
