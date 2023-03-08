//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class Task3 {

    public static void main(String[] args) {

        int[] arr = new int[] { 3,2,2,3};

        int val = 3;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != val) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        
                    }

                }
                System.out.print(arr[i]);
            }
        }

    }
}
