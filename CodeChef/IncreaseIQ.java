import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Scanner;

public class IncreaseIQ {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       if ((t+7)> 170){
           System.out.println("yes");
       }
       else {
           System.out.println("No");
       }
    }
}
