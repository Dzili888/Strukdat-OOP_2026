class MahasiswaBeasiswa extends Mahasiswa {
    public MahasiswaBeasiswa(String nama, String nrp) {
        super(nama, nrp);
    }

    @Override
    public double UKT() {
        return 0;
    }
}