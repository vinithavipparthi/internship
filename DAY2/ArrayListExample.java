import java.util.*;
class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Anand");
        names.add("Bobby");
        names.add("Surya");
        System.out.println("Stored Names:");
        for (String name:names) {
            System.out.println(name);
        }

       }
}