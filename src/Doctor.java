public class Doctor extends Person{

    void whork(){
        System.out.println("Dantist");
    }void whear(){
        System.out.println("Medical Device");
    }

    public Doctor(String fullname, int age, String clothes, int experience, long salary) {
        super(fullname, age, clothes, experience, salary);

    }
}
