public class TransportAir {
    protected int jumlahkursi;
    protected int biaya;

    public TransportAir(int jumlahkursi, int biaya) {
        this.jumlahkursi = jumlahkursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis tidak diketahui dengan kursi berjumlah " + this.jumlahkursi + "ditetapkan dengan biaya sebesar Rp."+this.biaya);
    }

    public void berlayar(){
        System.out.println("Transport air dengan jenis tidak diketahui sedang berlayar");
    }

    public void berlabuh(){
        System.out.println("Transport air dengan jenis tidak diketahui berlabuh di pantai");
    }
}