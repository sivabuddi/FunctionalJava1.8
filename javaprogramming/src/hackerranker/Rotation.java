package hackerranker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotation {

    public static List<Integer> getMax(List<Integer> a, List<Integer> rotate){
//        List<Integer> index = Collections.<Integer>emptyList();
          List<Integer> index = new ArrayList<>();
        int max_element_index=Math.max(a.get(0),a.get(a.size()-1))-a.get(0);
        //System.out.println(max_element_index);

        for(int i=0;i<rotate.size();i++){
            int value=max_element_index-rotate.get(i);


            if (value < 0){
                value = -1 * (-value % a.size());
                if (value != 0)
                    value += a.size();
            }
             index.add(value);
        }
        
        return index;
    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3); // 2 3 1 1::3,1,2 0::1,2,3,2::2,3,1,1;
        List<Integer> rotate =Arrays.asList(1,2,3,4);
        List<Integer> indices;

        indices=getMax(a,rotate);
        System.out.println(indices);


    }

}
