package com.Sankuj.JavaCorePractice.InnerClass.StaticNestedClass;

public class Employee {
    private String Name;
    private int Age;
    private String Department;
    private Address Address;

    public Employee(String name, int age, String homeAddress, String officeAddress){
        Name = name;
        Age = age;
        Address = new Address(homeAddress, officeAddress);
    }

    static class Address {

        private String HomeAddress;
        private String OfficeAddress;

        public Address(String officeAddress, String homeAddress) {
            OfficeAddress = officeAddress;
            HomeAddress = homeAddress;
        }

        public String getHomeAddress() {
            return HomeAddress;
        }

        public void setHomeAddress(String homeAddress) {
            HomeAddress = homeAddress;
        }

        public String getOfficeAddress() {
            return OfficeAddress;
        }

        public void setOfficeAddress(String officeAddress) {
            OfficeAddress = officeAddress;
        }
    }


    public static void main(String... args){
        Employee employee = new Employee("Sankuj", 24, "abx", "abc");
        System.out.println(employee.Address.getHomeAddress());
    }
}
