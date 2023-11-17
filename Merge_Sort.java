import java.util.Scanner;
public class Merge_Sort {
    static void merge(int[]arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[]left = new int[n1];
        int[]right = new int[n2];
        for(int i=0;i<n1;i++) left[i] = arr[l+i];
        for(int j=0;j<n2;j++) right[j] = arr[mid+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }
    static void mergeSort(int[]arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void printArray(int[]arr){
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int n = sc.nextInt();
        int[]arr = new int [n];
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println("Sorted array :-");
        printArray(arr);
    }
}