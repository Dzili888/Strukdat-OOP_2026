class MahasiswaReguler extends Mahasiswa {
    private double uktDasar;

    public MahasiswaReguler(String nama, String nrp, double uktDasar) {
        super(nama, nrp);
        this.uktDasar = uktDasar;
    }

    @Override
    public double UKT() {
        return this.uktDasar;
    }
}