import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("родился");
                break;
            case 7:
                System.out.println("в школу");
                break;
            case 18:
                System.out.println("в армию");
                break;
            default:
                System.out.println("хз что");
        }
    }
}
