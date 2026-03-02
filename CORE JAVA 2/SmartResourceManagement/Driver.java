package SmartResourceManagement;

import java.util.Scanner;

import SmartResourceManagement.controller.ResourceController;
import SmartResourceManagement.model.*;
import SmartResourceManagement.exception.CriticalFailureException;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ResourceController controller = new ResourceController();

        try {
            System.out.println("Select Resource Type:");
            System.out.println("1. CPU");
            System.out.println("2. Memory");
            System.out.println("3. Disk");

            int choice = scanner.nextInt();

            System.out.print("Enter usage percentage (0–100): ");
            int usage = scanner.nextInt();

            Resource resource = null;

            if (choice == 1) {
                resource = new CPUResource(usage);
            } else if (choice == 2) {
                resource = new MemoryResource(usage);
            } else if (choice == 3) {
                resource = new DiskResource(usage);
            } else {
                throw new CriticalFailureException("Invalid resource selection");
            }

            controller.monitor(resource);

        } catch (CriticalFailureException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close();
            System.out.println("System shutdown gracefully");
        }
    }
}
