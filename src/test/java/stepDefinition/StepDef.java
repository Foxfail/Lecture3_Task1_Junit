package stepDefinition;

import com.sun.istack.internal.Nullable;
import cucumber.api.java.ru.*;

import java.util.Scanner;

public class StepDef {

    private double a, b, c;
    private String s1, s2;

    @Если("пользователь запускает программу в консоли")
    public void пользовательЗапускаетПрограммуВКонсоли() {
        System.out.println("Программа запущена");
    }

    @То("^программа выдает краткое описание функционала данной утилиты$")
    public void printDesc() {
        System.out.println("Вас приветствует программа для сложения двух чисел.");
    }

    @И("^выводится запрос на ввод первого числа$")
    public void printFirstNumRequest() {
        System.out.print("Введите первое число:");
    }

    @Когда("пользователь вводит первое число {string}")
    public void пользовательВводитПервоеЧисло(@Nullable String testUserInput) {
        if (testUserInput == null) {
            Scanner scanner = new Scanner(System.in);
            s1 = scanner.next();
        } else {
            s1 = testUserInput;
            System.out.println(testUserInput);
        }
    }

    @Тогда("^выводится запрос на ввод второго числа$")
    public void printSecondNumRequest() {
        System.out.print("Введите второе число:");
    }

    @И("пользователь вводит второе число {string}")
    public void пользовательВводитВтороеЧисло(@Nullable String testUserInput) {
        if (testUserInput == null) {
            Scanner scanner = new Scanner(System.in);
            s2 = scanner.next();
        } else {
            s2 = testUserInput;
            System.out.println(testUserInput);
        }
    }

    @Если("^введены натуральные или вещественные числа$")
    @То("^программа выдает сообщение о некорректных введенных данных$")
    public void isDouble() {
        try {
            a = Double.valueOf(s1);
            b = Double.valueOf(s2);
        } catch (Exception e) {
//            e.printStackTrace();
            printErrorMsg();
        }
    }

    @То("^программа складывает их$")
    public void calcSum() {
        c = a + b;
    }

    @И("^выводит результат на экран$")
    public void printResult() {
        System.out.println("Результат: " + c);
    }


    private void printErrorMsg() {
        System.out.println("Ошибка. Введены некорректные числа");
    }


}
