package firstcode;

class main {
    public static void main(String[] args) {
        int n = 5;
        int[] foo = {0, 1, 2, 3, 4};

        int m = 100;
        int[] Arr = new int[100];
        for (int i = 0; i < 100; i++)
            Arr[i] = i;
        System.out.println("The number of even numbers in foo is:" + countEvenNums(foo, n));
        System.out.println("The number of even numbers in Arr is:" + countEvenNums(Arr, m));
    }

    public static int countEvenNums(int[] array, int size){
        int count =0;
        for (int i = 0;i < size; i++){
            if(array[i] % 2 ==0)
                count++;
        }
        return count;
    }
}
