package Data;

import Entity.NurHolis07181_Driver;
import java.util.ArrayList;
import Entity.NurHolis07181_Penumpang;
public class NurHolis07181_DataDriver {
    private ArrayList<NurHolis07181_Driver>datadriver;
    private String nama[]={"Asep","Ujang","Cecep"};
    private String noTelp[]={"081998111","087772888","085373222"};
    private String ID[]={"01","02","03"};
    private String pass[]={"01","02","03"};
    private NurHolis07181_DataPenumpang penumpang = new NurHolis07181_DataPenumpang();
    private NurHolis07181_DataTaxi taxi=new NurHolis07181_DataTaxi();
   
    
    public NurHolis07181_DataDriver(){
        datadriver = new ArrayList<>();
         for(int a=0;a<3;a++){
             datadriver.add(new NurHolis07181_Driver(ID[a], nama[a], noTelp[a], pass[a]));
         }
     }
    
    
    private int cari(String nama){
        int index=-1;
         for(int i=0;i<datadriver.size();i++){
             if(nama.equals(datadriver.get(i).getNurHolis07181_nama())){
                 index=i;
             }
         }
         return index;
    }
    
    public void upgrade(int pil,NurHolis07181_Penumpang penumpang){
        datadriver.get(pil).setPenumpang(penumpang);
    }
    
//    public void hapus(String nama){
//        datadriver.get(cari(nama)).setPenumpang(null);
//    }
    
     
    public String viewDriver(int pil){
        
        String viewdriver ="Nama Taxi        : "+datadriver.get(pil).getNurHolis07181_nama()+
        "\nNo.Telp             : "+datadriver.get(pil).getNurHolis07181_notelp()+
        "\nID                      : "+datadriver.get(pil).getNurHolis07181_id()+taxi.view(pil);
        
        return viewdriver;
    }
     
    public int login(String nama ,String Password){
         int ketemu =0;
        if(cari(nama)!=-1){
            if(nama.equals(datadriver.get(cari(nama)).getNurHolis07181_nama())&&Password.equals(datadriver.get(cari(nama)).getNurHolis07181_pass())){
                ketemu=1;
            }
        }
        return ketemu;
     }
    
     
     public boolean cekpelanggan(String nama){
         boolean cek = true;
         if(datadriver.get(cari(nama)).getPenumpang()==null){
             cek=false;
         }  
         return cek;
     }
     
     public String viewpelanggan(String nama){
        String view=
             "Nama : "+datadriver.get(cari(nama)).getPenumpang().getNurHolis07181_nama()+
             "\nNo Telp : "+datadriver.get(cari(nama)).getPenumpang().getNurHolis07181_notelp()+
             "\nTujuan : "+datadriver.get(cari(nama)).getPenumpang().getTujuan();
         return view;
     }

    public ArrayList<NurHolis07181_Driver> getDatadriver() {
        return datadriver;
    }

    public String []nama(){
        String []name = new String[datadriver.size()];
        for(int i=0;i<datadriver.size();i++){
            name[i]=datadriver.get(i).getNurHolis07181_nama();
        }
        return name;
    }
    
//    public String passpenumpang(String nama){
//        return datadriver.get(cari(nama)).getPenumpang().getNurHolis07181_pass();
//    }
    
    public void editprofilepenumpang(int pil,String namabaru,String nobaru){
        datadriver.get(pil).getPenumpang().setNurHolis07181_nama(namabaru);
        datadriver.get(pil).getPenumpang().setNurHolis07181_notelp(nobaru);
    }
    
    public void tambahdata(String nama, String id, String pass, String notelp,String warna,String plat,String jenis){
        datadriver.add(new NurHolis07181_Driver(id, nama, notelp, pass));
        taxi.tambahtaxi(jenis, warna, plat);
    }
    
    public void hapusdata(String nama){
        taxi.getDatataxi().remove(cari(nama));
        datadriver.remove(cari(nama));
    }
    
}
