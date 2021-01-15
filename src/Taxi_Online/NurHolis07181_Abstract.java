package Taxi_Online;

public abstract class NurHolis07181_Abstract {
    protected String NurHolis07181_nama,NurHolis07181_notelp,NurHolis07181_pass;

    public NurHolis07181_Abstract(String NurHolis07181_nama, String NurHolis07181_notelp, String NurHolis07181_pass) {
        this.NurHolis07181_nama = NurHolis07181_nama;
        this.NurHolis07181_notelp = NurHolis07181_notelp;
        this.NurHolis07181_pass = NurHolis07181_pass;
    }

    public abstract String getNurHolis07181_nama(); 
    

    public void setNurHolis07181_nama(String NurHolis07181_nama) {
        this.NurHolis07181_nama = NurHolis07181_nama;
    }

    public String getNurHolis07181_notelp() {
        return NurHolis07181_notelp;
    }

    public void setNurHolis07181_notelp(String NurHolis07181_notelp) {
        this.NurHolis07181_notelp = NurHolis07181_notelp;
    }

    public abstract String getNurHolis07181_pass();

    public void setNurHolis07181_pass(String NurHolis07181_pass) {
        this.NurHolis07181_pass = NurHolis07181_pass;
    }
    
    

}
