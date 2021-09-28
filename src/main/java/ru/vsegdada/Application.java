package ru.vsegdada;

import ru.vsegdada.entity.Skynet;

public class Application {
    public static void main(String[] args) {
        Skynet skynet = new Skynet();
        skynet.setTerminatorsCount(19);
        skynet.startRevolution();
        System.out.println(skynet.getTerminatorsCount());
        System.out.println(skynet.isRiseRevolution());
    }
}
