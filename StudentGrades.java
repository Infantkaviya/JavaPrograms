import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> studentMap;

    public StudentGrades() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println(name + " added with grade: " + grade);
    }

    public void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentMap.get(name));
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Display Grade\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    sg.addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    sg.removeStudent(removeName);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.nextLine();
                    sg.displayGrade(displayName);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}