
package GUI;

import Controller.NurHolis07181_Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;



public class NurHolis07181_GUIdriver {
    NurHolis07181_Controller controller = new NurHolis07181_Controller();
    JFrame drivermenu,viewmenu;
    JLabel cekpelanggan,logout,judul,labelview;
    JTextArea view = new JTextArea();
    JButton cek,log,back;
    Icon imagecek = new ImageIcon(getClass().getResource("cekpelanggan.png"));
    Icon imagelogout = new ImageIcon(getClass().getResource("logout2.png"));

    public NurHolis07181_GUIdriver(String nama) {
        drivermenu(nama);
    }
    
    void drivermenu(String nama){
        drivermenu = new JFrame("Driver");
        drivermenu.setSize(650, 500);
        drivermenu.setLayout(null);
        drivermenu.getContentPane().setBackground(new Color(80,70, 255));
        
        judul = new JLabel("TAXI ONLINE");
        judul.setBounds(190, 10, 700, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        drivermenu.add(judul);
        
        cekpelanggan = new JLabel("Cek Pelanggan");
        cekpelanggan.setBounds(175, 240, 300, 40);
        drivermenu.add(cekpelanggan);
        
        cek = new JButton(imagecek);
        cek.setBounds(175, 170, 90, 70);
        drivermenu.add(cek);
        
        logout = new JLabel("Logout");
        logout.setBounds(405, 240, 300, 40);
        drivermenu.add(logout);
        
        log = new JButton(imagelogout);
        log.setBounds(380, 170, 90, 70);
        drivermenu.add(log);
        
        drivermenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drivermenu.setVisible(true);
        drivermenu.setLocationRelativeTo(null);
        
        
        cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drivermenu.dispose();
                cekpenumpang(nama);
            }
        });
        
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drivermenu.dispose();
                NurHolis07181_GUIRegister awal = new NurHolis07181_GUIRegister();
            }
        });
    
    }
    
    void cekpenumpang(String nama){
        viewmenu = new JFrame("cek pelanggan");
        viewmenu.setSize(650, 500);
        viewmenu.setLayout(null);
        viewmenu.getContentPane().setBackground(new Color(80,70, 255));
        
        labelview = new JLabel("Pelanggan Anda");
        labelview.setBounds(100, 100, 200, 40);
        viewmenu.add(labelview);
        
        view.setBounds(100, 140, 300, 150);
        viewmenu.add(view);
        
        back = new JButton("back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.red);
        back.setFocusable(false);
        viewmenu.add(back);
              
        viewmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewmenu.setVisible(true);
        viewmenu.setLocationRelativeTo(null);
        
        if(controller.cekpelanggan(nama)==true){
           view.setText(NurHolis07181_Controller.driver.viewpelanggan(nama)); 
        }else{
            JOptionPane.showMessageDialog(null,"Anda belum punya pelanggan","information",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmenu.dispose();
                drivermenu(nama);
            }
        });
          
    }
}
