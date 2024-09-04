
    import java.util.Scanner;


    public class insertElements
    {
        public static void main(String[] args)
        {
            int i, element;
            int[] arr = new int[11];
            Scanner scan = new Scanner(System.in);

            System.out.print("put 10 Elements: ");
            for(i=0; i<10; i++)
                arr[i] = scan.nextInt();

            System.out.print("put an Element to Insert: ");
            element = scan.nextInt();
            arr[i] = element;

            System.out.println("\n heres the new array: ");
            for(i=0; i<11; i++)
                System.out.print(arr[i]+ " ");
        }
    }


}
