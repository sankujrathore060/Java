package com.Sankuj.JavaCorePractice.DesignPattern.Builder;

public class PhoneDirector {
    private static PhoneBuilder builder = null;
    public PhoneDirector(PhoneBuilder builder){
        this.builder = builder;
    }
    public Phone buildPhone(String Name, String model, String Comp, String Os, Boolean isFront, Boolean isBack){
        builder.buildIsFrontCamera(isFront);
        builder.buildOS(Os);
        builder.buildModel(model);
        builder.buildCompany(Comp);
        return builder.getPhone();
    }
}
