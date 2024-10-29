package com.Sankuj.JavaCorePractice.DesignPattern.Builder;

public interface PhoneBuilder {
    void buildModel(String model);
    void buildCompany(String comp);
    void buildOS(String os);
    void buildIsFrontCamera(Boolean isFrantCamera);
    void buildIsBackCamera(Boolean isBackCamera);
    void buildProcessor(String Processor);
    Phone getPhone();
}
