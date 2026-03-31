package homework5;

public class Patient {
    private String name;
    private String treatmentPlan;
    private Doctor doctor;

    public Patient(String name, String treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    //setter для назначения доктора
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    //getter для получения имени пациента
    public String getName() {
        return name;
    }

    //getter для получения плана лечения
    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    // getter для получения назначенного доктора
    public Doctor getDoctor() {
        return doctor;
    }

    // метод для вывода информации о пациенте
    public void info() {
        System.out.println("Пациент: " + name);
        System.out.println("План лечения: " + treatmentPlan);
        if (doctor != null) {
            System.out.println("Лечащий врач: " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        } else {
            System.out.println("Лечащий врач: не назначен");
        }
    }
}
