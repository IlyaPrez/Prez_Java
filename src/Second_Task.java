import java.util.Scanner;
public class Second_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}
