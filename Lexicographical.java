import java.util.Scanner;
public class Lexicographical {
    static void swap(String[]arr,int i,int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int n = sc.nextInt();
        String[]arr = new String[n];
        System.out.println("Enter "+n+" string :-");
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i].compareTo(arr[j]))>0){
                    swap(arr,i,j);
                }
            }
        }
        System.out.println("Sorted order :-");
        for(String element : arr){
            System.out.print(element+" ");
        }
    }
}
