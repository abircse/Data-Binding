package com.studioabir.databainding.databinding;

public class Person {

    private String Firstname;
    private String Lastname;

    public Person(String firstname, String lastname) {
        Firstname = firstname;
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
