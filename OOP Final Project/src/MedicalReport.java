class MedicalReport {
    private String type;
    private int cost;
    private String status;

    public MedicalReport(String type,String status){
        this.type = type;
        this.status = status;
        if (type.equals("Blood Test")) {
            cost = 500;
        } else if (type.equals("X-Ray")) {
            cost = 800;
        } else if (type.equals("MRI")) {
            cost = 2000;
        } else if (type.equals("CT Scan")) {
            cost = 1500;
        } else if (type.equals("Urine Test")) {
            cost = 400;
        } else if (type.equals("ECG")) {
            cost = 1200;
        } else if (type.equals("Ultrasound")) {
            cost = 1800;
        } else if (type.equals("Eye Test")) {
            cost = 350;
        } else if (type.equals("Diabetes Test")) {
            cost = 700;
        } else if (type.equals("Covid Test")) {
            cost = 1000;
        } else {
            cost = 300;
        }
    }
    public int getCost() {
        return cost;
    }
    public String getStatus() {
        return status;
    }
    public void generateReport(PatientData p, String details) {
        System.out.println(type + " Report: " + details + " (Cost: " + cost + ")");
    }
}