package ru.geekbrains;

import java.time.Year;

public class Employees {

    private static int person;
    private String fio;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int ageOld;

    public Employees(String fio,String position,String email,String telephone,int salary, int ageOld){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.ageOld = ageOld;
        person++;
    }

    public void printInfo(){
        int newAge = Year.now().getValue()-ageOld;
        System.out.printf("Name: %s, Position: %s, Age: %d\n",fio, position,newAge);
        System.out.printf("   ");
        System.out.printf("Email: %s, telephone: %s, Salary: %d\n",email,telephone,salary);


    }

    public int getAgeOld() {
        return Year.now().getValue() -ageOld;
    }
    public String getFio(){
        return fio;
    }

    public boolean isRetired(){
        String man = "вич";
        String woman = "вна";
        String patronymic = "";

        for (String retval : fio.split(" ")){
            patronymic =retval;
        }

            return (patronymic.contains(man) && Year.now().getValue() -ageOld>=61)||(patronymic.contains(woman) && Year.now().getValue() -ageOld>=56);

    }
}
