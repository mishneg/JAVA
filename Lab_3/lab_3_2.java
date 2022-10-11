/*
Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
*/

import java.util.Scanner;

class lab3_2
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");
        System.out.print("Введите название дня недели: ");
        String день =In.next();

        int ответ=0;

        switch(день)
        {
        case "Понедельник":
        ответ=1;
        break;
        case "Вторник":
        ответ=2;
        break;
        case "Среда":
        ответ=3;
        break;
        case "Четверг":
        ответ=4;
        break;
        case "Пятница":
        ответ=5;
        break;
        case "Суббота":
        ответ=6;
        break;
        case "Воскресенье":
        ответ=7;
        break;
        default:
        System.out.print("Некорректное значение дня ");
        In.close();
        return;
        }

        System.out.printf("День недели %s", ответ);
        In.close();
    }
}