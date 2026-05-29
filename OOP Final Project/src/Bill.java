import java.util.*;
public class Bill {
    private int amount;

    public Bill(ArrayList<MedicalReport> reports) {
        amount = 0;
        for (MedicalReport r : reports) {
            amount += r.getCost();
        }
    }
    public void showBill() {
        System.out.println("Total Bill: " + amount);
    }
}
