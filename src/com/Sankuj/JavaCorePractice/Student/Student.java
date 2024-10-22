package com.Sankuj.JavaCorePractice.Student;

public class Student {
    private int Id;
    private String Name;
    private int Age;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void GetStudentInfo(){
        System.out.println("Name :- " +  Name);
        System.out.println("Age :- " +  Age);
        System.out.println("Address :- " +  Address);
    }
}
