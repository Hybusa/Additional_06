import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {

        //First task
        /*
        Напишите программу, которая возвращает в качестве результата строку, в которой каждый символ удвоен.
        Например:
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
        */

        System.out.println("Задание 1:");

        String s = "Hybusa";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
        System.out.println();
    }

    public static void task2() {
        //Second task
        /*
        Напишите программу, которая возвращает в качестве значения строку, в которой слово
        находится в середине исходной строки, например "<<слово>>".
        Примечание: используйте str.substring(i, j) для извлечения строки,
        начиная с индекса i и до индекса j, но не включая его.
        Например:
        makeOutWord("<<>>", "Yay") → "<<Yay>>"
        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        makeOutWord("[[]]", "word") → "[[word]]"
        */

        System.out.println("Задание 2:");

        String s = "<<>>";
        String s2 = "Hybusa";
        int separator = s.length() / 2;

        String out = s.substring(0, separator) + s2 + s.substring(separator);
        System.out.println(out);
        System.out.println();

    }

    public static void task3() {
        //Third task
        /*
        Даны две строки, a и b. Напишите программу, которая возвращает новую строку,
        состоящую из первого символа a и последнего символа b. Если строка имеет длину 0,
        используйте '@' для ее отсутствующего символа.
        Например:
        lastChars("last", "chars") → "ls"
        lastChars("yo", "java") → "ya"
        lastChars("hi", "") → "h@"
        */

        System.out.println("Задание 3:");

        String a = "Hybusa";
        String b = "Bobopooh";


        if (a.length() == 0)
            a = "@";
        if (b.isEmpty())
            b = "@";

        String out = String.valueOf(a.charAt(0)) + b.charAt(b.length() - 1);
        System.out.println(out);
        System.out.println();
    }

    public static void task4() {
        //Fourth task
        /*
        Напишите программу, которая возвращает в качестве значения новую строку,
        в которой 2 последних символа заменены местами.
        lastTwo("codi**ng**") → "codi**gn**"
        lastTwo("ca**t**") → "c**t**a"
        lastTwo("a**b**") → "**b**a"
        */

        System.out.println("Задание 4:");

        String a = "qwerty";

        char[] charArr = a.toCharArray();

        char tmp = charArr[charArr.length - 2];
        charArr[charArr.length - 2] = charArr[charArr.length - 1];
        charArr[charArr.length - 1] = tmp;

        String out = new String(charArr);

        System.out.println(out);
        System.out.println();
    }

    public static void task5() {
        //Fifth task
        /*
        Даны две строки любой длины. Напишите программу,
        которая в качестве результата возвращает третью строку,
        в которой две исходные соединены. При этом если строки имеют разную длину,
        то символы из более длинной строки опускаются и используются только последние символы.
        Например, «Hello» и «Hi» дают «loHi».
        */

        System.out.println("Задание 5:");

        String a = "QWERTY";
        String b = "hey";

        int minLength = Math.min(a.length(), b.length());
        System.out.println(minLength);

        String result = a.substring(a.length() - minLength) + b.substring(b.length() - minLength);

        System.out.println(result);
        System.out.println();

    }

    public static void task6() {
        //Sixth task
        /*
        Напишите программу, которая выводит в консоль, сколько раз слово ”hi” встречается в строке.
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
        */

        System.out.println("Задание 6:");


        String a = "abc hi ho hihihi";
        String b = "ABChi hi hi";
        String c = "hihi hello hi";

        String toFind = "hi";

        String[] allTheStrings = {a, b, c};

        for (String s : allTheStrings) {
            System.out.println("В строчке " + s + " фрагмент " + toFind + " найден "
                    + counterOfSubstr(s, toFind) + " раз");
        }

        System.out.println();
    }

    public static void task7() {
        //Seventh task
        /*
        Напишите программу, которая выводит в консоль n раз последние n символов строки, где n – целое число
        repeatEnd("Hello", 3) → "llollollo"
        repeatEnd("Hello", 2) → "lolo"
        repeatEnd("Hello", 1) → "o"
        */

        System.out.println("Задание 7:");

        String a = "bundle";
        String b = "formulate";
        String c = "extension";

        String[] allTheStrings = {a, b, c};

        int minLengthOfString = Integer.MAX_VALUE;
        for (String i : allTheStrings) {
            if (i.length() < minLengthOfString)
                minLengthOfString = i.length();
        }
/*
        for (String i : allTheStrings7) {
            System.out.println(lastRepeater(i, getRandomNumber(1, minLengthOfString)));
        }
        */

        for (String i : allTheStrings) {
            int numbRep = getRandomNumber(1, minLengthOfString);
            String part = i.substring(i.length() - numbRep);
            String result = part.repeat(numbRep);
            System.out.println(result);
        }

        System.out.println();
    }

    public static void task8() {
        //Eighth task
        /*
        Напишите программу, которая выводит в консоль максимальное количество идущих подряд одинаковых
        символов в строке. Например, в слове "hoopla" буква “о” идет подряд два раза, соответственно,
        в консоль будет выведено 2.
        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0
        */

        System.out.println("Задание 8:");

        String a = "hoopla";
        String b = "abbCCCddBBBxx";
        String c = "";

        String[] allTheStrings = {a, b, c};

        for (String i : allTheStrings) {
            System.out.println(returnDupesCount(i));
        }

        System.out.println();

    }

    public static void task9() {
        //Ninth task
        /*
        Напишите программу, которая выводит в консоль максимальное количество идущих подряд одинаковых
        символов в строке. Например, в слове "hoopla" буква “о” идет подряд два раза, соответственно,
        в консоль будет выведено 2.
        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0
        */

        System.out.println("Задание 9:");

        String a = "Word";
        String aSep = "X";
        int nRep = 3;

        String[] words = new String[nRep];
        Arrays.fill(words, a);

        String result = String.join(aSep, words);
        System.out.println(result);

        //!!!
    }

    public static int counterOfSubstr(String a, String b) {
        int counter = a.length() - a.replaceAll(b, "").length();
        return counter / b.length();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /*
    public static String lastRepeater(String string, int n) {
        String newString = string.substring(string.length() - n);
        String result = "";

        for (int i = 0; i < n; i++)
            result += newString;

        return result;
    }*/

    public static int returnDupesCount(String string) {

        if (string.isEmpty())
            return 0;
        int currentLength = 1;
        int maxLength = 1;
        char currentChar = string.charAt(0);

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == currentChar) {
                currentLength++;
                continue;
            }
            currentChar = string.charAt(i);
            maxLength = Math.max(maxLength, currentLength);
            currentLength = 1;
        }

        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }

}

