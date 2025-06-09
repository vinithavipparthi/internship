import java.util.*;

class HashExample {
    public static void main(String[] args) {
        HashMap<Integer, String> idNameMap = new HashMap<>();

        idNameMap.put(101, "Alice");
        idNameMap.put(102, "Bob");
        idNameMap.put(103, "Charlie");
        System.out.println("All entries:");
        for (Integer id : idNameMap.keySet()) {
            System.out.println("ID:"+id+",Name:"+idNameMap.get(id));
        }
    }
}