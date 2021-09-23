import Models.StringInput;
import Repository.IRepo;
import Services.Ordering.IOrdering;
import Services.Search.ISearch;
import Services.Search.SearchByContains;

import java.util.ArrayList;

// Singletone
public class SearchEngine<T> {
    private ISearch search;
    private IOrdering ordering;
    private IRepo repo;
    SearchEngine(ISearch search,IOrdering ordering,IRepo repo){
        this.ordering = ordering;
        this.search = search;
        this.repo = repo;
    }
    ArrayList<StringInput> find(String dataset, String pattern){
        ArrayList<StringInput> dataList = this.repo.getDocuments(dataset);
        ArrayList<StringInput> dataListSearched = searchDataset(dataList, pattern);
        ArrayList<StringInput> datasetOrdered = orderDataset(dataListSearched);
        return datasetOrdered;
    }
    private ArrayList<StringInput> searchDataset(ArrayList<StringInput> list, String pattern){
        return (ArrayList<StringInput>) this.search.find(list, pattern);
    }
    private ArrayList<StringInput> orderDataset(ArrayList<StringInput> list){
        return (ArrayList<StringInput>) this.ordering.orderList(list);
    }

    void addDataSet(String dataset){
        this.repo.addDataset(dataset);
    }
    void addDocument(String dataset, String data){
        this.repo.addDocument(dataset, data);
    }

}
