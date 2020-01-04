public class main {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        int[] array = new int[10];
        
        array[0] = 3;
        array[1] = 5;
        array[2] = 6;
        array[3] = 2;
        array[4] = 9;
        array[5] = 1;
        array[6] = 8;
        array[7] = 0;
        array[8] = 7;
        array[9] = 4;

        sort(0, 9, array);
        
        for( int x : array) {
            System.out.println(x);
        }
        
    }
    
    public static void sort(int lowIndex, int highIndex, int[] array) {
        
        if (highIndex > lowIndex) {
            int pivotIndex = merge(lowIndex, highIndex, array);
            sort(lowIndex, pivotIndex-1, array);
            sort(pivotIndex + 1, highIndex, array);   
        }
    }
    
    public static int merge(int lowIndex, int highIndex, int[] array) {
        int pivotValue = array[highIndex];
        int pivotIndex = highIndex;
        int swapIndex = lowIndex - 1;
        
        for (int currentIndex = lowIndex; currentIndex < highIndex; currentIndex++) {
            if (array[currentIndex] < pivotValue) {
                swapIndex++;
                int temp = array[currentIndex];
                array[currentIndex] = array[swapIndex];
                array[swapIndex] = temp;
            }
        }

        swapIndex++;
        int temp = array[pivotIndex];
        array[pivotIndex] = array[swapIndex];
        array[swapIndex] = temp;
        
        return swapIndex;
    }
}
