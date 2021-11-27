import java.util.Scanner;

public class Problem8 {
    static boolean isMirrorInverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[arr[i]] != i)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (isMirrorInverse(arr))
            System.out.println("Yes, it is mirror inverse");
        else
            System.out.println("No, it is not mirror inverse");
        sc.close();
    }
}
