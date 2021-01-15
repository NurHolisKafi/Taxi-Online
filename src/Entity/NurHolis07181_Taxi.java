package Entity;

public class NurHolis07181_Taxi {

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setPlatnomor(String platnomor) {
        this.platnomor = platnomor;
    }
    private String nama,warna,platnomor;

    public NurHolis07181_Taxi(String nama, String warna, String platnomor) {
        this.nama = nama;
        this.warna = warna;
        this.platnomor = platnomor;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }
    
    public String getPlatnomor() {
        return platnomor;
    }

}
