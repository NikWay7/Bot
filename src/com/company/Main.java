/*Из небольшого текста удалить все символы, кроме пробелов,
не являющиеся буквами. Между последовательностями подряд идущих букв
оставить хотя бы один пробел.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Вводим текст
        String text = "Дядя Семён ехал из города домой. С ним была собака Жучка, Вдруг из леса выскочили волки. Жучка испугалась и прыгнула в сани.";

        //Преобразуем текст в массив char'ов
        char[] charArray = text.toCharArray();

        //Удаляем в тексте не нужные символы и выводим в консоль с 1 пробелом
        for(char x : charArray){
            if(Character.isLetter(x)){
                System.out.print(x + " ");
            }
            else {
                System.out.print(" ");
            }

        }
    }
}

