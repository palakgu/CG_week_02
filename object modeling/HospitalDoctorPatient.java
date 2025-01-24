import java.util.ArrayList;
import java.util.List;

class Patient {
    private String patientName;
    private String patientId;
    private List<Doctor> doctors;

    public Patient(String patientName, String patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("\nDoctors consulting " + patientName + ":");
        for (Doctor doctor : doctors) {
            doctor.printDetails();
        }
    }
}

class Doctor {
    private String DoctorName;
    private String doctorId;
    private List<Patient> patients;

    public Doctor(String DoctorName, String doctorId) {
        this.DoctorName = DoctorName;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println(DoctorName + " is consulting with " + patient.getPatientName());
    }

    public void showPatients() {
        System.out.println("\nPatients under " + DoctorName + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
    }

    public void printDetails() {
        System.out.println("Doctor Name: " + DoctorName);
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("\nDoctors at " + name + ":");
        for (Doctor doctor : doctors) {
            doctor.printDetails();
        }
    }

    public void showPatients() {
        System.out.println("\nPatients at " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
    }
}

public class HospitalDoctorPatient {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "D001");
        Doctor doctor2 = new Doctor("Dr. Jones", "D002");

        // Create patients
        Patient patient1 = new Patient("Alice", "P001");
        Patient patient2 = new Patient("Bob", "P002");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Doctor consultations
        doctor1.consult(patient1); // Dr. Smith consults with Alice
        doctor1.consult(patient2); // Dr. Smith consults with Bob
        doctor2.consult(patient1); // Dr. Jones consults with Alice

        // Show all doctors and patients at the hospital
        hospital.showDoctors();
        hospital.showPatients();

        // Show doctors consulting each patient
        patient1.showDoctors();
        patient2.showDoctors();

        // Show patients under each doctor
        doctor1.showPatients();
        doctor2.showPatients();
    }
}
