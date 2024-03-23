package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Fetch the names which have chars greater than 8 and less than 6
public class StreamFilter1 {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Jonathan","Mayerss","Phillipe");
        List<String> result=new ArrayList<>();
        result=name.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(result);

        //OR
        name.stream().filter(str->str.length()>6 && str.length()<8).forEach(str-> System.out.println(str);

        //without using result variable
        name.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);

    }
}
