import java.util.*;
class RemoveDuplicates
{
    public static void main(String args[])
    {
        List<String>list=Arrays.asList("apple","banana","orange","apple","cherry","banana");
        Set<String> set=new LinkedHashSet<>(list);
        List<String> uniqueList=new ArrayList<>(set);

        System.out.println(uniqueList);

    }
}