import java.util.HashMap;
import java.util.Scanner;

class simpleLogin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> adminAccounts = new HashMap<>();
        adminAccounts.put("Admin271", "Password271");
        adminAccounts.put("Admin272", "Password272");

        HashMap<String, String> mahasiswaAccounts = new HashMap<>();
        mahasiswaAccounts.put("202410270110271", "Nabila Dewinur");
        mahasiswaAccounts.put("202410370110272", "Natania Okta");

        try {
            System.out.println("Pilih Login: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan Pilihan: ");

            int pilihan = Integer.parseInt(scanner.nextLine().trim());

            if (pilihan == 1) {
                System.out.print("Masukkan Username: ");
                String username = scanner.nextLine().trim();
                System.out.print("Masukan Password: ");
                String password = scanner.nextLine().trim();

                if (adminAccounts.containsKey(username) && adminAccounts.get(username).equals(password)) {
                    System.out.println("Login Admin Berhasil!");
                } else {
                    System.out.println("Login Gagal! Username atau Password anda salah.");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine().trim();

                if (mahasiswaAccounts.containsKey(nim)) {
                    System.out.println("Login Mahasiswa Berhasil!");
                    System.out.println("Nama: " + mahasiswaAccounts.get(nim));
                    System.out.println("NIM: " + nim);
                } else {
                    System.out.println("Login gagal! NIM tidak ditemukan.");
                }

            } else {
                System.out.println("Pilihan Tidak Valid");
            }
        }catch (NumberFormatException e){
            System.out.println("Input Tidak Valid! Harap Maukkan angka untuk pilian login.");
        } finally {
            scanner.close();
        }
    }
}