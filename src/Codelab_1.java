import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Codelab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String tanggalLahirInput = scanner.next();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);
        LocalDate sekarang = LocalDate.now();

        Period umur = Period.between(tanggalLahir, sekarang);

        String jenisKelaminFull;

        if(jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminFull = "laki-laki";
        } else if(jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminFull = "perempuan";
        } else {
            throw new IllegalArgumentException("Masukkan kelamin yang valid ya :)");
        }

        System.out.println(" ");
        System.out.println("Nama Anda : " + nama);
        System.out.println("Jenis Kelamin Anda : " + jenisKelaminFull);
        System.out.println("Umur Anda : " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}
