public class OutInformation {

    public static void enterHello() {
        System.out.println("Введите строку: ");
    }

    public static void enterAnswer(Object[] answer) {
        System.out.println("\"" +answer[0].toString() + "\"" + '['
                + answer[1].toString() + ']');
    }

    public static void enterEmptyAnswer() {
        System.out.println("Подходящие строки не найдены.\n");
    }

    public static void enterSearchData(long time, long rowsCount) {
        System.out.println(String.format("Количество найденных строк: %d. Время, затраченное на поиск: %d мс\n",
                rowsCount, time));
    }
}
