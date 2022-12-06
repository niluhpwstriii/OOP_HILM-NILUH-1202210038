public class Sampan extends TransportAir{
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi, biaya);
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis Sampan dengan kursi berjumlah " + this.jumlahkursi + "ditetapkan dengan biaya sebesar Rp."+this.biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan " + this.layar + "layar");
    }

    /**
     * @param jangkar
     */
    public void berlabuh(int jangkar) {
        System.out.println("Transportasi jenis sampan berlabuh dipantai tanpa jangkar");
        System.out.println("Transportasi jenis sampan berlabuh di pantai menggunakan " + jangkar + "jangkar");
    }

}
