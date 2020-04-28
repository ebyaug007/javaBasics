
public class bubblesort {

public static void main(String[] args)
{
    int arr[] ={20,13,-10,30,45,7};
    for(int topbound = arr.length -1;topbound>0;topbound--)
    {
        for(int i=0;i<topbound;i++)
        {
            if(arr[i]>arr[i+1])
                swap(arr,i,i+1);
        }
    }
    for(int k:arr)
        System.out.println(k);

}
public static void swap(int[] a,int i,int j)
{
    int temp = a[i];
    a[i]=a[j];
    a[j]=temp;
}
}