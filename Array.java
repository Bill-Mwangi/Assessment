public class Array {
    public static int missingInt (int[] array) {
        int size = array.length;
        int missing = -1;

        for(int i = 1; i < size + 1; i++) {
            for(int j = 0; j < size; j++) {
                if(i == array[j])
                    break;
                else
                    missing = i;
            }
        }
        return missing;
    }

    public static StringBuilder stringReversingInFours(String s) {
        int size = s.length();
        int remainder = size % 4;
        int quotient = size / 4;
        StringBuilder result = new StringBuilder();
        StringBuilder string = new StringBuilder(s);

        for (int i = 0; i < quotient; i++) {
            StringBuilder str = new StringBuilder(string.substring(0, 4));
            result.append(str.reverse());
            string.delete(0, 4);
        }

        if (remainder != 0)
            result.append(string);
        return result;

    }
    public static void main(String[] args) {

//        int[] arr = {1, 3};
//        System.out.println("The missing integer is " + missingInt(arr));
        System.out.println(stringReversingInFours("HebuSemaNyamBane"));

    }
}
