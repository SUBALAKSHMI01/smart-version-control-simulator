package com.subalakshmi.versioncontrol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VersionControlSystem vcs = new VersionControlSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Smart Version Control Simulator ===");
            System.out.println("1. Add Version");
            System.out.println("2. Undo Last Version");
            System.out.println("3. Retrieve Version by ID");
            System.out.println("4. Show Version History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter version content: ");
                    String content = scanner.nextLine();
                    vcs.commit(content);
                    System.out.println("Version committed successfully.");
                    break;

                case 2:
                    vcs.undoLastVersion();
                    break;

                case 3:
                    System.out.print("Enter version ID: ");
                    int id = scanner.nextInt();
                    Version version = vcs.getVersionById(id);

                    if (version != null) {
                        System.out.println(version);
                    } else {
                        System.out.println("Version not found.");
                    }
                    break;

                case 4:
                    vcs.showVersionHistory();
                    break;

                case 5:
                    System.out.println("Exiting Version Control System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
