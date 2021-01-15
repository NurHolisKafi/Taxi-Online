package Entity;

import Taxi_Online.NurHolis07181_Abstract;
public class NurHolis07181_Penumpang extends NurHolis07181_Abstract {
    private String tujuan; 
    private int piltaxi;

    public NurHolis07181_Penumpang(String NurHolis07181_nama, String NurHolis07181_notelp, String NurHolis07181_pass, String tujuan, int pil) {
        super(NurHolis07181_nama, NurHolis07181_notelp, NurHolis07181_pass);
        this.piltaxi=pil;
        this.tujuan=tujuan;
    }

    public NurHolis07181_Penumpang(String NurHolis07181_nama, String NurHolis07181_notelp, String NurHolis07181_pass, String tujuan) {
        super(NurHolis07181_nama, NurHolis07181_notelp, NurHolis07181_pass);
        this.tujuan = tujuan;
    }
    
     @Override
    public String getNurHolis07181_nama(){
        return NurHolis07181_nama;
    }
    
    public String getNurHolis07181_pass(){
        return NurHolis07181_pass;
    }

    public int getPil() {
        return piltaxi;
    }

    public void setPil(int pil) {
        this.piltaxi = pil;
    }
    
    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}
