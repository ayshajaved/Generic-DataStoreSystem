import java.util.ArrayList;

public class DataStore<T>{      //Generic Item for all the types to store in a List
    private ArrayList<T> DataList;
    public DataStore(){
        DataList = new ArrayList<>();
    }
    //Methods to add item in the List
    public void addItems(T t){
        DataList.add(t);
        System.out.println("Item added successfully!");
    }
    //Method to get the List item by name
    public T getItemById(int index){
        return DataList.get(index);
    }
    //Method to display the List
    public void displayItems(){
        System.out.println("Items in the List are: ");
        for(T t: DataList){
            System.out.println(t);
        }
    }
    //Method to remove the item from the List
    public void removeItem(int index){
        T removed =DataList.remove(index);
        System.out.println("Item removed successfully!: "+removed);
    }
}