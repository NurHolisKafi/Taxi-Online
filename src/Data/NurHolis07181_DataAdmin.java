package Data;


public class NurHolis07181_DataAdmin {
    private String nama="kafi";
    private String pass="abcd4321";
    
    public boolean login(String nama ,String pass){
        if(nama.equals(this.nama)&&pass.equals(this.pass)){
            return true;
        }
        return false;
    }
    
    
    
}
