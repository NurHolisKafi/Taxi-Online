
package GUI;

import Controller.NurHolis07181_Controller;
import java.awt.Color;import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NurHolis07181_GUIAdmin {
    NurHolis07181_Controller controller = new NurHolis07181_Controller();
    JFrame menuadmin = new JFrame("Admin");
    JFrame Tambah,Hapus;
    JLabel judul,judul2,labelnama,labelid,labelnotelp,labeljenis,labelwarna,labelplat,labelpass,labelhapus;
    JTextField textnama,textid,textnotelp,textjenis,textwarna,textplat,texthapus;
    JPasswordField password;
    JButton tambahdriver,hapusdriver,exit,daftar,back,hapusnama;

    public NurHolis07181_GUIAdmin() {
        MenuAdmin();
    }
    
    void MenuAdmin(){
        menuadmin.setSize(650,500);
        menuadmin.getContentPane().setBackground(new Color(80,70, 255));
        menuadmin.setLayout(null);
        
        judul = new JLabel("Admin");
        judul.setBounds(250, 30, 700, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        menuadmin.add(judul);
        
        tambahdriver = new JButton("Tambah Driver");
        tambahdriver.setBounds(225, 150, 170, 40);
        tambahdriver.setBackground(Color.GREEN);
        tambahdriver.setFocusable(false);
        menuadmin.add(tambahdriver);
        
        hapusdriver = new JButton("Hapus Driver");
        hapusdriver.setBounds(225, 220, 170, 40);
        hapusdriver.setBackground(Color.GREEN);
        hapusdriver.setFocusable(false);
        menuadmin.add(hapusdriver);
        
        exit = new JButton("Logout");
        exit.setBounds(225, 290, 170, 40);
        exit.setBackground(Color.GREEN);
        exit.setFocusable(false);
        menuadmin.add(exit);
     
        menuadmin.setVisible(true);
        menuadmin.setLocationRelativeTo(null);
        menuadmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tambahdriver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tambah();
                menuadmin.dispose();
            }
        });
        
        hapusdriver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               hapus();
               menuadmin.dispose();
            }
        });
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuadmin.dispose();
                NurHolis07181_GUIRegister register = new NurHolis07181_GUIRegister();
            }
        });
    }
    
    void Tambah(){
        Tambah = new JFrame("Tambah");
        Tambah.setSize(680, 700);
        Tambah.setLayout(null);
        Tambah.getContentPane().setBackground(new Color(80,70, 255));
        
        judul2 = new JLabel("Tambah Driver");
        judul2.setBounds(220, 30, 700, 50);
        judul2.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tambah.add(judul2);

        labelnama = new JLabel("Nama");
        labelnama.setBounds(50, 130, 150, 30);
        Tambah.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(50, 160, 200, 30);
        Tambah.add(textnama);
        
        labelpass = new JLabel("Password");
        labelpass.setBounds(50, 190, 150, 30);
        Tambah.add(labelpass);
        
        password = new JPasswordField();
        password.setBounds(50, 220, 200, 30);
        Tambah.add(password);
        
        labelnotelp = new JLabel("No.Telp");
        labelnotelp.setBounds(50, 250, 150, 30);
        Tambah.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(50, 280, 200, 30);
        Tambah.add(textnotelp);
        
        labelid = new JLabel("ID");
        labelid.setBounds(50, 310, 150, 30);
        Tambah.add(labelid);
        
        textid = new JTextField();
        textid.setBounds(50, 340, 200, 30);
        Tambah.add(textid);
        
        labeljenis = new JLabel("Mobil");
        labeljenis.setBounds(400, 130, 150, 30);
        Tambah.add(labeljenis);
        
        textjenis = new JTextField();
        textjenis.setBounds(400, 160, 200, 30);
        Tambah.add(textjenis);
        
        labelwarna = new JLabel("Warna");
        labelwarna.setBounds(400, 190, 150, 30);
        Tambah.add(labelwarna);
        
        textwarna = new JTextField();
        textwarna.setBounds(400, 220, 200, 30);
        Tambah.add(textwarna);
        
        labelplat = new JLabel("plat");
        labelplat.setBounds(400, 250, 150, 30);
        Tambah.add(labelplat);
        
        textplat = new JTextField();
        textplat.setBounds(400, 280, 200, 30);
        Tambah.add(textplat);
        
        daftar = new JButton("Tambah");
        daftar.setBounds(250, 480, 150, 45);
        daftar.setBackground(Color.GREEN);
        daftar.setFocusable(false);
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Tambah.add(daftar);
        
        back = new JButton("back");
        back.setBounds(520, 570, 100, 30);
        back.setBackground(Color.RED);
        back.setFocusable(false);
        Tambah.add(back);
        
        Tambah.setVisible(true);
        Tambah.setLocationRelativeTo(null);
        Tambah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String nama = textnama.getText();
                    String id = textid.getText();
                    String pass = password.getText();
                    String notelp = textnotelp.getText();
                    String jenis = textjenis.getText();
                    String warna = textwarna.getText();
                    String plat = textplat.getText();
                    controller.tambahdriver(nama, id, pass, notelp, warna, plat, jenis);
                    JOptionPane.showMessageDialog(null, "Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ab){
                    JOptionPane.showMessageDialog(null, "Gagal daftar", "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
                kosong();
                Tambah.dispose();
                MenuAdmin();
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tambah.dispose();
                MenuAdmin();
            }
        });

    }
    
    
    void hapus(){
        Hapus = new JFrame("Hapus");
        Hapus.setSize(500, 450);
        Hapus.setLayout(null);
        Hapus.getContentPane().setBackground(new Color(80,70, 255));
        
        labelhapus = new JLabel("Nama");
        labelhapus.setBounds(100, 100, 150, 30);
        Hapus.add(labelhapus);
        
        texthapus = new JTextField();
        texthapus.setBounds(100, 130, 200, 30);
        Hapus.add(texthapus);
        
        hapusnama = new JButton("Hapus");
        hapusnama.setBounds(180, 230, 100, 30);
        hapusnama.setBackground(Color.GREEN);
        hapusnama.setFocusable(false);
        Hapus.add(hapusnama);
        
        back = new JButton("back");
        back.setBounds(340, 340, 100, 30);
        back.setBackground(Color.RED);
        back.setFocusable(false);
        Hapus.add(back);
        
        Hapus.setVisible(true);
        Hapus.setLocationRelativeTo(null);
        Hapus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        hapusnama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String namahapus = texthapus.getText();
                try{
                    controller.hapusdriver(namahapus);
                    JOptionPane.showMessageDialog(null, "Berhasil menghapus", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    Hapus.dispose();
                    MenuAdmin();
                }catch(Exception hapus){
                    JOptionPane.showMessageDialog(null, "Nama tidak ada", "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
                texthapus.setText(null);
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hapus.dispose();
                MenuAdmin();
            }
        });
    }
    
    
    
    void kosong(){
        textnama.setText(null);
        textid.setText(null);
        textjenis.setText(null);
        textnotelp.setText(null);
        textplat.setText(null);
        textwarna.setText(null);
        password.setText(null);
    }
}
