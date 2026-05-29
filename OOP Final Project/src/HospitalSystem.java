import java.util.*;
public class HospitalSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<PatientData> patients = new ArrayList<>();
        int choice;
        int serialCounter = 1;

        do {
            System.out.println("\n-------- HOSPITAL MENU ---------");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    // Patient Input
                    System.out.print("Enter Patient Name: ");
                    String pName = sc.nextLine();

                    System.out.print("Enter Symptoms/Problem: ");
                    String disease = sc.nextLine();

                    int phone;
                    while (true) {
                        System.out.print("Enter Phone (10 digits,without Leading Zero): ");

                        phone = sc.nextInt();
                        sc.nextLine();

                        if (phone > 99999999 && phone <= 2147483647){
                            break;
                        } else {
                            System.out.println("Invalid");
                        }
                    }

                    PatientData patient = new PatientData(pName, disease, phone);
                    patients.add(patient);


                    //Receptionist
                    System.out.print("Enter Receptionist Name: ");
                    String rName = sc.nextLine();
                    Receptionist rec = new Receptionist(rName);

                    // Doctor
                    System.out.print("Enter Doctor Name: ");
                    String dName = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();
                    Doctor doctor = new Doctor(dName, spec);
                    doctor.givePrescription(patient);


                    // Cashier
                    System.out.print("Enter Cashier Name: ");
                    String cName = sc.nextLine();
                    Cashier cashier = new Cashier(cName);

                    //Report Input
                    ArrayList<MedicalReport> reports = new ArrayList<>();

                    //Availabele Report Type
                    System.out.println("\nAvailable Report Types:");
                    System.out.println("1. Blood Test");
                    System.out.println("2. X-Ray");
                    System.out.println("3. MRI");
                    System.out.println("4. CT Scan");
                    System.out.println("5. Urine Test");
                    System.out.println("6. ECG");
                    System.out.println("7. Ultrasound");
                    System.out.println("8. Eye Test");
                    System.out.println("9. Diabetes Test");
                    System.out.println("10. Covid Test");

                    int n;

                    // Number of reports
                    while (true) {
                        System.out.print("Enter number of reports (Max 10): ");

                        n = sc.nextInt();
                        sc.nextLine();

                        if (n >= 1 && n <= 10) {
                            break;
                        } else {
                            System.out.println("Invalid");
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.print("\nSelect Report Type Number: ");
                        int option;
                        String type = "";
                        // Report Type
                        while (true) {

                            option = sc.nextInt();
                            sc.nextLine();

                            switch(option) {
                                case 1:
                                    type = "Blood Test";
                                    break;
                                case 2:
                                    type = "X-Ray";
                                    break;
                                case 3:
                                    type = "MRI";
                                    break;
                                case 4:
                                    type = "CT Scan";
                                    break;
                                case 5:
                                    type = "Urine Test";
                                    break;
                                case 6:
                                    type = "ECG";
                                    break;
                                case 7:
                                    type = "Ultrasound";
                                    break;
                                case 8:
                                    type = "Eye Test";
                                    break;
                                case 9:
                                    type = "Diabetes Test";
                                    break;
                                case 10:
                                    type = "Covid Test";
                                    break;
                                default:
                                    type = "";
                            }
                            if (!type.equals("")) {
                                break;
                            } else {
                                System.out.println("Invalid");
                                System.out.print("Select valid report type: ");
                            }
                        }
                        System.out.print("Enter Report Status: ");
                        String status = sc.nextLine();

                        MedicalReport report = new MedicalReport(type, status);
                        report.generateReport(patient, status);

                        reports.add(report);
                    }
                    // Prescription
                    int serial = serialCounter++;
                    Prescription pres = new Prescription(serial, patient);

                    // Auto Bill
                    Bill bill = new Bill(reports);

                    // Output
                    System.out.println();
                    System.out.println("------Patient Final Report-------");
                    doctor.showInfo();
                    rec.showInfo();
                    doctor.givePrescription(patient);
                    pres.viewPrescription();
                    System.out.println("------------Medical Reports----------");
                    for (MedicalReport r : reports) {
                        System.out.println("Report Status: " + r.getStatus());
                    }
                    cashier.generateBill(bill);
                    break;
                case 2:
                    System.out.println("\n--- Patient List ---");
                    if (patients.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        for (int i = 0; i < patients.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            patients.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}