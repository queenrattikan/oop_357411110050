package oop_lab9;

public class Job {
    private String position;
    private double salary;

    //constructor

    public Job(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }


    //to string

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }


    //getter and setter method


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
