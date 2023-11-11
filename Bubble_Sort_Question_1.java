package Sorting;
import java.util.Scanner;
public class Bubble_Sort_Question_1 {
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void print(int[]arr){
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        print(arr);
    }
}