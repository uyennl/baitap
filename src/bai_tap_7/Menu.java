package bai_tap_7;

public class Menu {
    public static void displayMenu() {
        EmployerManager em = new EmployerManager();
        String[] op = {"Create employee", "View employee information", "View employee information has the highest total salary","Exit"};
        MenuGeneric<String> mainMenu = new MenuGeneric<String>("Employee Manager", op) {
            @Override
            public boolean execute(int choice) {
                switch (choice) {
                    case 1:
                        em.create();
                        break;
                    case 2:
                        em.display();
                        break;
                    case 3:
                        em.printHighestSalaryEmployee();
                        break;
                    case 4:
                        return true;

                    default:
                        break;
                }
                return false;
            }
        };
        mainMenu.run();
    }
}
