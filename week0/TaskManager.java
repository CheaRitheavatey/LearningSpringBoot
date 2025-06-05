package week0;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        task s = new task();
        s.start();
    }

    
}


class task {
        // data field
    private ArrayList<String> store = new ArrayList<>();
    private Scanner scanner;
    private String num;

    //  add function
    public void add() {
        System.out.print("Task that you want to add: ");
        String task = scanner.next();
        store.add(task);

        System.out.println("added successfully");
        
    }
    public void view() {
        System.out.print("View task: ");
        if (!store.isEmpty()) {
            System.out.println(store);
        } else {
            System.out.println("Empty");
        }
        
    }


    public void delete() {
        if (!store.isEmpty()) {
            view();
            System.out.println();
            System.out.print("what do you want to delete: ");
            String del = scanner.next();


            for (String element: store) {
                if (element.equals(del)) {
                    store.remove(element);
                }
            }

            System.out.println("removed successfully");
        } else {
            System.out.print("Empty cannot remove");
        }
    }

    public void start() {
        

        do {

            try {
                

        scanner = new Scanner(System.in);
        System.out.println("Task Manager");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
        System.out.print("Enter your choice using number: ");
        num = scanner.next();

        switch (num) {
            case "1":
                add();
                break;
            case "2":
                view();
                break;
            case "3":
                delete();
                break;
            case "4":
                System.out.println("exited");
                break;
        
        }

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        } while (!num.equals("4"));
        
        
    }

}

