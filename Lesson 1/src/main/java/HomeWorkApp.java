public class HomeWorkApp {

    public static void main(String[] args){
        compareNumbers();
    }

//    Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
//    Orange, Banana, Apple.
    private static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

//    Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
//    которыми захотите. Далее метод должен просуммировать эти переменные,
//    и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
//    в противном случае - “Сумма отрицательная”;

    private static void checkSumSign(){
        int a = 1;
        int b = 4;
        if(a + b >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

//    Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//    если больше 100 (100 исключительно) - “Зеленый”;

    private static void printColor(){
        int value = 101;
        if(value <= 0){
            System.out.print("Красный");
        } else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
//    Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//    и инициализируйте их любыми значениями, которыми захотите.
//    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

    private static void compareNumbers(){
        int a = 1;
        int b = 2;
        if(a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}
