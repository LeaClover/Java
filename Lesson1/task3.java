// Дан массив двоичных чисел, например [1,1,0,1,0]
// Вывести максимальное количесвто идущих подряд единиц

public class task3 {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0};
        task3 task3 = new task3();
        int max = task3.getMaxCount(arr);
        System.out.printf("Максимальное количество '1' подряд: %d", max);
    }

    public int getMaxCount(int [] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            else {
                if (count != 0) {
                    if (max < count) max = count;
                    count = 0;
                }
            }
            if (count > max) max = count;
        }
        return max;
    }
}
