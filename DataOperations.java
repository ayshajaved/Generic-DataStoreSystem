//generic interface
public interface DataOperations<T> {
    public void addItems(T t);
    public T getItemById(int index);
    public void displayItem();
    public void removeItem(int index);
}
