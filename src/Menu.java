import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static void  displayMenu() {
        System.out.println("--------Menu--------");
        System.out.println(" 1 - Add student");
        System.out.println(" 2 - Choose student");
        System.out.println(" 3 - Remove student by id");
        System.out.println(" 4 - Update student");
        System.out.println(" 0 - Exit");
        System.out.println("\n");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        while (scanner.hasNextInt()) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 0: {
                    System.out.println("BYE");
                   System.exit(0);
                   break;
                }
                case 1: {
                    System.out.println("ADD STUDENT");
                    System.out.println("Enter student`s id");
                    int id = scanner.nextInt();

                    System.out.println("Enter student`s surname");
                    String fix = scanner.nextLine();
                    String sur = scanner.nextLine();

                    System.out.println("Enter student`s name");
                    String name = scanner.nextLine();

                    System.out.println("Enter student`s birthday year");
                    int year = scanner.nextInt();
                    Array.add(id, sur, name, year);
                    System.out.println(Arrays.toString(Array.getArr()));
                    displayMenu();
                    break;
                }

                case 2: {
                    System.out.println("CHOOSE STUDENT");
                    System.out.println("Enter student`s id");
                    int id = scanner.nextInt();
                    System.out.println("Student with chosen id: ");
                    Array.search(id);
                    displayMenu();
                    break;
                }

                case 3: {
                    System.out.println("REMOVE STUDENT");
                    System.out.println("Enter student`s id");
                    int id = scanner.nextInt();
                    Array.removeById(id);
                    System.out.println("REMOVED");
                    System.out.println(Arrays.toString(Array.getArr()));
                    displayMenu();
                    break;
                }

                case 4: {
                    System.out.println("UPDATE STUDENT");
                    System.out.println("Enter student`s id");
                    int id = scanner.nextInt();

                    System.out.println("Enter student`s surname");
                    String fix = scanner.nextLine();
                    String surname = scanner.nextLine();

                    System.out.println("Enter student`s name");
                    String name = scanner.nextLine();

                    System.out.println("Enter student`s birthday year");
                    int year = scanner.nextInt();
                    Array.set(id, surname, name, year);
                    System.out.println("UPDATED");
                    System.out.println(Arrays.toString(Array.getArr()));
                    displayMenu();
                    break;
                }

                default:
                    System.out.println("Your choice is wrong");
                    displayMenu();
                    break;
            }
        }
    }
}
