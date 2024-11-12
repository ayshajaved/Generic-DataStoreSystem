import java.util.ArrayList;
import java.util.Collection;
public class DataStore<T> implements DataOperations<T>{      //Generic Item for all the types to store in a List
    private ArrayList<T> DataList;
    public DataStore(){
        DataList = new ArrayList<>();
    }
    //generic constructor
    public <E extends T>DataStore(Collection <E> c){
        this.DataList = new ArrayList<>(c);
    }
    //Methods to add item in the List
    @Override
    public void addItems(T t){
        DataList.add(t);
        System.out.println("Item added successfully!");
    }
    //Method to get the List item by name
    @Override
    public T getItemById(int index){
        return DataList.get(index);
    }
    //Method to display the List
    @Override
    public void displayItem(){
        System.out.println("Items in the List are: ");
        for(T t: DataList){
            System.out.println(t);
        }
    }
    //Method to remove the item from the List
    @Override
    public void removeItem(int index){
        T removed =DataList.remove(index);
        System.out.println("Item removed successfully!: "+removed);
    }
}