import java.util.ArrayList;
import java.util.Collections;

public class BinToDec {

    public int recursiveDivision(int value, ArrayList<Integer> list) {
        if (value == 0) {
            return value;
        }
        int div = (int)value/2;
        int remain = value%2;
        list.add(remain);
        return recursiveDivision(div, list);
    }

    public void division(int value, ArrayList<Integer> list) {
        int auxiliaryToDivision = recursiveDivision(value, list);
    }

    public static void main(String[] args) {
        int decimal = 18;
        ArrayList<Integer> binary = new ArrayList<>();
        BinToDec binToDec = new BinToDec();
        binToDec.division(decimal, binary);

        System.out.println("\n\nDecimal Value: " + decimal);

        System.out.print("Value from the rest of division: ");
        Collections.reverse(binary); //reverse order using Collections
        binary.forEach(bit -> System.out.print(bit));
        System.out.println("\n");
    }
}
