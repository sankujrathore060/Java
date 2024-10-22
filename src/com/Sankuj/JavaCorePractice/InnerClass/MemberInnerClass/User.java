package com.Sankuj.JavaCorePractice.InnerClass.MemberInnerClass;

public class User {
    public static void main(String... args){
        Laptop laptop = new Laptop("HP", 250, 500);
        laptop.open50Browsers();
        Laptop.UpgradeLaptop upgradeLaptop = laptop.new UpgradeLaptop();
        upgradeLaptop.IncreasePerformance();
        laptop.open50Browsers();
    }
}
