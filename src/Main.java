public class Main {
    public static void main(String[] args) {
        System.out.println("задача №1");{
    int[] numbers = new int[3];// первый массив
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i <= 2; i++) {
            if (i != 2) {
                System.out.print(numbers[i] + ",");
            } else
                System.out.println(numbers[i]);
        }
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
    double[] numbers1 = {1.57, 7.654, 9.986};// второй массив
        for (double i = 0; i <= 2; i++) {
            if (i != 2) {
                System.out.print(numbers1[(int) i] + ",");
            } else
                System.out.println(numbers1[(int) i]);
            }
        for (double i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers1[(int) i] + ",");
            } else
                System.out.println(numbers1[(int) i]);
            }
    int[] total = new int[12]; //3 массив
        total[0] = 150;
        total[5] = 120;
        total[3] = 30;
        total[8] = 73;
        for (int i = 0; i < total.length; i++) {
            if (i != total.length - 1) {
                    System.out.print(total[i] + ",");
            } else
                    System.out.println(total[i]);
            }
        for (int i = total.length - 1; i >= 0; i--) {
            if (i > 0) {
                    System.out.print(total[i] + ",");
            } else
                    System.out.println(total[i]);
            }
        System.out.println("Задача 2");
    int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2!= 0) {
                numbers[i]++;
            }
                System.out.print(numbers[i]+" ");
        }

    }
}
