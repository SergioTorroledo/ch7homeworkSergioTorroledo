/**
 * Class:School
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:7.12.3.
 * @written on:12/07/2023
 * Course:ITEC 2140-13 Saturday
 * This class created a list were you can find students information
 * */
package ch7homeworkSergioTorroledo;

import java.util.ArrayList;

public class School {
    private ArrayList<student> studentList;

    public School(){
        this.studentList = new ArrayList<>();
    }

    public void addStudent(student Student){
        studentList.add(Student);
    }
    public void  removeStudent(student Student){
        studentList.remove(Student);

    }
    public student findYoungestStudent(){
        if (studentList.isEmpty()){
            return null;
        }
        student youngestStudetn = studentList.get(0);
        for(student Student : studentList){
            if(Student.getAge() < youngestStudetn.getAge()){
                youngestStudetn = Student;
            }
        }
        return youngestStudetn;
    }
    public student findOldestStundet(){
        if(studentList.isEmpty()){
            return null;
        }
    student oldestStudent = studentList.get(0);
        for(student Student : studentList){
            if(Student.getAge()> oldestStudent.getAge()){
                oldestStudent = Student;
            }
        }
        return oldestStudent;
    }

}
