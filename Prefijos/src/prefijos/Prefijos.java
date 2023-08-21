package prefijos;

 import java.io.*;

public class Prefijos {
 
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5,6};
        int n = arr.length;
        int sumita[] = new int[n];
        Operaciones(arr, n, sumita);
        System.out.println("La suma de prefijos es: ");
        for (int i = 0; i < n; i++)
            
            System.out.println(sumita[i] + " ");
    }
static void Operaciones(int arreglo[], int n, int sumaprefijo[]){
        sumaprefijo[0] = arreglo[0];
       
        for (int i = 1; i < n; ++i)
            sumaprefijo[i] =sumaprefijo[i - 1] + arreglo[i];
    }
}
