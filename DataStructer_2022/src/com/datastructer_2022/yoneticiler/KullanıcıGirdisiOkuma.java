package com.datastructer_2022.yoneticiler;

import com.datastructer_2022.ortak.Sabitler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullanıcıGirdisiOkuma {

    public void girdileriAl(UygulamaYöneticisi uygulamaYöneticisi) {

        System.out.println("Lütfen 1 ile " + Sabitler.UYGULAMA_SAYISI +" arasında bir sayı girerek ilgili uygulamayı çalıştırınız!\n");

        uygulamaYöneticisi.butunUygulamalarıYazdır();

        System.out.println("\nLütfen çalıştırmak istediğiniz uygulamanın sayısını giriniz");

        //Kullanıcı girdisi
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int girdi = sc.nextInt();
            if (girdi < 1 || girdi > Sabitler.UYGULAMA_SAYISI) {
                yanlısGirdiTekrarDeneyin(uygulamaYöneticisi);
                return;
            }

            uygulamaYöneticisi.secilenUygulamayıBaslat(girdi);
        } else {
            yanlısGirdiTekrarDeneyin(uygulamaYöneticisi);
        }
    }

    protected void devamEtmekIstıyormusunuz(UygulamaYöneticisi uygulamaYöneticisi)
    {
        ArrayList<String> uygulamaSayıları = new ArrayList<String>();

        for (int i = 0; i < Sabitler.UYGULAMA_SAYISI; i++) {
            uygulamaSayıları.add(String.valueOf(i+1));
        }

        System.out.println("Devam etmek için uygulama sayısı giriniz. \nMenüyü tekrar görmek için  d ye bitimek için herhangi bir tuşa basınız");

        //Kullanıcı girdisi
        Scanner sc = new Scanner(System.in);
        String girdi = sc.next();
        if (girdi.equals("d") || girdi.equals("D")){
            girdileriAl(uygulamaYöneticisi);
            return;
        }else if (uygulamaSayıları.contains(girdi)){
            uygulamaYöneticisi.secilenUygulamayıBaslat(Integer.parseInt(girdi));
            return;
        }

        System.out.println("Uygulamaları çalıştırdığınız için teşekkürler. Tekrar çalıştırmak istediğinizde hep buradayız. En kısa zamanda tekrar görüşmek dileği ile!\n");
    }

    private void yanlısGirdiTekrarDeneyin(UygulamaYöneticisi uygulamaYöneticisi) {
        System.out.println("Lütfen 1 ile " + Sabitler.UYGULAMA_SAYISI +" arasında bir sayı girerek ilgili uygulamayı çalıştırınız!\n");
        girdileriAl(uygulamaYöneticisi);
    }

}
