import java.util.Scanner;

public class ArrayNilaimod29{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nilaiAkhir = new int[10];
    
    for (int i = 0; i < nilaiAkhir.length; i++){
    System.out.print("Masukkan nilai ke-"+i+":" );
    nilaiAkhir[i] = sc.nextInt();
    
    }
    for (int i = 0; i < nilaiAkhir.length; i++){
        if (nilaiAkhir[i]>70){
        System.out.println("nilai akhir ke-"+i+"lulus!");
        }else{
            System.out.println("nilai akhir ke-" +i+ "tidak lulus");
        }
        }
    }

} 
