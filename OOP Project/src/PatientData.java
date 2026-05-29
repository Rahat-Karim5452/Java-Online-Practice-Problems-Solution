class PatientData {
    private String patientName;
    private String sickness;
    private int phone;

    public PatientData(String patientName, String sickness, int phone) {
        this.patientName = patientName;
        this.sickness = sickness;
        this.phone = phone;
    }
    public String getPatientName()
    {
        return patientName;
    }
    public String getSickness()
    {
        return sickness;
    }
    public void display() {
        System.out.println("Patient: "+patientName);
        System.out.println("Problem: "+sickness);
        System.out.println("Phone: 0"+phone);
    }
}