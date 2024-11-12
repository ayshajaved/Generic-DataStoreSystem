import java.util.Scanner;
import java.util.Arrays;

public class Main {
    DataStore<String> stringData;
    DataStore<Integer> integerData;
    DataStore<Float> floatData;
    DataStore<Double> doubleData;
    DataStore<EmployeeData> employeeData;
    public Main(){
        stringData = new DataStore<String>();
        integerData = new DataStore<Integer>();  
        floatData = new DataStore<Float>();    
        doubleData = new DataStore<Double>(Arrays.asList(23.4,45.6,67.8)); 
        //passing collection(sub class of double or double) to constructor using arrays.aslist() method
        //that returns a fixed array the Arrays.asList method is used to 
        //create a fixed-size list from the provided values, and we pass 
        //that list to the DataStore constructor that takes a List<T> as an argument.
        //The constructor of DataStore now accepts a List<T> to initialize DataList with the given values.
        employeeData = new DataStore<>();
    }
    //generic method to add item to a particular datastore
    public <T>void addData(DataStore<T> data, T item){
        data.addItems(item);
    }
    public <T>void displayItems(DataStore<T> data){
        data.displayItem();
    }

    public void selectAddDataType(Scanner sc){
        System.out.println("""
                1. Add String Data
                2. Add Integer Data
                3. Add Float Data
                4. Add Double Data
                5. Add Employee
                """);
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter String Data: ");
                String data =sc.nextLine();
                addData(stringData, data);
                break;
            case 2:
                System.out.println("Enter Integer Data: ");
                int idata =sc.nextInt();
                addData(integerData,idata);
                break;
            case 3:
                System.out.println("Enter Float Data: ");
                float fdata =sc.nextFloat();
                addData(floatData, fdata);
                break;
            case 4:
                System.out.println("Enter Double Data: ");
                double ddata =sc.nextDouble();
                addData(doubleData, ddata);
                break;
            case 5:
                addData(employeeData,new EmployeeData("Ayesha Javed"));
                addData(employeeData,new EmployeeData("Muhammad ALi"));
                addData(employeeData,new EmployeeData("Maheen Fatima"));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public static void main(String[] args) {
        Main driver = new Main();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("""
                    Enter your choice:
                    ******************
                    1. Add Data
                    2. Remove Data(By index)
                    3. Get Data Item(By index)
                    4. Display Data
                    5. Exit

                    """);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    driver.selectAddDataType(sc);
                    break;
                case 2:
                    System.out.println("Enter index: ");
                    int i = sc.nextInt();
                    //removing string data
                    driver.stringData.removeItem(i);
                    break;
                case 3:
                    System.out.println("Enter index: ");
                    int index = sc.nextInt();
                    //getting string data
                    System.out.println(driver.stringData.getItemById(index));

                    break;
                case 4:
                    driver.displayItems(driver.stringData);
                    driver.displayItems(driver.integerData);
                    driver.displayItems(driver.doubleData);
                    driver.displayItems(driver.floatData);
                    driver.displayItems(driver.employeeData);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }
    
}
