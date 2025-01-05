import com.sun.source.tree.BreakTree;

public class Challenge {
    public static void main(String[] args) {
        Challenge obj = new Challenge();
        boolean[] arr = {true, false, false, true, false};
        System.out.println(countTrue(arr));

        int arr1 = 5;
        System.out.println(convert(arr1));

        boolean arr2 = obj.isSameNum(4, 8);
        System.out.println(arr2);

        boolean arr3 = obj.isSameNum(5, 6);
        System.out.println(arr3);

        boolean arr4 = obj.checkEnding("abc", "bc");
        System.out.println(arr4);

        boolean arr5= obj.checkEnding("abc", "bc");
        System.out.println(arr5);

        double arr6 = obj.discount(1500, 50);
        System.out.println(arr6);

        int arr7 = obj.calculator(1500, 'v', 2000);
        System.out.println(arr7);
        int arr8 = obj.solutions(1500, 2001, 2000);
        System.out.println(arr8);
        String arr9 = obj.stutter("Lololo");
        System.out.println(arr9);
        int arr10 = obj.countWords("Hisoka, I love you");
        System.out.println(arr10);
        int[] arrr1 = {10, 3, 5, 6};

        int result = obj.differenceMaxMin(arrr1);
        System.out.println(result);

        int arr11 = obj.equal(1, 2, 3);
        System.out.println(arr11);
        String arr12 = obj.reverse("Helllo");
        System.out.println(arr12);


        System.out.println(obj.existsHigher(new String[]{"A8", "E8"}));
        System.out.println(obj.existsHigher(new String[]{"A1", "B2"}));
        System.out.println(obj.existsHigher(new String[]{"H4", "H3"}));
        System.out.println(obj.existsHigher(new String[]{"F5", "C8"}));
    }







    public static int countTrue(boolean[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static int convert(int minutes) {
        return minutes * 60;
    }

    /*
    Создайте функцию, которая возвращает true, когда x равно y; в противном случае верните false.
     */
    public boolean isSameNum(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }
    /*
    Создайте функцию, которая принимает два целых числа и проверяет, равны ли они.
     */
    public static boolean isEqual(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Создайте функцию, которая принимает две строки и возвращает true,
    если первая строка заканчивается второй строкой; в противном случае верните false.
     */
    public boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2);
    }

    /*
    Создайте функцию, которая принимает два аргумента:
    исходную цену и процент скидки в виде целых чисел и возвращает окончательную цену после скидки.
     */
    public double discount(int price, int percentage) {
        double discount = price * (percentage/100.0);
        return price - discount;
    }
/*
Создайте функцию, которая принимает два числа и математический оператор +-/* и будет
выполнять вычисления с заданными числами.
 */

    public int calculator(int num1, char operator, int num2) {
        int result = 0;
        if (operator == '/'){
            result = num1/num2;
        } if (operator == '+'){
            result = num1 + num2;
        } if (operator == '-'){
            result = num1 - num2;
        } if (operator == '*'){
            result = num1 * num2;
        }
    return result;
    }
    public  int solutions(int a, int b, int c) {
        int di = b * b - 4 * a * c;
        if (di > 0) {
            return 2;
        } else if (di == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String stutter(String word) {
        String firstTwo = word.substring(0, 2);
        return firstTwo + "... " + firstTwo + "... " + word + "?";
    }

    public int countWords(String s) {
        return s.split("\\s+").length;
    }

    public int differenceMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    public int equal(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || b == c || a == c) {
            return 2;
        } else {
            return 0;
        }
    }

    public String reverse(String str) {

        StringBuilder sb = new StringBuilder(str).reverse();
        return sb.toString();
    }

    public static int programmers(int one, int two, int three) {
        int maxSalary = Math.max(one, Math.max(two, three));
        int minSalary = Math.min(one, Math.min(two, three));
        return maxSalary - minSalary;  //
    }

    public boolean existsHigher(String[] rooks) {
        String rook1 = rooks[0];
        String rook2 = rooks[1];


        return rook1.charAt(0) == rook2.charAt(0) || rook1.charAt(1) == rook2.charAt(1);
    }



}









