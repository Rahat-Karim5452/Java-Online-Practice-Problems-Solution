class Prescription {
    private int serialNumber;
    private PatientData patient;

    public Prescription(int serialNumber, PatientData patient) {
        this.serialNumber = serialNumber;
        this.patient = patient;
    }
    public void viewPrescription() {
        System.out.println("Prescription #" + serialNumber);
        patient.display();
    }
}