import java.util.Random;
public class Third_task {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i]+" ");
            }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]% 3 ==0){
                System.out.print("\r\n"+ "Элемент массива, кратный трём: ");
                System.out.print(arr[i]);
            }
        }
        }
    }



