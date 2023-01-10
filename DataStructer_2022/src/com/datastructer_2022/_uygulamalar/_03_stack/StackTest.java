package com.datastructer_2022._uygulamalar._03_stack;

import com.datastructer_2022.yoneticiler.ICalısabilirDataStructure;
import com.datastructer_2022.ortak.Sabitler;

public class StackTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
        Stack stack = new Stack();
        stack.push("elma");
        stack.push("armut");
        stack.push("kivi");

        System.out.println("Stack boyutu: " + stack.size());
        System.out.println("Top eleman: " + stack.top());

        stack.pop();
        System.out.println("Pop sonrası Stack boyutu: " + stack.size());
        System.out.println("Pop sonrası top elemanı: " + stack.top());
    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.STACK;
    }
}
