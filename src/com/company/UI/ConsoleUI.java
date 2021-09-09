package com.company.UI;

import com.company.buisnessLogic.StudentManager;
import com.company.buisnessLogic.intefaces.MilitaryCommissar;
import com.company.data.models.Student;

import java.util.List;

public class ConsoleUI {
    StudentManager studentManager = new StudentManager();

    public void Execute() {
        studentManager.AddStudent(new Student("Andri", "Vilshanski", 17));
        studentManager.AddStudent(new Student("Oleg", "Mostovi", 19));
        studentManager.AddStudent(new Student("Mikita", "Skorik", 16));
        studentManager.AddStudent(new Student("Evhen", "Kovalenko", 20));

        System.out.println("\t-->Get all student from StudentManager class");
        PrintStudents(studentManager.GetAll());
        System.out.println("\t-->Sort by age");
        studentManager.SortByAge();
        PrintStudents(studentManager.GetAll());
        System.out.println("\t-->Get adult student throws MilitaryCommissar interface");
        MilitaryCommissar militaryCommissar = studentManager;
        PrintStudents(militaryCommissar.GetAdults());
    }

    private void PrintStudents(List<Student> students) {
        for (Student s: students) {
            System.out.println("name: " + s.firstName+" "+s.lastName+" | score: "+s.score + " | age: " + s.age);
        }
    }

}
