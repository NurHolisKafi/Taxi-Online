package GUI;


import  Controller.NurHolis07181_Controller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class NurHolis07181_GUIPenumpang {    
    NurHolis07181_Controller controller = new NurHolis07181_Controller();
    
    JFrame menu,menudaftar,menuview,updateprofile;
    JTextField textlokasi,nama,notelp;
    JTextArea textview1,textview2;
    JLabel Judul,Daftartaxi,viewpesanan,hapuspesanan,editprofile,logout,Daftarjudul,lokasi;
    JLabel view1,view2,namabaru,notelpbaru;
    JButton daftar,view,hapus,edit,exit,pilih,kembali,editprof;
    JComboBox namadriver = new JComboBox(controller.namadriver());
    ImageIcon imagedaftar = new ImageIcon(getClass().getResource("daftar.png"));
    Icon imageview = new ImageIcon(getClass().getResource("view.jpg"));
    Icon imagehapus = new ImageIcon(getClass().getResource("hapus.png"));
    Icon imageprofile = new ImageIcon(getClass().getResource("profile2.png"));
    Icon imagelogout = new ImageIcon(getClass().getResource("logout2.png"));

    public NurHolis07181_GUIPenumpang(String psw) {
         menu(psw);
    }
    
    void menu(String pass){
        menu = new JFrame();
        menu.setSize(650, 500);
        menu.getContentPane().setBackground(new Color(80,70, 255));
        menu.setLayout(null);
        
        Judul = new JLabel("TAXI ONLINE");
        Judul.setBounds(190, 10, 700, 50);
        Judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        menu.add(Judul);
        
        Daftartaxi = new JLabel("Daftar Taxi");
        Daftartaxi.setBounds(150, 190, 300, 40);
        menu.add(Daftartaxi);
        
        viewpesanan = new JLabel("View");
        viewpesanan.setBounds(317, 190, 300, 40);
        menu.add(viewpesanan);
        
        hapuspesanan = new JLabel("Hapus Pesanan");
        hapuspesanan.setBounds(430, 190, 300, 40);
        menu.add(hapuspesanan);
        
        editprofile = new JLabel("Edit Profile");
        editprofile.setBounds(210, 340, 300, 40);
        menu.add(editprofile);
        
        logout = new JLabel("Logout");
        logout.setBounds(400, 340, 300, 40);
        menu.add(logout);
        
        
        daftar = new JButton(imagedaftar);
        daftar.setBounds(140, 120, 90, 70);
        menu.add(daftar);
        
        view = new JButton(imageview);
        view.setBounds(285, 120, 90, 70);
        menu.add(view);
        
        hapus = new JButton(imagehapus);
        hapus.setBounds(430, 120, 90, 70);
        menu.add(hapus);
        
        edit = new JButton(imageprofile);
        edit.setBounds(195, 270, 90, 70);
        menu.add(edit);
        
        exit = new JButton(imagelogout);
        exit.setBounds(370, 270, 90, 70);
        menu.add(exit);
        
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.cekpilihan(pass)==true){
                    JOptionPane.showMessageDialog(null,"Anda sudah memesan","information",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    daftar_taxi(pass);
                    menu.dispose();
                }
                
            }
        });
        
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpesanan(pass);
                menu.dispose();
            }
        });
        
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    NurHolis07181_Controller.driver.upgrade(NurHolis07181_Controller.penumpang.pilihan(pass),null);
                    controller.updatetaxi(pass,null, -1);
                    JOptionPane.showMessageDialog(null,"Berhasil menghapus","information",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){    
                    JOptionPane.showMessageDialog(null,"Anda belum memesan","information",JOptionPane.INFORMATION_MESSAGE);
                }
                textlokasi.setText(null);
            }   
        });
        
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateprofile(pass);
                menudaftar.dispose();
            }
        });
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 menu.dispose();
                 NurHolis07181_GUIRegister awal = new NurHolis07181_GUIRegister();
            }
        });
    }
    
    void daftar_taxi(String pass){
        menudaftar = new JFrame("Daftar Taxi");
        menudaftar.setSize(700, 600);
        menudaftar.getContentPane().setBackground(new Color(80,70, 255));
        menudaftar.setLayout(null);
        
        
        Daftarjudul = new JLabel("Pilih Driver");
        Daftarjudul.setBounds(70, 100, 700, 50);
        Daftarjudul.setFont(new Font("Times New Roman",Font.BOLD,30));
        menudaftar.add(Daftarjudul);
        
        lokasi = new JLabel("Tujuan");
        lokasi.setFont(new Font("Timew new Roman", Font.BOLD, 30));
        lokasi.setBounds(380, 100, 700, 50);
        menudaftar.add(lokasi);
        
        textlokasi = new JTextField();
        textlokasi.setBounds(380, 160, 200, 40);
        menudaftar.add(textlokasi);
        
        namadriver.setBounds(70, 160, 150, 30);
        namadriver.setFont(new Font("Timew new Roman",Font.LAYOUT_LEFT_TO_RIGHT , 14));
        namadriver.setFocusable(false);
        namadriver.setBackground(Color.CYAN);
        menudaftar.add(namadriver);
        
        pilih = new JButton("Daftar");
        pilih.setBackground(Color.YELLOW);
        pilih.setBounds(250, 380, 150, 40);
        pilih.setFont(new Font("Times New Roman",Font.BOLD,30));
        pilih.setFocusable(false);
        menudaftar.add(pilih);
        
        kembali = new JButton("back");
        kembali.setBackground(Color.RED);
        kembali.setBounds(550, 480, 100, 30);
        kembali.setFocusable(false);
        menudaftar.add(kembali);
        
        menudaftar.setVisible(true);
        menudaftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menudaftar.setLocationRelativeTo(null);

        pilih.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
              int indexpenumpang = NurHolis07181_Controller.penumpang.NurHolis07181_cari(pass);
              int indexdriver = namadriver.getSelectedIndex();
              String nama = NurHolis07181_Controller.penumpang.getDatapenumpang().get(indexpenumpang).getNurHolis07181_nama();
              String notelp = NurHolis07181_Controller.penumpang.getDatapenumpang().get(indexpenumpang).getNurHolis07181_notelp();
              if(controller.cekdaftartaxi(indexdriver)==true){
                  controller.updatetaxi(nama, notelp, pass, textlokasi.getText(), indexdriver);
                  JOptionPane.showMessageDialog(null,"Berhasil memesan","information",JOptionPane.INFORMATION_MESSAGE);
                  menudaftar.dispose();
                  menu(pass);
              }else{
                  JOptionPane.showMessageDialog(null,"Driver Sudah Dipesan","information",JOptionPane.INFORMATION_MESSAGE);
              }
            }
        });
        
        
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu(pass);
                menudaftar.dispose();
            }
        });
    }
    
    void viewpesanan(String pass){
        menuview = new JFrame("VIEW");
        menuview.setSize(600, 630);
        menuview.setLayout(null);
        menuview.getContentPane().setBackground(new Color(80,70, 255));
        
        view1 = new JLabel("Profile");
        view1.setFont(new Font("Times New Roman",Font.BOLD,30));
        view1.setBounds(100, 50, 100, 40);
        menuview.add(view1);
        
        textview1 = new JTextArea();
        textview1.setBounds(100, 100, 300, 150);
        menuview.add(textview1);
        
        view2 = new JLabel("Pesanan");
        view2.setFont(new Font("Times New Roman",Font.BOLD,30));
        view2.setBounds(100, 300, 200, 40);
        menuview.add(view2);
        
        textview2 = new JTextArea();
        textview2.setBounds(100, 350, 300, 150);
        menuview.add(textview2);
        
        kembali = new JButton("back");
        kembali.setBackground(Color.RED);
        kembali.setBounds(460, 520, 100, 30);
        kembali.setFocusable(false);
        menuview.add(kembali);
        
        menuview.setVisible(true);
        menuview.setLocationRelativeTo(null);
        menuview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(controller.cekpilihan(pass)==true){                           
            textview1.setText(NurHolis07181_Controller.penumpang.NurHolis07181_view1(pass));
            textview2.setText(NurHolis07181_Controller.driver.viewDriver(NurHolis07181_Controller.penumpang.pilihan(pass)));
        }else{
            textview1.setText(NurHolis07181_Controller.penumpang.NurHolis07181_view2(pass));
            textview2.setText("Anda Belum Memesan");
        }
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu(pass);
                menuview.dispose();
            }
        });
    }
    
    public void updateprofile(String pass){
        updateprofile = new JFrame();
        updateprofile.setSize(650, 500);
        updateprofile.setLayout(null);
        updateprofile.getContentPane().setBackground(new Color(80,70, 255));
        
        Judul = new JLabel("TAXI ONLINE");
        Judul.setBounds(190, 10, 700, 50);
        Judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        updateprofile.add(Judul);
        
        namabaru = new JLabel("Nama");
        namabaru.setBounds(100, 120, 100, 40);
        updateprofile.add(namabaru);
        
        nama = new JTextField();
        nama.setBounds(100, 160, 200, 30);
        updateprofile.add(nama);
        
        notelpbaru = new JLabel("No.Telp");
        notelpbaru.setBounds(100, 200, 100, 40);
        updateprofile.add(notelpbaru);
        
        notelp = new JTextField();
        notelp.setBounds(100, 240, 200, 30);
        updateprofile.add(notelp);
        
        editprof = new JButton("Edit");
        editprof.setBounds(270, 330, 100, 40);
        editprof.setBackground(Color.YELLOW);
        editprof.setFocusable(false);
        updateprofile.add(editprof);
        
        kembali = new JButton("back");
        kembali.setBackground(Color.RED);
        kembali.setBounds(500, 400, 100, 30);
        kembali.setFocusable(false);
        updateprofile.add(kembali);
        
        
        updateprofile.setVisible(true);
        updateprofile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateprofile.setLocationRelativeTo(null);
        
        editprof.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    controller.editprofile(pass,nama.getText(), notelp.getText());
                    controller.editprofile(NurHolis07181_Controller.penumpang.pilihan(pass), nama.getText(), notelp.getText());
                }catch(Exception a){
                   controller.editprofile(pass,nama.getText(), notelp.getText());                 
                }
                nama.setText(null);
                notelp.setText(null);
                JOptionPane.showMessageDialog(null,"Berhasil","information",JOptionPane.INFORMATION_MESSAGE);
                updateprofile.dispose();
                menu(pass);
            }
        });
        
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateprofile.dispose();
                menu(pass);
            }
        });
        
        
    }
    
}
