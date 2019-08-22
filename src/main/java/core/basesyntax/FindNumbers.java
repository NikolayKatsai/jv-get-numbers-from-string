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
        String[] numbersInText = text.replaceAll("^\\D*[\\D&&[^-]]", "").split("\\D*[\\D&&[^-]]");
        int[] resultNumbers = new int[numbersInText.length];
        for (int i = 0; i < numbersInText.length; i++) {
            resultNumbers[i] = Integer.parseInt(numbersInText[i]) * 2;
        }
        return resultNumbers;
    }
}
