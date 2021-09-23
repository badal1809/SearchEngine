package Services.Ordering;

import Models.StringInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class OrderByAsc implements IOrdering{
    public ArrayList<StringInput>  orderList(ArrayList<StringInput>  list){

        Collections.sort(list, new Comparator<StringInput>() {
            @Override
            public int compare(StringInput o1, StringInput o2) {
                return o1.data.compareTo(o2.data);
            }
        });
        return list;
    }
}
