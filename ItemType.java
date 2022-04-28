
import java.util.Scanner;

public class ItemType{
    public String name;
    public Double costPerDay;
    public Double deposit;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCostPerDay(){
        return costPerDay;
    }
    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public Double getDeposit(){
        return deposit;
    }
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
    public void display() {
        System.out.println("Item tYpe Details");
        System.out.println("Name :" +getName());
        System.out.println("CostPerDay :" +getCostPerDay());
        System.out.println("Deposit :" +getDeposit());
    }
        public static void main(String[] args){

            ItemType I1 = new ItemType();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Item Type Name:");
            I1.setName(sc.nextLine());
            System.out.println("Enter the Cost Per Day");
            I1.setCostPerDay(sc.nextDouble());
            System.out.println("Enter the Deposit:");
            I1.setDeposit(sc.nextDouble());
            I1.display();

        }
        }