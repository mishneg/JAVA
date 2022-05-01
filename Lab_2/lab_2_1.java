/* 
Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3.
*/
import java.util.Scanner;

class lab_1
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in);

        System.out.print( "Введите название месяца: ");
        String месяц = In.nextLine();

        System.out.print( "Введите количество дней: ");
        String дня = In.nextLine();

        System.out.print("Месяц " + месяц + " содержит дней " + дня);
        In.close();
    }
}