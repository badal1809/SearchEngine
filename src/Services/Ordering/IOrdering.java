package Services.Ordering;

import Models.StringInput;

import java.util.ArrayList;

public interface IOrdering {
    ArrayList<StringInput> orderList(ArrayList<StringInput> list);
}
