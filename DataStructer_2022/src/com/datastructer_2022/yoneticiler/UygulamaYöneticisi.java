package com.datastructer_2022.yoneticiler;

import com.datastructer_2022._uygulamalar._03_stack.StackTest;
import com.datastructer_2022._uygulamalar._04_kuyruk.KuyrukTest;
import com.datastructer_2022._uygulamalar._05_agac_veri_yapıları.AgacVeriYapısıTest;
import com.datastructer_2022._uygulamalar._06_avl_agacı.AVLAgacıTest;
import com.datastructer_2022._uygulamalar._07_ikili_arama_agacı.IkiliAramaAgacıTest;
import com.datastructer_2022._uygulamalar._08_agacta_dolasım.AgactaDolasımTest;
import com.datastructer_2022._uygulamalar._09_sıralama_algoritmaları.SıralamaAlgoritmalarıTest;
import com.datastructer_2022._uygulamalar._10_arama_algoritmaları.AramaAlgoritmalarıTest;
import com.datastructer_2022.ortak.Sabitler;
import com.datastructer_2022._uygulamalar._01_tekyonlu_linkedlist.TekYonluLinkedListTest;
import com.datastructer_2022._uygulamalar._02_ciftyonlu_linkedlist.CiftYonluLinkedListTest;

import java.util.ArrayList;

public class UygulamaYöneticisi {

    private ArrayList<ICalısabilirDataStructure> butunUygulamalar;
    private KullanıcıGirdisiOkuma kullanıcıGirdisiOkuma;

    public void butunUygulamalarıKaydet(KullanıcıGirdisiOkuma kullanıcıGirdisiOkuma) {

        this.kullanıcıGirdisiOkuma = kullanıcıGirdisiOkuma;

        butunUygulamalar = new ArrayList<ICalısabilirDataStructure>();

        //Sıralama önemli
        butunUygulamalar.add(new TekYonluLinkedListTest());
        butunUygulamalar.add(new CiftYonluLinkedListTest());
        butunUygulamalar.add(new StackTest());
        butunUygulamalar.add(new KuyrukTest());
        butunUygulamalar.add(new AgacVeriYapısıTest());
        butunUygulamalar.add(new AVLAgacıTest());
        butunUygulamalar.add(new IkiliAramaAgacıTest());
        butunUygulamalar.add(new AgactaDolasımTest());
        butunUygulamalar.add(new SıralamaAlgoritmalarıTest());
        butunUygulamalar.add(new AramaAlgoritmalarıTest());

    }

    protected void butunUygulamalarıYazdır()
    {
        for (int i = 0; i < butunUygulamalar.size(); i++) {
            String  uygulamaIsmi = butunUygulamalar.get(i).uygulamaIsminiAl();
            System.out.println((i+1) + ". uygulama: " + uygulamaIsmi);
        }
    }



    protected void secilenUygulamayıBaslat(int uygulamaSayısı) {
        if (uygulamaSayısı<0 || uygulamaSayısı > Sabitler.UYGULAMA_SAYISI){
            System.out.println("Lütfen 1 ile " + Sabitler.UYGULAMA_SAYISI +" arasında bir sayı girerek ilgili uygulamayı çalıştırınız!\n");
            return;
        }

        System.out.println("-----------------------" + butunUygulamalar.get(uygulamaSayısı - 1).uygulamaIsminiAl() + " calıstırılıyor!\n\n");
        butunUygulamalar.get(uygulamaSayısı - 1).calıstır();
        System.out.println("\n\n-----------------------" + butunUygulamalar.get(uygulamaSayısı - 1).uygulamaIsminiAl() + " çalıştırıldı!\n\n");

        //Çalıştırmak için yeni uygulama seçimi
        kullanıcıGirdisiOkuma.devamEtmekIstıyormusunuz(this);
    }
}
