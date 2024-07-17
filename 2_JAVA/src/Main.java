//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Elon Mask");

        //System.out.println(person.getName());

        person.setName("Jone Jones");

        //System.out.println(person.getName());


        Fraction f1 = new Fraction(2,3);
        System.out.println("F1 = " + f1);
        Fraction f2 = new Fraction(3,4);
        System.out.println("F2 = " + f2);


        Fraction result = new Fraction(0);

        result = result.add(f1,f2);
        System.out.println("F1 + F2 = " + result);

        result = result.sub(f1,f2);
        System.out.println("F1 - F2 = " + result);

        result = result.mul(f1,f2);
        System.out.println("F1 * F2 = " + result);

        result = result.div(f1,f2);
        System.out.println("F1 / F2 = " + result);

    }
}