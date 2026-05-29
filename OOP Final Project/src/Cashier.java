class Cashier extends Person {
    public Cashier(String name) {
        super(name);
    }
    public void generateBill(Bill b) {
        System.out.println("Cashier " + name + " generating bill...");
        b.showBill();
    }
    @Override
    public void showInfo() {
        System.out.println("Cashier: " + name);
    }
}
