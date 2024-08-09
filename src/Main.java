import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int masLength = 10;
        int[] mas = new int[masLength];//Массив из masLength чисел
        System.out.print("Исходный массив: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
            System.out.print(mas[i] + " ");
        }

        //  for (int i = 0; i < mas.length - 1; i++) //проходиться по массиву 1 раз
        //Вложенный цикл позволяет делать несколько проходов по массиву
        //Добавляем вложенный цикл for (int j = 0; j < mas.length - i - 1; j++)

        //Сортируем
        for (int i = 0; i < mas.length - 1; i++) {//проходиться по массиву несколько раз
            for (int j = 0; j < mas.length - i - 1; j++) {//Сравнивает соседние элементы в текущем проходе.
                if (mas[j] > mas[j + 1]) {//Условие сортировки (Если число больше предыдущего, то меняем местами)
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}