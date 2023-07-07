// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

import java.util.*;

public class DZ_7_zadanie {
    public static void main(String[] args) {
        Deque<Integer> list1 = new ArrayDeque<>(Arrays.asList(-5));
        System.out.println(list1);
        Deque<Integer> list2 = new ArrayDeque<>(Arrays.asList(7));
        System.out.println(list2 + "\n");
        int s1 = list2.getFirst();
        int s = list1.getFirst();

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(s * s1);
        list3.add(s + s1);
        System.out.println(list3 + "\n");

// Реализовать стек с помощью массива. Нужно реализовать методы: size(), empty(), push(), peek(), pop().
        String[] array = { "a", "b", "c", "d", "e" };
        Stack<String> stack = new Stack<>();
        for (String element : array) {
            stack.push(element);
        }
        System.out.println("Печатаю стек: " + stack.toString());
        System.out.println("Удаляю последний (верхний) элемент стека и возвращаю его: " + stack.pop()); // удаляю последний (верхний) элемент стека и возвращаю его
        System.out.println("Теперь стек состоит из 4 элементов: " + stack); // теперь стек состоит из 4 элементов
        System.out.println("Размер стека: " + stack.size()); // размер стека
        System.err.println("Возвращаю последений (верхний) элемент стека, но не удаляю его из стека: " + stack.peek()); // возвращаю последений (верхний) элемент стека, но не удаляю его из стека
        System.out.println("Стек так же состоит из 4 элементов: " + stack); // стек так же состоит из 4 элементов
        System.out.println("Проверяем пустой ли стек: " + stack.empty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Проверяем пустой ли стек: " + stack.empty());
    }
}