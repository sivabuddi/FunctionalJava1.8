package interviewquestions;

import java.util.*;

public class RemoveNumericals {

    public static void main(String[] args) {

        // procedure 1
        procedure1();
        System.out.println();
        procedure2();




    }

    public static void procedure1(){
        String input="test23432ing";
        input = input.replaceAll("\\d","");
        char arr[]=input.toCharArray();
        Arrays.sort(arr);

        List<Character> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
            }
            else
                list.add(arr[i]);
        }

        Iterator iterator=list.iterator();

        for (Iterator it = iterator; it.hasNext(); ) {
            System.out.print(it.next());
        }


        return;
    }


    public static void procedure2(){
        String input="test23432ing";
        input.chars().filter(ascii -> !Character.isDigit((char)ascii)).sorted().distinct().forEach(s -> System.out.println((char)s));
        return;
    }

}
