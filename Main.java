package main;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    static void main(String[] args){
        ArrayList<String> students = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to student manager program.");
        boolean running = true;

        do {
            System.out.println("type 1 to enter a student name," +
                    "\n 2 to remove a student from the list, " +
                    "\n 3 to show students in the list, \n" +
                    " 4 to exit.");
            String choice = reader.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("enter a student name: ");
                    String name = reader.nextLine().trim().toLowerCase();
                    students.add(name);
                    System.out.println("student's name is saved!");
                    break;

                case "2":
                    System.out.println("enter the name of the student you want to delete. ");
                    String delete = reader.nextLine();
                    if (students.remove(String.valueOf(delete).trim().toLowerCase())){
                        System.out.println("student has been deleted");
                    }
                    else{
                        System.out.println("student not found");
                    }
                    break;

                case "3":
                    if (students.isEmpty()){
                        System.out.println("there are no students saved.");
                    }
                    else {
                        for (String s : students){
                            System.out.println(s);
                        }
                    }
                    break;

                case "4":
                    System.out.println("Leaving.");
                    running = false;
                    break;

                default:
                    System.out.println("please enter a valid option");
            }
        }while(running);
    }
}  
