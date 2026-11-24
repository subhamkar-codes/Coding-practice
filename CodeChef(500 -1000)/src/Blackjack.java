import java.util.Scanner;
class SolutionBJ{
    public int blackj(int x , int y){
        if (21 - (x+y) <= 10){
            return 21 - (x +y);
        }
        else return  -1;


    }
}




public class Blackjack {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            SolutionBJ obj = new SolutionBJ();
            int result = obj.blackj(a,b);
            System.out.println(result);
        }
    }
}
