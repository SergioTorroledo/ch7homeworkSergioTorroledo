/**
 * Class:student
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:7.12.1.
 * @written on:12/07/2023
 * Course:ITEC 2140-13 Saturday
 * This class created a storage were you can find students information
 * */
package ch7homeworkSergioTorroledo;

public class student {
    private int id;
    private int age;
    private double gpa;
    private int creditHoursAccomplished;

    public student(int id, int age, double gpa, int creditHoursAccomplished) {
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHoursAccomplished = creditHoursAccomplished;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;

    }

    public int getCreditHoursAccomplished() {
        return creditHoursAccomplished;
    }

    public void setCreditHoursAccomplished(int creditHoursAccomplished) {
        this.creditHoursAccomplished = creditHoursAccomplished;
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){

       return false;
        }
        student Student = (student) obj;
        return id == Student.id;
    }
    public String toString(){
        return "Student name: "+ id;
    }
}

