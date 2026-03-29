package homework5;
/*
Класс хирурга
 */
public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name, "Хирург");
    }

    @Override
    public void treat() {
        System.out.println(getSpecialization() + " " + getName() + " проводит операцию");
    }
}
