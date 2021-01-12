/*
Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?
Ответ: Нельзя считать эту последовательность правильной, так как число открывающихся скобок одного типа
должно равняться числу закрывающихся скобок того же типа, чтобы последовательность была правильной,
необходимо удалить одну открывающуюся скобку типа ")" и одну закрывающуюся скобку другого типа "]".
Вот правильная последовательность: [((())()())].
Данная программа учитывает также то, что сначала должна скобка открываться, а лишь затем закрываться, не наоборот.
В данной программе принято упрощение, что пользователь введет хотя бы одну скобку нужного типа,
если не введет ни одной, вернет как будто последовательность верная.
 */

package com.andersen.trainee.tasks;

import java.util.Scanner;

public class FourthTask {

    @SuppressWarnings("resources")
    public static boolean Check1(String sequence1) {
        int count1Brackets = 0;
        for (int i = 0; i < sequence1.length(); i++) {
            String oneSymbol = sequence1.substring(i, i + 1);
            if (oneSymbol.equals("(")) {
                count1Brackets++;
            } else {
                if (oneSymbol.equals(")")) {
                    count1Brackets--;
                }
            }
            if (count1Brackets < 0) {
                return false;
            }
        }
        return count1Brackets == 0;
    }

    public static boolean Check2(String sequence2) {
        int count2Brackets = 0;
        for (int i = 0; i < sequence2.length(); i++) {
            String oneSymbol = sequence2.substring(i, i + 1);
            if (oneSymbol.equals("[")) {
                count2Brackets++;
            } else {
                if (oneSymbol.equals("]")) {
                    count2Brackets--;
                }
            }
            if (count2Brackets < 0) {
                return false;
            }
        }
        return count2Brackets == 0;
    }

    public static void main(String[] args) {
        String s1;

        Scanner s =  new Scanner(System.in);
        System.out.println("Use only this types of brackets [ ( ) ] \nwrite s1:");
        s1 = s.nextLine();

        if (Check1(s1) == true && Check2(s1) == true) {
            System.out.println("This sequence is correct");
        } else {
            System.out.println("This sequence isn't correct");
        }
    }
}
