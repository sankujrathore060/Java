package com.Sankuj.JavaCorePractice.InnerClass.MemberInnerClass;

public class Laptop {
    private final String Company;
    private int Ssd;
    private int HardDisk;

    public Laptop(String company, int ssd, int hardDisk){
        Company = company;
        Ssd = ssd;
        HardDisk = hardDisk;
    }

    public void open50Browsers(){
        System.out.println("Browser Opened");
    }


    class UpgradeLaptop {
        public void IncreaseSsd500GB(){
            Ssd+=500;
            System.out.println(Company + "SSD Increase by"+ 500 + "GB");
        }

        public void IncreaseHardDisk500GB(){
            HardDisk+=500;
            System.out.println(Company +"Hard Disk Increase by"+ 500 + "GB");
        }

        public void IncreasePerformance(){
            IncreaseSsd500GB();
            IncreaseHardDisk500GB();
        }
    }

}
