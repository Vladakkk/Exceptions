
public class ArrayValueCalculator {
    public static int doCalc(String[][] array)

    throws ArrayDataException, ArraySizeException {

        if (array.length != 4 || array[0].length != 4 ||
                array[1].length != 4 || array[2].length != 4 ||
                    array[3].length != 4){

            throw new ArraySizeException("Invalid array size (must be 4x4)");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){

                try{
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception){

                    throw new ArrayDataException("Invalid data in the cell [" + i + "]" +
                                                  "[" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }


}
