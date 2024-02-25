import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int maior = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < a;i++){
            list.add(sc.nextInt());
        }

        for(int i = 0; i < list.size();i++){
            if(list.get(i) > maior){
                maior = list.get(i);
            }
        }

        System.out.println(maior +1);

        sc.close();
    }
}
