import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name!=""){
            System.out.printf("Hello %s",name);
        }else {
            System.out.printf("Input Unvalid");
        }
    }
}
