class Receptionist extends Person {
    public Receptionist(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("Receptionist: " + name);
    }
}
