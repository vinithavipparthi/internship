import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayToListConversion 
{
    public static void main(String[] args) 
    {
        String[] fruitsArray = {"Apple", "Banana", "Cherry"};
        List<String> fruitList = Arrays.asList(fruitsArray); 
        System.out.println("Array to List: " + fruitList);

        List<String> modifiableList = new ArrayList<>(fruitList);
        modifiableList.add("Date");
        System.out.println("Modifiable List after adding element: " + modifiableList);

        String[] newArray = modifiableList.toArray(new String[0]);
        System.out.println("List to Array: " + Arrays.toString(newArray));
    }
}
