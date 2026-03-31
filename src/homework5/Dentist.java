package homework5;
/*
Класс стоматолога
 */
public class Dentist extends Doctor{
    public Dentist(String name) {
        super(name, "Стоматолог");
    }

    @Override
    public void treat() {
        System.out.println(getSpecialization() + " " + getName() + " лечит зубы");
    }
}
