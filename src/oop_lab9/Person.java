package oop_lab9;

public class Person {
    private String personID;
    private String name;
    private Address address;
    private Job job;


    //constructor

    public Person(String personID, String name, Address address, Job jop) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.job = jop;
    }

    //to string

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", jop=" + job +
                '}';
    }

    //getter and setter method

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJop() {
        return job;
    }

    public void setJop(Job jop) {
        this.job = jop;
    }
}//class
