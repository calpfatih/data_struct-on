package com.datastructer_2022;

import com.datastructer_2022.yoneticiler.KullanıcıGirdisiOkuma;
import com.datastructer_2022.yoneticiler.UygulamaYöneticisi;

public class Main {

    public static void main(String[] args) {

        UygulamaYöneticisi uygulamaYöneticisi = new UygulamaYöneticisi();
        KullanıcıGirdisiOkuma kullanıcıGirdisiOkuma = new KullanıcıGirdisiOkuma();

        uygulamaYöneticisi.butunUygulamalarıKaydet(kullanıcıGirdisiOkuma);
        kullanıcıGirdisiOkuma.girdileriAl(uygulamaYöneticisi);
    }

}
