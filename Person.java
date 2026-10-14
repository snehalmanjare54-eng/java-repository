package Assig1;

class Person {
    int pid, age;
    String pname, gender;

    Person() {
        pid = 0;
        pname = "Unknown";
        age = 0;
        gender = "Unknown";
    }

    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println(pid + " " + pname + " " + age + " " + gender);
    }

    public static void main(String args[]) {

        Person p[] = new Person[5];

        p[0] = new Person(1, "Amit", 20, "Male");
        p[1] = new Person(2, "Sneha", 21, "Female");
        p[2] = new Person(3, "Rahul", 22, "Male");
        p[3] = new Person(4, "Pooja", 20, "Female");
        p[4] = new Person(5, "Ravi", 23, "Male");

        for(int i = 0; i < 5; i++)
            p[i].display();
    }
}