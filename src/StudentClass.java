import java.util.Scanner;

public class StudentClass {
    String name;
    int rollNo;

    StudentClass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int rollNo1 = sc.nextInt();

        String name2 = sc.next();
        int rollNo2 = sc.nextInt();

        StudentClass s1 = new StudentClass(name1, rollNo1);
        StudentClass s2 = new StudentClass(name2, rollNo2);

        System.out.println("Name: " + s1.name + " Roll: " + s1.rollNo);
        System.out.println("Name: " + s2.name + " Roll: " + s2.rollNo);
        
        sc.close();
    }
}
