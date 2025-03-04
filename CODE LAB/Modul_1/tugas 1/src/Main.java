import java.util.Scanner;
import java.time.LocalDate;

class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //memasukkan input dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        //menutup scanner setelah input
        scanner.close();

        //mendapatkan tahuun
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        //Menentukan Jenis Kelamin
        String jenisKelaminText;
        if(jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminText = "Laki - laki";
        }else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminText = "Perempuan";
        }else {
            jenisKelaminText = "Tidak diketahui";
        }

        // Menampikan output
        System.out.println("\n=== Data Pengguna ===");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminText);
        System.out.println("umur         : " + umur + "tahun");
    }
}