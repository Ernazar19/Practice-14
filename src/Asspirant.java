public class Asspirant extends Student {
    public Asspirant(String firstName, String lastName, String group, double averagemark) {
        super(firstName, lastName, group, averagemark);
    }void getscholarship(double averagemark){
        if (averagemark>5){
            System.out.println("Vasha stipendiya sostovlyaet : 2500som");
        } else if (averagemark<5) {
            System.out.println("Vasha stipendiya sostovlyaet : 2200 som");

        }

    }

    @Override
    public String toString() {
        return "Asspirant{"+
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group='" +getGroup() + '\'' +
                ", averagemark=" +getAveragemark() +
                '}';
    }
}