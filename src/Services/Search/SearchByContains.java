package Services.Search;

import Models.StringInput;

import java.util.ArrayList;

public class SearchByContains implements ISearch {
    N element
        list - M

    public ArrayList<StringInput> find(ArrayList<StringInput> list, String pattern){
        String[] patternList = pattern.split(" ");
        ArrayList<StringInput> resultInter = new ArrayList<StringInput>();
        for(String pat: patternList) {
            for (StringInput document : list) {
                if (document.data.contains(pat)) {
                    resultInter.add(document);
                }
            }
            list = resultInter;
            resultInter = new ArrayList<StringInput>();
        }
        return list;
    }
}


