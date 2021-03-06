package com.pixel.sandbox.students_group;

import java.util.ArrayList;

public class Group{
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudents(Student... students) {
        for (Student student : students) {
            this.students.add(student);
        }
    }

    public void delStudentByIndex(int studentsIndex) {
        if (studentsIndex < 1 || studentsIndex > students.size()){
            return;
        }

        students.remove(studentsIndex-1);
    }

    public void viewGroupList() {
        for (int i = 0, size = students.size(); i < size; i++) {
            System.out.println((i + 1) + ". " + students.get(i).getFullName());
        }
    }

    public void viewContractStudents() {
        for (Student student : students) {
            if (student instanceof ContractStudent){
                System.out.println(student.getFullName() + " " + ((ContractStudent) student).getContractCost());
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
