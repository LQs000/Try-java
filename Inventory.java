import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        //process
        while (true) {
            System.out.println("\n=== Product display system ===");
            System.out.println("1. Add product");
            System.out.println("2. View all product");
            System.out.println("3. Delete product");
            System.out.println("4. Exit");
            System.out.print("Select choice (1-4) : ");

            int choice = sc.nextInt();
            sc.nextLine(); //clear

            if(choice == 1){
                System.out.print("Fill Product name : ");
                String item = sc.nextLine();
                inventory.add(item);
                System.out.println("Add "+ item +"Success!");
            }else if(choice == 2){
                System.out.println("\nAll product in inventory");
                if(inventory.isEmpty()){
                    System.out.println("- No product in Inventory -");
                }else {
                    for(int i = 0; i<inventory.size();i++){
                        System.out.println((i + 1)+". "+inventory.get(i));
                    }
                }
            }else if(choice == 3){
                System.out.print("Input product number to delete :");
                int index = sc.nextInt();

                //check product in ArrayList
                if(index > 0 && index <= inventory.size()){
                    String removedItem = inventory.remove( index -1); // -1 because index start at 0
                    System.out.println("Delete "+ removedItem+" Done!");
                }else{
                    System.out.println("Error : No product");
                }
            }else if(choice == 4){
                System.out.println("Close program....................");
                break;
            }else{
                System.out.println("Pls input (1-4) Only");
            }
        }
        sc.close();
    }
}
