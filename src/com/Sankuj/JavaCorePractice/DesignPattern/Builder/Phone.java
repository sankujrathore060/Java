package com.Sankuj.JavaCorePractice.DesignPattern.Builder;

public class Phone {
    private String Name;



    private String Model;
    private String Company;
    private String OS;
    private boolean IsBackCamera;
    private boolean IsFrantCamera;
    private String Processor;

    public void setName(String name) {
        Name = name;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setBackCamera(boolean backCamera) {
        IsBackCamera = backCamera;
    }

    public void setFrantCamera(boolean frantCamera) {
        IsFrantCamera = frantCamera;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public void showInfo(){
        System.out.println(Company + " " + Model);
    }

}
