package Repository;

import Models.StringInput;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapRepo implements IRepo{
    HashMap<String, ArrayList<StringInput>> database = new HashMap<>();
    HashMap<String, ArrayList<StringInput>> databaseReverse = new HashMap<>();
    public void addDocument(String dataset,String data){
        StringInput input = new StringInput(data);
        database.get(dataset).add(input);
    }
    public void addDataset(String dataset){
        ArrayList<StringInput> list = new ArrayList<>();
        database.put(dataset, list);
    }
    public ArrayList<StringInput> getDocuments(String dataset){
        return database.get(dataset);
    }
}
