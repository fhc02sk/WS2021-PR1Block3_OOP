public class DemoPersonApp {

    public static void main(String[] args) {
        Person max = new Person();
        max.firstname = "Max";
        max.lastname = "Mustermann";
        max.age = 39;

        Person susi;
        susi = new Person();
        susi.firstname = "Susi";
        susi.lastname = "Sorglos";
        susi.age = 37;

        printPerson(max);
        printPerson(susi);

        max.print();
        susi.print();
    }

    public static void printPerson(Person p){
        System.out.println(p.firstname + " " + p.lastname + " ist " + p.age + " Jahre alt");
    }
}
