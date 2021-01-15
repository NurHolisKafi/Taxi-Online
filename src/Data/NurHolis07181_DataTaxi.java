
package Data;

import Entity.NurHolis07181_Taxi;
import java.util.ArrayList;

public class NurHolis07181_DataTaxi {
    private String namamobil[]={"Avanza" ,"Mobilio","Jazz"};
    private String warna[]={"Hitam","Putih","Merah"};
    private String plat[]={"L 1469 NH","L 1996 YZ","L 1389 DJ"};
    private ArrayList<NurHolis07181_Taxi>datataxi;

    public NurHolis07181_DataTaxi() {
        datataxi=new ArrayList<>();
        for(int i=0;i<plat.length;i++){
            datataxi.add(new NurHolis07181_Taxi(namamobil[i], warna[i], plat[i]));
        }
    }
    
    public String view(int input){
        
        String view = "\nMobil                 : "+datataxi.get(input).getNama()+
        "\nWarna               : "+datataxi.get(input).getWarna()+
        "\nNo.Plat             : "+datataxi.get(input).getPlatnomor();
        
        return view;
    }

    public ArrayList<NurHolis07181_Taxi> getDatataxi() {
        return datataxi;
    }
    
    public void tambahtaxi(String nama,String warna,String plat){
        datataxi.add(new NurHolis07181_Taxi(nama, warna, plat));
    }
    
}
