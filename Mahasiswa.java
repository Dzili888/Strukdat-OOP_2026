abstract class Mahasiswa {
    private String nama;
    private String nrp;

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NRP  : " + this.nrp);
    }

    public abstract double UKT();
}