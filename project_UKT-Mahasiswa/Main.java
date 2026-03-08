public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new MahasiswaReguler("Dzili", "5027251030", 5000000);
        Mahasiswa mhs2 = new MahasiswaBeasiswa("Ucup", "5027451045");

        System.out.println("INFO MAHASISWA");
        mhs1.tampilkanInfo();
        System.out.println("Tagihan UKT: Rp " + mhs1.UKT());

        System.out.println("\nINFO MAHASISWA");
        mhs2.tampilkanInfo();
        System.out.println("Tagihan UKT: Rp " + mhs2.UKT());
    }
}