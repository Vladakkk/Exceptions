
public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "4", "2", "5"},
                {"3", "6", "9", "7"},
                {"8", "10", "12", "14"},
                {"11", "13", "16", "15"}
        };

        String[][] array2 = {
                {"10", "2", "31", "55"},
                {"15", "12", "27", "81"},
                {"9", "1", "41", "12"},
                {"13", "34", "25", "16", "2"}
        };

        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "apple", "16"}
        };

        try {
            int result = ArrayValueCalculator.doCalc(array1);
            System.out.println("Calculation result for array 1: " + result);
        } catch (ArraySizeException | ArrayDataException exception){
            System.out.println("Calculation error for array 1: " + exception.getMessage());
        }

        try {
            int result = ArrayValueCalculator.doCalc(array2);
            System.out.println("Calculation result for array 2: " + result);
        } catch (ArraySizeException | ArrayDataException exception){
            System.out.println("Calculation error for array 2: " + exception.getMessage());
        }

        try {
            int result = ArrayValueCalculator.doCalc(array3);
            System.out.println("Calculation result for array 3: " + result);
        } catch (ArraySizeException | ArrayDataException exception){
            System.out.println("Calculation error for array 3: " + exception.getMessage());
        }
    }
}