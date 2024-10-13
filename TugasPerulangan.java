
import java.util.Scanner;

public class TugasPerulangan{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int stokAwal = input.nextInt();
        int pembelianPerhari = input.nextInt();
        
      pembelianPerhari *= 28;
        while (stokAwal < pembelianPerhari) {
            stokAwal = -1;
            break;
        }
        while (stokAwal >pembelianPerhari) {
            stokAwal -= pembelianPerhari;
            break;
        }
        System.out.println(stokAwal);
    }
}
