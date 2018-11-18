package com.company;

public class Main {
    static class KursName {
        String name;
    }
    static class Cipher {
        String cip;
    }
    static class Faculty {
        String Faculty, group;
        int kurs;
    }
    static class Hours {
        int [] hrs = new int[3];
    }
    static class PrepodName {
        String professor;
    }
    static class AssistName {
        String firstAssist, scndAssist;
    }

    public static void main(String[] args) {
        KursName kurs1 = new KursName();
        Cipher cip1 = new Cipher();
        Faculty facul = new Faculty();
        Faculty group1 = new Faculty();
        Faculty kursstud = new Faculty();
        Hours hrs1 = new Hours();
        PrepodName professorname = new PrepodName();
        AssistName assist1 = new AssistName();
        AssistName assist2 = new AssistName();
        System.out.println("Название курса/спецкурса: " + kurs1.name);
        System.out.println("Шифр курса: " + cip1.cip);
        System.out.println("Для студентов факультета " + facul.Faculty + "; Группы " + group1.group + "; Курс: " + kursstud.kurs);
        System.out.println("Количество часов, выделяемых на лекции: " + hrs1.hrs[0] + "\nКоличество часов, выделяемых на практические занятия: " + hrs1.hrs[1] + "\nКоличество часов, выделяемых на лабораторные работы: " + hrs1.hrs[2]);
        System.out.println("ФИО преподавателя: " + professorname.professor);
        System.out.println("ФИО ассистентов, ведущих практические и лабораторные занятия: " + assist1.firstAssist + ", " + assist2.scndAssist);
    }
}