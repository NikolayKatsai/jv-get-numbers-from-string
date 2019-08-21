package core.basesyntax;

public class FindNumbers {

    /**
     * Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.
     * Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.
     * Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.
     */
    public int[] getAllNumbers(String text) {
        boolean isPrevNumber = false;
        StringBuilder stringOfInts = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9' || ch == '-') {
                if (ch != '-') {
                    isPrevNumber = true;
                } else if (isPrevNumber) {
                    stringOfInts.append(' ');
                    isPrevNumber = false;
                }
                stringOfInts.append(text.charAt(i));
            } else if (isPrevNumber) {
                stringOfInts.append(" ");
                isPrevNumber = false;
            } else if (stringOfInts.length() > 0
                    && stringOfInts.charAt(stringOfInts.length() - 1) == '-') {
                stringOfInts.deleteCharAt(stringOfInts.length() - 1);
            }
        }
        if (stringOfInts.charAt(stringOfInts.length() - 1) == ' ') {
            stringOfInts.deleteCharAt(stringOfInts.length() - 1);
        }
        String[] stringsOfIntsArray = stringOfInts.toString().split(" ");
        int[] result = new int[stringsOfIntsArray.length];
        for (int i = 0; i < stringsOfIntsArray.length; i++) {
            result[i] = 2 * Integer.parseInt(stringsOfIntsArray[i]);
        }
        return result;
    }
}
