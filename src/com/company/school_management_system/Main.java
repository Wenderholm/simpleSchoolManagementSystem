package com.company.school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);


        School school = new School(teacherList,studentList);
//      tamasha pierwsza wplata
        tamasha.payFees(5000);
//      tamasha druga wplata
        tamasha.payFees(5000);

        rakshith.payFees(6000);

        System.out.println("szkola zarobiła $ " +school.getTotalMoneyEarned());
        System.out.println("student tamasha wpłaciłą " + tamasha.getFeesPaid() + " do konca roku pozostało jej do zapłaczenia "+ tamasha.getRemainingFees());


        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("szkola wypłaciła wypłatę dla"+ lizzy.getName() +" i kwota jaka została to: "+ school.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("szkola wypłaciła wypłatę dla"+ vanderhorn.getName() +" i kwota jaka została to: "+ school.getTotalMoneyEarned());

        System.out.println("sprawdzenie informacji o studentach");
        System.out.println(rakshith);
        System.out.println(tamasha);


        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);
    }
}
