package ru.geekbrains;

public class Lesson_5 {

    public static void main(String[] args){
        Employees [] arrEmployees = {
                new Employees("Петров Иван Иванович","инженер","petrof@mail.ru","567856",30000,1986),
                new Employees("Иванов Петр Иванович","бухгалтер","ivanov@mail.ru","234556",30000,1965),
                new Employees("Крючкова Дарья Денисовна","менеджер","kruchkova@mail.ru","",35000,1990),
                new Employees("Пушкова Валентина Борисовна","кадровик","pushkova@mail.ru","986390",40000,1955),
                new Employees("Сумкин Иван Васильевич","отладчик","symkin@mail.ru","345421",30000,1980)
        };

        for(int i=0; i<5; i++){
            if(arrEmployees[i].getAgeOld()>40){
                System.out.printf(" \n");
            arrEmployees[i].printInfo();

            System.out.printf("Сотрудник пенсионер: "+arrEmployees[i].isRetired());

            }
        }
    }

}
