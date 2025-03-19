import java.util.Scanner;

public class Array_Printing {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Length of Array : ");
            int size = sc.nextInt();
            int array [] = new int[size];
            for(int i=0;i<size;i++){
                    array[i] =sc.nextInt();
            }
            System.out.println("The Printing Arrays are  :");
            for(int i=0;i<size;i++){
                System.out.print(array[i]+" ");
        }
    }
    
}
