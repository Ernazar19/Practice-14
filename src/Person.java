public class Person {
    private String fullName;
    private  int age ;
    private  String clothes;
    private  int experience;
    private  long salary;

    public Person(String fullName, int age, String clothes, int experience, long salary) {
        this.fullName = fullName;
        this.age = age;
        this.clothes = clothes;
        this.experience = experience;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person "+
                " fullname " + fullName +
                " age " + age +
                " clothes " + clothes +
                " experience " + experience +
                " salary " + salary;
    }
}
