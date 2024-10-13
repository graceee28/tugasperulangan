
import java.util.Scanner;

public class TugasPerulangan{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int stokAwal = input.nextInt();
        int pembelianPerhari = input.nextInt();
        // Pekerjaan anda dimulai dari sini
        pembelianPerhari *= 28;
        while (stokAwal < pembelianPerhari) {
            stokAwal = -1;
            break;
        }
        while (stokAwal >pembelianPerhari) {
            stokAwal -= pembelianPerhari;
            break;
        }
        //Pekerjaan anda berakhir disini
        System.out.println(stokAwal);
    }
}
