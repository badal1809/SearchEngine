package Repository;

import Models.StringInput;

import java.util.ArrayList;

public interface IRepo {
    void addDocument(String dataset,String data);
    void addDataset(String dataset);
    ArrayList<StringInput> getDocuments(String dataset);
}
