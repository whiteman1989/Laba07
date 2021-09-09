package com.company.UI.components;

import com.company.data.models.Student;

import javax.swing.*;
import java.util.List;

public class Table {


    private List<Student> _students;
    private Object[] _header;
    private JTable table;

    public Table(List<Student> students) {
        _students = students;
        table = new JTable(StudentsToData(), _header);
    }

    public JTable GetTable() {
        return table;
    }

    private Object[][] StudentsToData() {
        Object[][] data = new Object[_students.size()][2];
        for(int i = 0; i < _students.size(); i++) {
            data[i][0] = _students.get(i).firstName+" "+_students.get(i).lastName;
            data[i][1] = _students.get(i).age;
        }
        return data;
    }



}
