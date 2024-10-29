package com.Sankuj.JavaCorePractice.DesignPattern.Builder;

public class Provider {
    public static void main(String[] args) {

        NarzoConcreateBuilder narzo = new NarzoConcreateBuilder();
        LavaConcreateBuilder lava = new LavaConcreateBuilder();

        PhoneDirector director = new PhoneDirector(narzo);
        PhoneDirector director2 = new PhoneDirector(lava);

        Phone narzoPhone = director.buildPhone("Narzo", "123", "VI", "Dual Core", true, true);
        Phone lavaPhone = director.buildPhone("Lava", "1234", "VV", "Dual Core", true, true);


        narzoPhone.showInfo();
        lavaPhone.showInfo();
    }
}
