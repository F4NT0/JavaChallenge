public class DecToBin {
    public static void main(String[] args) {
        
        
        int[] binary = {0,1,0,0,1};
        int decimalValue = 0;
        int index = 0;

        while (index < binary.length) {
            decimalValue += binary[index] * Math.pow(2,index);
            index++;
        }

        System.out.print("Binary: ");
        
        for (int i = binary.length-1 ; i >= 0 ; i--) {
            System.out.print(binary[i]);
        }

        System.out.println("\nDecimal Number: " + decimalValue);
    }
}