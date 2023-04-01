import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLoader {

    public static List<Integer> loadArrayFromStringSeq(String input) {
        // Assume string has been stripped of outer brackets
        List<Integer> intList = new ArrayList<>();
        if(input.length() == 0) return intList;

        // Split the string into values
        String[] values = input.split(",");

        for (String value : values) {
            intList.add(Integer.parseInt(value.replaceAll("\\[", "").replaceAll("]", "").trim()));
        }

        return intList;
    }

    public static List<Integer> loadArrayFromString(String input) {
        // Remove outer brackets
        input = input.substring(1, input.length() - 1);

        return loadArrayFromStringSeq(input);
    }

    public static List<List<Integer>> loadNestedArrayFromString(String input) {
        List<List<Integer>> nestedArray = new ArrayList<>();

        // Remove outer brackets
        input = input.substring(1, input.length() - 1);

        // Split the string into inner arrays
        String[] innerArrays = input.split("], \\[");

        for (String innerArray : innerArrays) {
            nestedArray.add(loadArrayFromStringSeq(innerArray));
        }

        return nestedArray;
    }

    public static void main(String[] args) {
    }
}