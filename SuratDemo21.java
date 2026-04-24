import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {
        StackSurat21 stack = new StackSurat21(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();

                    Surat21 s = new Surat21(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat21 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat21 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = scan.nextLine();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan");
                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }
                    break;
            }

        } while (pilih != 5);
    }
}