import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Alan ve cevre hesabi");
        int islem;
        Scanner scanner = new Scanner(System.in);
        islem= Integer.parseInt(scanner.nextLine());
        switch (islem){
            case 1: kare();
                    break;
            case 2: dikdortgen();
                    break;
            case 3 : dikucgenhesap();
                    break;
            default: System.out.println("Diğer işlemler eklenecek");
        }
        //kare();
        //dikdortgen();
        //dikucgenhesap();
    }
    static  int kare(){
        //JTextField
        //obj,setbounds(x,y,width,height)
        JFrame f = new JFrame("Alan ve cevre hesabi");

        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        JButton btn;

        //Label işlemleri

        l1 = new JLabel("kenar");
        l1.setBounds(50,20,100,30);
        f.add(l1);

        l2 = new JLabel("alan ");
        l2.setBounds(50,70,100,30);
        f.add(l2);

        l3 = new JLabel("cevre");
        l3.setBounds(50,120,100,30);
        f.add(l3);
        //Textfield işlemleri
        t1 = new JTextField();
        t1.setBounds(50,40,200,30);
        f.add(t1);

        t2 =new JTextField();
        t2.setBounds(50,100,200,30);
        f.add(t2);
        t2.setEditable(false);

        t3 = new JTextField();
        t3.setBounds(50,160,200,30);
        t3.setEditable(false); //Metin alanı düzenlenemez oldu.
        f.add(t3);

        //Button işlemleri
        btn = new JButton("hesapla");
        btn.setBounds(50,220,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText()); //Dışardan değer alındı
                int c= a*a;                           //alan hesabi yapildi
                String alan = String.valueOf(c);     //String değere dönüştü
                t2.setText(alan);
                int d= a*4;
                String cevre = String.valueOf(d);
                t3.setText(cevre);                    //T3'e değer aktarıldı.


            }
        });
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        return  0;
    }

    static  int dikdortgen(){
        //Dikdörgenin alanı ve çevresini  hesaplayan program
        int kenar1,kenar2,alan1,cevre1;

        //JTextField
        //obj,setbounds(x,y,width,height)
        JFrame f = new JFrame("Alan ve cevre hesabi");

        JLabel l1,l2,l3,l4;
        JTextField t1,t2,t3,t4;
        JButton btn;

        //Label işlemleri

        l1 = new JLabel("kenar1 ");
        l1.setBounds(50,20,100,30);
        f.add(l1);

        l2 = new JLabel("kenar2 ");
        l2.setBounds(50,70,100,30);
        f.add(l2);

        l3 = new JLabel("alan ");
        l3.setBounds(50,120,100,30);
        f.add(l3);

        l4 = new JLabel("cevre");
        l4.setBounds(50,180,100,30);
        f.add(l4);
        //Textfield işlemleri
        t1 = new JTextField();
        t1.setBounds(50,40,200,30);
        f.add(t1);

        t2 =new JTextField();
        t2.setBounds(50,100,200,30);
        f.add(t2);


        t3 = new JTextField();
        t3.setBounds(50,160,200,30);
        t3.setEditable(false); //Metin alanı düzenlenemez oldu.
        f.add(t3);


        t4 = new JTextField();
        t4.setBounds(50,220,200,30);
        t4.setEditable(false); //Metin alanı düzenlenemez oldu.
        f.add(t4);


        //Button işlemleri
        btn = new JButton("hesapla");
        btn.setBounds(50,280,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kenar1 = Integer.parseInt(t1.getText()); //Dışardan değer alındı
                int kenar2 = Integer.parseInt(t2.getText());

                int c= kenar1*kenar2;                           //alan hesabi yapildi
                 String alan = String.valueOf(c);     //String değere dönüştü
                t3.setText(alan);
                int d=(kenar1+kenar2)*2;
                String cevre = String.valueOf(d);
                t4.setText(cevre);                    //T4'e değer aktarıldı.


            }
        });
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        return  0;
    }

    static  int  dikucgenhesap(){
        //Dikdörgenin alanı ve çevresini  hesaplayan program
        int kenar1,kenar2,alan1,cevre1;

        //JTextField
        //obj,setbounds(x,y,width,height)
        JFrame f = new JFrame("Alan ve cevre hesabi");

        JLabel l1,l2,l3,l4,l5,l6,l7;
        JTextField t1,t2,t3,t4,t5,t6,t7;
        JButton btn;

        //Label işlemleri

        l1 = new JLabel("kenar1 ");
        l1.setBounds(50,20,100,30);
        f.add(l1);

        l2 = new JLabel("kenar2 ");
        l2.setBounds(50,70,100,30);
        f.add(l2);

        l3 = new JLabel("kenar3 ");
        l3.setBounds(50,120,100,30);
        f.add(l3);


        l4 = new JLabel("Taban ");
        l4.setBounds(50,170,100,30);
        f.add(l4);


        l5 = new JLabel("yukseklik ");
        l5.setBounds(50,220,100,30);
        f.add(l5);

        l6 = new JLabel("alan ");
        l6.setBounds(50,270,100,30);
        f.add(l6);

        l7 = new JLabel("cevre");
        l7.setBounds(50,320,100,30);
        f.add(l7);
        //Textfield işlemleri
        t1 = new JTextField();
        t1.setBounds(50,40,200,30);
        f.add(t1);

        t2 =new JTextField();
        t2.setBounds(50,100,200,30);
        f.add(t2);


        t3 = new JTextField();
        t3.setBounds(50,150,200,30);
        f.add(t3);


        t4 = new JTextField();
        t4.setBounds(50,200,200,30);
        f.add(t4);

        t5 = new JTextField();
        t5.setBounds(50,250,200,30);

        f.add(t5);

        t6 = new JTextField();
        t6.setBounds(50,300,200,30);
        t6.setEditable(false); //Metin alanı düzenlenemez oldu.
        f.add(t6);

        t7 = new JTextField();
        t7.setBounds(50,350,200,30);
        t7.setEditable(false); //Metin alanı düzenlenemez oldu.
        f.add(t7);



        //Button işlemleri
        btn = new JButton("hesapla");
        btn.setBounds(50,460,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kenar1 = Integer.parseInt(t1.getText()); //Dışardan değer alındı
                int kenar2 = Integer.parseInt(t2.getText());
                int kenar3 = Integer.parseInt(t3.getText());
                int taban = Integer.parseInt(t4.getText());
                int yukseklik = Integer.parseInt(t5.getText());

                int c= (taban*yukseklik)/2;;                           //alan hesabi yapildi
                String alan = String.valueOf(c);     //String değere dönüştü
                t6.setText(alan);
                int d=kenar1+kenar2+kenar3;
                String cevre = String.valueOf(d);
                t7.setText(cevre);                    //T7'e değer aktarıldı.


            }
        });
        f.add(btn);

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        return  0;
    }
}