public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kairat", "Nuridinov", "Java-9", 4.00);
        Student student2 = new Student("Dastan", "Jeishbekov", "OGR-308", 4.99);
        Student student3 = new Student("Adinay", "Asanaliva", "Disainer", 5.87);
        Student student4 = new Student("Kamilla", "Saralaeva", "Translator", 5.6);
        Student student5 = new Student("Aziret", "Azamatov", "Lingvist", 5);
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student a : students) {
            System.out.println(a);
            a.getscholarship(a.getAveragemark());
            System.out.println("***********************************************");
        }


        Asspirant asspirant1 = new Asspirant("Aidar", "Kachkynbaev", "VVS", 4.05);
        Asspirant asspirant2 = new Asspirant("Aidana", "Sovetbekova", "jurnalistika", 5.25);
        Asspirant asspirant3 = new Asspirant("Aliya", "Bayamanova", "MVD", 4.00);
        Asspirant asspirant4 = new Asspirant("Eleonora", "Jumabaeva", "Dantist", 5.99);
        Asspirant asspirant5 = new Asspirant("Azamat", "Izatbekova", "Jurnalist", 5.23);
        Asspirant[] asspirants = {asspirant1, asspirant2, asspirant3, asspirant4, asspirant5};
        for (Asspirant b : asspirants) {
            System.out.println(b);
            b.getscholarship(b.getAveragemark());
            System.out.println("***********************************************");
        }


        Doctor doctor = new Doctor("Altynai Taalaibekova", 28, "White coat", 5, 20000);
        System.out.println(doctor);
        doctor.whork();
        doctor.whear();
        System.out.println("*************************************************************");
        Police police = new Police("Almaz Ruslan uulu",24,"Uniform",3,17000);
        System.out.println(police);
        police.whork();
        police.whear();
        System.out.println("*************************************************************");
        FireMan fireMan = new FireMan("Bakyt Mukashev",47,"BOP",20,20000);
        System.out.println(fireMan);
        fireMan.whork();
        fireMan.whear();

        }

    }
