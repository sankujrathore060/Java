package com.Sankuj.JavaCorePractice.DesignPattern.Builder;

public class LavaConcreateBuilder implements PhoneBuilder{
    Phone phone = new Phone();

    @Override
    public void buildModel(String model) {
        phone.setModel(model);
    }

    @Override
    public void buildCompany(String comp) {
        phone.setCompany(comp);
    }

    @Override
    public void buildOS(String os) {
        phone.setOS(os);
    }

    @Override
    public void buildIsFrontCamera(Boolean isFrantCamera) {
        phone.setFrantCamera(isFrantCamera);
    }

    @Override
    public void buildIsBackCamera(Boolean isBackCamera) {
        phone.setBackCamera(isBackCamera);
    }

    @Override
    public void buildProcessor(String processor) {
        phone.setProcessor(processor);
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
