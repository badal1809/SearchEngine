package Services.Search;

import Models.StringInput;

import java.util.ArrayList;

public interface ISearch {
    ArrayList<StringInput>  find(ArrayList<StringInput> list, String pattern);
}
