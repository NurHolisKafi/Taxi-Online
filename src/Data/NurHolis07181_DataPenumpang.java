
package Data;

import Entity.NurHolis07181_Penumpang;
import java.util.ArrayList;

public class NurHolis07181_DataPenumpang {
    private ArrayList<NurHolis07181_Penumpang>datapenumpang;

    public NurHolis07181_DataPenumpang() {
        datapenumpang=new ArrayList<NurHolis07181_Penumpang>();
    }
    
    public void NurHolis07181_register(String nama , String notelp ,String pasword){
            datapenumpang.add(new NurHolis07181_Penumpang(nama, notelp, pasword, null,-1));
         
    }
    
    public int NurHolis07181_login(String nama,String pass){
        int ketemu =0;
        if(NurHolis07181_cari(pass)!=-1){
            if(nama.equals(datapenumpang.get(NurHolis07181_cari(pass)).getNurHolis07181_nama())&&pass.equals(datapenumpang.get(NurHolis07181_cari(pass)).getNurHolis07181_pass())){
                ketemu=1;
            }
        }
        return ketemu;
    }
     
    public String NurHolis07181_view1(String paswd){
        
        String view ="Nama Penumpang     : "+datapenumpang.get(NurHolis07181_cari(paswd)).getNurHolis07181_nama()+
        "\nNo.Telp            : "+datapenumpang.get(NurHolis07181_cari(paswd)).getNurHolis07181_notelp()+
        "\nLokasi Tujuan      : "+datapenumpang.get(NurHolis07181_cari(paswd)).getTujuan();
        return view;
        
    }
    
    public String NurHolis07181_view2(String paswd){        
        String view ="Nama Penumpang     : "+datapenumpang.get(NurHolis07181_cari(paswd)).getNurHolis07181_nama()+
        "\nNo.Telp            : "+datapenumpang.get(NurHolis07181_cari(paswd)).getNurHolis07181_notelp();
        return view;

    }
    
    public int NurHolis07181_cari(String psw){
        int index=-1;
         for(int i=0;i<datapenumpang.size();i++){
             if(psw.equals(datapenumpang.get(i).getNurHolis07181_pass())){
                 index=i;
             }
         }
         return index;
    }

    public void upgrade(String pass,String tujuan, int pil){
        datapenumpang.get(NurHolis07181_cari(pass)).setTujuan(tujuan);
        datapenumpang.get(NurHolis07181_cari(pass)).setPil(pil);
    }
    
    public void upgrade(String psw,String nama ,String notelp){
        datapenumpang.get(NurHolis07181_cari(psw)).setNurHolis07181_nama(nama);
        datapenumpang.get(NurHolis07181_cari(psw)).setNurHolis07181_notelp(notelp);
    }
    
    
    
    public boolean cekpilihan(String psw){
        boolean pilihan =true;
        if(datapenumpang.get(NurHolis07181_cari(psw)).getPil()==-1){
            pilihan = false;
            return pilihan;
        }
            return pilihan;    
    }
    
    public int pilihan(String pass){
        return datapenumpang.get(NurHolis07181_cari(pass)).getPil();
    }
    
    public boolean cekdaftartaxi(int pil){
        boolean cek=true;
        for(int a=0;a<datapenumpang.size();a++){
            if(pil==datapenumpang.get(a).getPil()){
                cek=false;
                return cek;
            }   
        }
      return cek;
    }

    public ArrayList<NurHolis07181_Penumpang> getDatapenumpang() {
        return datapenumpang;
    }
   
   
}
