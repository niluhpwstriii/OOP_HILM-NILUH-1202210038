public class Kapal extends TransportAir{
    protected String mesin;

    public Kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi, biaya, mesin);
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Transportasi jenis kapal dengan jumlah kursi " + this.jumlahkursi + "ditetapkan dengan biaya sebesar Rp."+ this.biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi jenis kapal sedang berlayar menggunakan mesin " + this.mesin + "dengan kecepatan tidak stabil");
    }

    public void berlabuh() {
        System.out.println("Transportasi");
    }
}
