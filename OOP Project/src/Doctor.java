class Doctor extends Person {
    private String specialization;

    public Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
    public void givePrescription(PatientData p) {
        System.out.println("Doctor " + name + " examining " + p.getPatientName());
        System.out.println("Reported Symptoms: " + p.getSickness());
    }
    @Override
    public void showInfo() {
        System.out.println("Doctor: " + name + ",Specialization: " + specialization);
    }
}
