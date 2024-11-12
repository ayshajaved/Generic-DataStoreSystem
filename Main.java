import java.util.Scanner;

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
        doubleData = new DataStore<Double>(); 
        employeeData = new DataStore<>();
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
                stringData.addItems(data);
                break;
            case 2:
                System.out.println("Enter Integer Data: ");
                int idata =sc.nextInt();
                integerData.addItems(idata);
                break;
            case 3:
                System.out.println("Enter Float Data: ");
                float fdata =sc.nextFloat();
                floatData.addItems(fdata);
                break;
            case 4:
                System.out.println("Enter Double Data: ");
                double ddata =sc.nextDouble();
                doubleData.addItems(ddata);
                break;
            case 5:
                employeeData.addItems(new EmployeeData("Ayesha Javed"));
                employeeData.addItems(new EmployeeData("Muhammad ALi"));
                employeeData.addItems(new EmployeeData("Maheen Fatima"));
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
                    driver.stringData.displayItems();
                    driver.integerData.displayItems();
                    driver.floatData.displayItems();
                    driver.doubleData.displayItems();
                    driver.employeeData.displayItems();
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
