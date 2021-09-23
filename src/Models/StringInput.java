package Models;

public class StringInput extends IAuditable{
    public String data;
    public StringInput(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }

}
