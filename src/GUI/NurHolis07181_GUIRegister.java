
package GUI;

import Controller.NurHolis07181_Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class NurHolis07181_GUIRegister {
    String[]namalogin={"Penumpang","Driver","Admin"};
    JComboBox pillogin = new JComboBox(namalogin);
    JFrame layar = new JFrame("Taxi Online");
    ButtonGroup group = new ButtonGroup();
    JLabel judul,daftar,masuk;
    JButton login,register;
    JLabel daftar_Nama,login_nama,daftar_notelp,daftar_pass,login_pass;
    JTextField text_daftarnama,text_loginnama,text_notelp;
    JPasswordField pass_daftar,pass_login;
    
    NurHolis07181_Controller controller = new NurHolis07181_Controller();
    

    public NurHolis07181_GUIRegister() {
        layar.setSize(700, 680);
        layar.setLayout(null);
        layar.getContentPane().setBackground(new Color(80,70, 255));
        
        judul = new JLabel("TAXI ONLINE");
        judul.setBounds(200, 10, 500, 40);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        layar.add(judul);
        
        masuk = new JLabel("Masuk");
        masuk.setBounds(100, 60, 130, 100);
        masuk.setFont(new Font("Times New Roman",Font.BOLD,35));
        layar.add(masuk);
        
        pillogin.setBounds(30, 170, 200, 30);
        pillogin.setFocusable(false);
        pillogin.setBackground(Color.CYAN);
        layar.add(pillogin);
        
        login_nama=new JLabel("Nama");
        login_nama.setBounds(30, 210,50, 30);
        layar.add(login_nama);
        
        text_loginnama = new JTextField();
        text_loginnama.setBounds(30, 250,220,30);
        layar.add(text_loginnama);
        
        login_pass = new JLabel("Password");
        login_pass.setBounds(30, 290, 100, 30);
        layar.add(login_pass);
        
        pass_login = new JPasswordField();
        pass_login.setBounds(30, 330, 220, 30);
        layar.add(pass_login);
        
        login = new JButton("Login");
        login.setBounds(90, 400, 100, 40);
        login.setFocusable(false);
        login.setBackground(Color.GREEN);
        layar.add(login);
        
        daftar = new JLabel("Daftar");
        daftar.setBounds(470, 60, 100, 100);
        daftar.setFont(new Font("Times New Roman",Font.BOLD,35));
        layar.add(daftar);
        
        
        daftar_Nama=new JLabel("Nama");
        daftar_Nama.setBounds(410, 160,50, 30);
        layar.add(daftar_Nama);
        
        text_daftarnama = new JTextField();
        text_daftarnama.setBounds(410,200,220,30);
        layar.add(text_daftarnama);
        
        daftar_pass = new JLabel("Password");
        daftar_pass.setBounds(410, 260, 100, 30);
        layar.add(daftar_pass);
        
        pass_daftar = new JPasswordField();
        pass_daftar.setBounds(410, 300, 220, 30);
        layar.add(pass_daftar);
        
        daftar_notelp=new JLabel("No Telp");
        daftar_notelp.setBounds(410, 360,50, 30);
        layar.add(daftar_notelp);
        
        text_notelp = new JTextField();
        text_notelp.setBounds(410,400,220,30);
        layar.add(text_notelp);
        
        register = new JButton("Register");
        register.setBounds(470, 500, 100, 40);
        register.setFocusable(false);
        register.setBackground(Color.GREEN);
        layar.add(register);
        
        layar.setVisible(true);
        layar.setLocationRelativeTo(null);
        layar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pillogin.getSelectedIndex()==0){
                    String nama = text_loginnama.getText();
                    String pass = pass_login.getText();
                    int login = controller.cekloginpenumpang(nama, pass);
                    if(login==1){
                        JOptionPane.showMessageDialog(null, "Login Berhasil", "information",JOptionPane.INFORMATION_MESSAGE);
                        layar.dispose();
                        NurHolis07181_GUIPenumpang penumpang = new NurHolis07181_GUIPenumpang(pass);
                    }else{
                        JOptionPane.showMessageDialog(null, "Nama atau password salah", "information",JOptionPane.INFORMATION_MESSAGE);
                    }
                    kosong();
                }else if(pillogin.getSelectedIndex()==1){
                    String nama = text_loginnama.getText();
                    String pass = pass_login.getText();
                    int login = controller.ceklogindriver(nama, pass);
                    if(login==1){
                        JOptionPane.showMessageDialog(null, "Login Berhasil", "information",JOptionPane.INFORMATION_MESSAGE);
                        NurHolis07181_GUIdriver driver = new NurHolis07181_GUIdriver(nama);
                        layar.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Nama atau Password salah", "information",JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                }else{
                    String nama = text_loginnama.getText();
                    String pass = pass_login.getText();
                    if(controller.loginadmin(nama, pass)){
                        JOptionPane.showMessageDialog(null, "Login Berhasil", "information",JOptionPane.INFORMATION_MESSAGE);
                        NurHolis07181_GUIAdmin admin = new NurHolis07181_GUIAdmin();
                        layar.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Nama atau Password salah", "information",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                kosong();
            }
        });
        
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String pass = pass_daftar.getText();
                    String nama = text_daftarnama.getText();
                    String notelp = text_notelp.getText();
                    controller.register(nama, notelp, pass);
                    JOptionPane.showMessageDialog(null,"Regstrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Penulisan Salah","Regstrasi Gagal",JOptionPane.INFORMATION_MESSAGE);
                }
                kosong();
            }
        });
    }
    
    void kosong(){
        text_daftarnama.setText(null);
        text_loginnama.setText(null);
        text_notelp.setText(null);
        pass_login.setText(null);
        pass_daftar.setText(null);
    }
}
