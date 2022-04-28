package com.company;

import java.util.Scanner;
class Person {

    public String name;
    public String dateOfBirth;
    public String gender;
    public String mobileNumber;
    public String bloodGroup;

    public String getname() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }
    public void setdataOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getgender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getmobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getbloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
public class Donor extends Person{
    public String bloodBankName;
    public String donorType;
    public String donationDate;

    public String getbloodBankName() {
        return bloodBankName;
    }
    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }
    public String getdonorType() {
        return donorType;
    }
    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }
    public String getdonationDate() {
        return donationDate;
    }
    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public void displayDonationDetails(){
        System.out.println("Donation Details:");
    }
    public static void main(String[] args) {

        Person S1 = new Person();
        Donor S2 = new Donor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name:");
        S1.setName(sc.nextLine());

        System.out.println("Enter Date of Birth:");
        S1.setdataOfBirth(sc.nextLine());

        System.out.println("Enter Gender:");
        S1.setGender(sc.nextLine());

        System.out.println("Enter Mobile Number:");
        S1.setMobileNumber(sc.nextLine());

        System.out.println("Enter Blood Group:");
        S1.setBloodGroup(sc.nextLine());

        System.out.println("Enter Blood Bank Name:");
        S2.setBloodBankName(sc.nextLine());

        System.out.println("Enter Donor Type:");
        S2.setDonorType(sc.nextLine());

        System.out.println("Enter Donation Date:");
        S2.setDonationDate(sc.nextLine());

        S2.displayDonationDetails();
        System.out.println("Name:" +S1.getname());
        System.out.println("Date of Birth:" +S1.getdateOfBirth());
        System.out.println("Gender:" +S1.getgender());
        System.out.println("Mobile Number:" +S1.getmobileNumber());
        System.out.println("Blood Group:" +S1.getbloodGroup());
        System.out.println("Blood Bank Name:" +S2.getbloodBankName());
        System.out.println("Donor Type:" +S2.getdonorType());
        System.out.println("Donation Date:" +S2.getdonationDate());


    }
}