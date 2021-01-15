package Controller;

import Data.NurHolis07181_DataAdmin;
import Data.NurHolis07181_DataDriver;
import Data.NurHolis07181_DataPenumpang;
import Entity.NurHolis07181_Penumpang;

public class NurHolis07181_Controller {
    public static NurHolis07181_DataDriver driver=new NurHolis07181_DataDriver();
    public static NurHolis07181_DataPenumpang penumpang=new NurHolis07181_DataPenumpang();
    private NurHolis07181_DataAdmin admin = new NurHolis07181_DataAdmin();
        
    public boolean loginadmin(String nama,String pass){
        return admin.login(nama, pass);
    }
    
    public void tambahdriver(String nama, String id, String pass, String notelp,String warna,String plat,String jenis){
        driver.tambahdata(nama, id, pass, notelp, warna, plat, jenis);
    }
    
    public int ceklogindriver(String nama, String password){
        return driver.login(nama, password);
    }
    
    public void editprofile(int pil,String namabaru,String nobaru){
        driver.editprofilepenumpang(pil, namabaru, nobaru);
        
    }
    
    public boolean cekpelanggan(String nama){
        return driver.cekpelanggan(nama);
    }
   
    
    public String []namadriver(){   
        return driver.nama();
    }
    
 
    public void updatetaxi(String nama, String notelp, String psw, String lokasi, int pil){     //digunkan untuk update setelah memesan
         driver.upgrade(pil, new NurHolis07181_Penumpang(nama, notelp, psw, lokasi));
         penumpang.upgrade(psw,lokasi,pil);
         
    }
    
    public void register(String nama , String notelp ,String pasword){
        penumpang.NurHolis07181_register(nama, notelp, pasword);    
    }
    
    public int cekloginpenumpang(String nama ,String pass){
        return penumpang.NurHolis07181_login(nama, pass);
    }
    
    public void updatetaxi(String psw, String lokasi, int pil){     //digunakan dalam menghapus pesanan
         penumpang.upgrade(psw, lokasi,pil);
    }
    
    public boolean cekpilihan(String psw){      //digunakan dalam view pesanan untuk mengecek sudah apakah sudah memesan
        return penumpang.cekpilihan(psw);
    }
    
    public void editprofile(String psw,String namabaru,String nobaru){
        penumpang.upgrade(psw, namabaru, nobaru);
        
    }
    
    public boolean cekdaftartaxi(int pil){      //untuk mengecek apakah driver sudah dipesan 
        return penumpang.cekdaftartaxi(pil);
    }
    
    public void hapusdriver(String nama){
        driver.hapusdata(nama);
    }
}
