import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        boolean isValidUser = false;


        for (String[] student : database.getStudents()) {
            if (student[0].equals(username) && student[1].equals(password)) {
                Student studentObj = new Student(username, password, database);
                System.out.println("You are a student. Your courses are:");
                studentObj.showCourses();
                isValidUser = true;
                break;
            }
        }


        if (!isValidUser) {
            for (String[] instructor : database.getInstructors()) {
                if (instructor[0].equals(username) && instructor[1].equals(password)) {
                    Instructor instructorObj = new Instructor(username, password, database);
                    System.out.println("You are an instructor. Your students are:");
                    instructorObj.showStudents();
                    isValidUser = true;
                    break;
                }
            }
        }


        if (!isValidUser) {
            System.out.println("Invalid username or password.");
        }
    }
}
