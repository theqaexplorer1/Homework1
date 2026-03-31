package homework5;

public class Therapist extends Doctor{
    public Therapist(String name) {
        super(name, "Терапевт");
    }

    @Override
    public void treat() {
        System.out.println(getSpecialization() + " " + getName() + " выполняет лечение");
    }

    // методы для назначения врача пациенту
    public void assignDoctor(Patient patient, int treatmentPlanCode) {
        Doctor assignedDoctor; // назначенный врач
        //Если план лечения имеет код 1 – назначить хирурга
        if (treatmentPlanCode == 1) {
            assignedDoctor = new Surgeon("Дмитрий Алексеевич");
            System.out.println("\nПациенту назначен хирург");
        }
        //Если план лечения имеет код 2 – назначить дантиста
        else if (treatmentPlanCode == 2) {
            assignedDoctor = new Dentist("Сергей Николаевич");
            System.out.println("\nПациенту назначен Стоматолог");
        }
        // Если план лечения имеет любой другой код – назначить терапевта
        else {
            assignedDoctor = new Therapist("Иван Иванович");
            System.out.println("\nПациенту назначен терапевт");
        }

        patient.setDoctor(assignedDoctor);  //Устанавливаем врача
        assignedDoctor.treat(); // Выполняем метод лечить
    }
}
