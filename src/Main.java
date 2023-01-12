import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //First task
        /*
        Напишите программу, которая возвращает в качестве результата строку, в которой каждый символ удвоен.
        Например:
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
        */

        System.out.println("Задание 1:");

        String s1 = "Hybusa";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            sb.append(s1.charAt(i));
        }

        System.out.println(sb);
        System.out.println();

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

        String s2 = "<<>>";
        String s22 = "Hybusa";
        int separator = s2.length() / 2;

        String out2 = s2.substring(0, separator) + s22 + s2.substring(separator);
        System.out.println(out2);
        System.out.println();


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

        String a3 = "Hybusa";
        String b3 = "Bobopooh";


        if (a3.length() == 0)
            a3 = "@";
        if (b3.isEmpty())
            b3 = "@";

        String out3 = String.valueOf(a3.charAt(0)) + b3.charAt(b3.length() - 1);
        System.out.println(out3);
        System.out.println();

        //Fourth task
        /*
        Напишите программу, которая возвращает в качестве значения новую строку,
        в которой 2 последних символа заменены местами.
        lastTwo("codi**ng**") → "codi**gn**"
        lastTwo("ca**t**") → "c**t**a"
        lastTwo("a**b**") → "**b**a"
        */

        System.out.println("Задание 4:");

        String a4 = "qwerty";

        char[] charArr = a4.toCharArray();

        char tmp = charArr[charArr.length - 2];
        charArr[charArr.length - 2] = charArr[charArr.length - 1];
        charArr[charArr.length - 1] = tmp;

        String out4 = new String(charArr);

        System.out.println(out4);
        System.out.println();

        //Fifth task
        /*
        Даны две строки любой длины. Напишите программу,
        которая в качестве результата возвращает третью строку,
        в которой две исходные соединены. При этом если строки имеют разную длину,
        то символы из более длинной строки опускаются и используются только последние символы.
        Например, «Hello» и «Hi» дают «loHi».
        */

        System.out.println("Задание 5:");

        String a5 = "QWERTY";
        String b5 = "hey";

        int minLength = Math.min(a5.length(), b5.length());
        System.out.println(minLength);

        String result5 = a5.substring(a5.length() - minLength) + b5.substring(b5.length() - minLength);

        System.out.println(result5);
        System.out.println();


        //Sixth task
        /*
        Напишите программу, которая выводит в консоль, сколько раз слово ”hi” встречается в строке.
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
        */

        System.out.println("Задание 6:");


        String a6 = "abc hi ho hihihi";
        String b6 = "ABChi hi hi";
        String c6 = "hihi hello hi";

        String toFind = "hi";

        String[] allTheStrings6 = {a6, b6, c6};

        for (String s : allTheStrings6) {
            System.out.println("В строчке " + s + " фрагмент " + toFind + " найден "
                    + counterOfSubstr(s, toFind) + " раз");
        }

        System.out.println();

        //Seventh task
        /*
        Напишите программу, которая выводит в консоль n раз последние n символов строки, где n – целое число
        repeatEnd("Hello", 3) → "llollollo"
        repeatEnd("Hello", 2) → "lolo"
        repeatEnd("Hello", 1) → "o"
        */

        System.out.println("Задание 7:");

        String a7 = "bundle";
        String b7 = "formulate";
        String c7 = "extension";

        String[] allTheStrings7 = {a7, b7, c7};

       int minLengthOfString = Integer.MAX_VALUE;
        for (String i : allTheStrings7) {
            if (i.length() < minLengthOfString)
                minLengthOfString = i.length();
        }
/*
        for (String i : allTheStrings7) {
            System.out.println(lastRepeater(i, getRandomNumber(1, minLengthOfString)));
        }
        */

        for(String i:allTheStrings7)
        {
            int numbRep = getRandomNumber(1, minLengthOfString);
            String part7 = i.substring(i.length()-numbRep);
            String result7 = part7.repeat(numbRep);
            System.out.println(result7);
        }

        System.out.println();

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

        String a8 = "hoopla";
        String b8 = "abbCCCddBBBxx";
        String c8 = "";

        String [] allTheStrings8 = {a8,b8,c8};

        for(String i:allTheStrings8)
        {
            System.out.println(returnDupesCount(i));
        }

        System.out.println();


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

        String a9  = "Word";
        String aSep9 = "X";
        int nRep = 3;

        String[] words = new String[nRep];
        Arrays.fill(words, a9);

        String result = String.join(aSep9, words);
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

    public static int returnDupesCount (String string)
    {

        if (string.isEmpty())
            return 0;
        int currentLength = 1;
        int maxLength = 1;
        char currentChar = string.charAt(0);

        for (int i=1; i< string.length();i++)
        {
            if(string.charAt(i) == currentChar)
            {
                currentLength++;
                continue;
            }
            currentChar = string.charAt(i);
            maxLength = Math.max(maxLength, currentLength);
            currentLength=1;
        }

        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }

}

