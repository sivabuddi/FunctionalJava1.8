package interviewquestions;

import java.util.Arrays;
import java.util.List;

public class FindLast {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,22,33,55,44,12,33,10);
        System.out.println(list);

        System.out.println(list.get(list.size()-1));
        Integer duplicate = list.stream().skip(list.size()-1).findFirst().get();
        System.out.println(duplicate);

    }

}
