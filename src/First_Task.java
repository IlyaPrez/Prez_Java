import java.util.Scanner;
public class First_Task {
    public static void main(String[] args) {

        Scanner keys = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = keys.nextInt();


        if(n >7){
            System.out.println("Привет");

        }else if (n==7){
            System.out.println("Почти угадал!");
        }
        else {
            System.out.println("Не подходит(");
        }

    }

}


