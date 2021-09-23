import Models.StringInput;
import Repository.HashMapRepo;
import Repository.IRepo;
import Services.Ordering.IOrdering;
import Services.Ordering.OrderByAsc;
import Services.Search.ISearch;
import Services.Search.SearchByContains;

import java.util.ArrayList;

public class SearchEngineExecution {

    public static void main(String[] Arg){

        // Services
        String inputData= "Fruit_basket";
        String inputPattern="good bad";

        ISearch searchService = new SearchByContains();
        IOrdering orderService = new OrderByAsc();
        IRepo repo = new HashMapRepo();
        repo.addDataset("Fruit_basket");
        repo.addDocument("Fruit_basket", "apple apple apple is a fruit");
        repo.addDocument("Fruit_basket", "Zoro's apples are bad for health");
        repo.addDocument("Fruit_basket", "apples are bad for health");
        repo.addDocument("Fruit_basket", "good is not bad banana");

        // Service
        SearchEngine<StringInput> engine = new SearchEngine<>(searchService, ordeService, repo);
        ArrayList<StringInput> result = engine.find(inputData, inputPattern);

        // Output
        for(StringInput input: result){
            System.out.println(input.data);
        }

    }


}
