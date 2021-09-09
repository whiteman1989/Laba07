package com.company.buisnessLogic;

import com.company.buisnessLogic.intefaces.MilitaryCommissar;
import com.company.data.models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager implements MilitaryCommissar {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<Student>();
    }

    @Override
    public List<Student> GetAdults() {
        List<Student> adults = students.stream().filter(s -> s.age >= 18)
                .collect(Collectors.toList());
        return adults;
    }

    public void AddStudent(Student student) {
        students.add(student);
    }

    public void SortStudentsByName() {
        students = students.stream().sorted(Comparator.comparing(s -> s.firstName+" "+s.lastName))
                .collect(Collectors.toList());
    }

    public void SortByAge() {
        students = students.stream().sorted(Comparator.comparing(s -> s.age))
                .collect(Collectors.toList());
    }

    public List<Student> GetAll() {
        return students;
    }
}
