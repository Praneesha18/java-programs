import java.util.Scanner;
import java.lang.Math;
class quicksort{
    public static void main(String args[]){
        int n;
        int low=0;
        int high=n-1;
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the range of the numbers max and min");
        System.out.println("enter min limit:");
        int min=sc.nextInt();
        System.out.println("enter the max limit:");
        int max=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int a[i]=int((Math.random()*(max-min+1)+max));
        }
        System.out.println("the elemets after sorting are:")
        Quicksortprodecure(low,high,a);
    }
    private static void Quicksortprodecure(int low,int high,int a[]){
        if(low<high){
        int loc=partition(a,low,high);
        quicksort(a,low,loc);
        quicksort(a,loc+1,high);
        }
    }
    private static int partition(int a[],int low,int high){
    int start=low;
    int end=high;
    int pivot=a[low];
    while(start<end){
        while(a[start]<=pivot&&start<end){
            start++;
        }
        while(a[end]>pivot){
            end--;
        }
        if(start<end)
        swap(a[start],a[end]);
    }
    a[l]=a[end];
    a[end]=pivot;
    return end;
    }
    private static void swap(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    }
}
