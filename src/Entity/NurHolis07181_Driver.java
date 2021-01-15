package Entity;

import Taxi_Online.NurHolis07181_Abstract;
import Entity.NurHolis07181_Penumpang;

public class NurHolis07181_Driver extends NurHolis07181_Abstract {
    private String NurHolis07181_id;
    private NurHolis07181_Penumpang penumpang;

    public NurHolis07181_Driver(String id, String NurHolis07181_nama, String NurHolis07181_notelp, String NurHolis07181_pass, NurHolis07181_Penumpang penumpang) {
        super(NurHolis07181_nama, NurHolis07181_notelp, NurHolis07181_pass);
        this.NurHolis07181_id=id;
        this.penumpang=penumpang;
    }
    
    public NurHolis07181_Driver(String NurHolis07181_id, String NurHolis07181_nama, String NurHolis07181_notelp, String NurHolis07181_pass) {
        super(NurHolis07181_nama, NurHolis07181_notelp, NurHolis07181_pass);
        this.NurHolis07181_id = NurHolis07181_id;
    }

    @Override
    public String getNurHolis07181_nama(){
        return NurHolis07181_nama;
    }

    

    public NurHolis07181_Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(NurHolis07181_Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public String getNurHolis07181_pass(){
        return NurHolis07181_pass;
    }
    
    public String getNurHolis07181_id() {
        return NurHolis07181_id;
    }

    public void setNurHolis07181_id(String NurHolis07181_id) {
        this.NurHolis07181_id = NurHolis07181_id;
    }

   
    
}
