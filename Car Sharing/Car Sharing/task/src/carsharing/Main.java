package carsharing;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static CompanyService companyService = null;
    public static CarService carService = null;
    public static final Scanner sc = new Scanner(System.in);
    public static int mainMenu = -1;

    public static String getDbName(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("-databaseFileName")) {
                if (i + 1 < args.length) {
                    return args[i + 1];
                }
            }
        }
        return "test";
    }

    public static void pickManager() throws SQLException {
        System.out.println("1. Company list");
        System.out.println("2. Create a company");
        System.out.println("0. Back");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 0:
                mainMenu = -1;
                break;
            case 1:
                companyPicker();
                break;
            case 2:
                createCompany();
                break;
        }
    }

    private static void carMenu(Company company) throws SQLException {
        while (true) {
            System.out.printf("'%s' company%n", company.getName());
            System.out.println("1. Car list\n" +
                    "2. Create a car\n" +
                    "0. Back");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) {
                return;
            } else if (choice == 2) {
                System.out.println("Enter the car name: ");
                String name = sc.nextLine();
                carService.createCar(name, company.getId());
                System.out.println("The car was added!");
            } else if (choice == 1) {
                System.out.println(carService.getCarsAsString(company.getId()));
            }
        }
    }

    private static void companyPicker() throws SQLException {
        String companies = companyService.getCompaniesAsString();
        if (!"The company list is empty!".equals(companies)) {
            System.out.print(companies);
            System.out.println("0. Back");
            int num = Integer.parseInt(sc.nextLine());
            if (num != 0) {
                carMenu(companyService.getCompanyById(num));
//                companyPicker();
            }
        } else {
            System.out.println(companies);
        }

    }

    private static void createCompany() throws SQLException {
        System.out.println("Enter the company name:");
        companyService.createCompany(sc.nextLine());
        System.out.println("The company was created!");
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final DBConnection dbConnection = new DBConnection(getDbName(args));
        companyService = new CompanyService(dbConnection.getConnection());
        carService = new CarService(dbConnection.getConnection());
        while (mainMenu != 0) {
            if (mainMenu == -1) {
                System.out.println("1. Log in as a manager");
                System.out.println("0. Exit");
                mainMenu = Integer.parseInt(sc.nextLine());
            }
            if (mainMenu == 1) {
                pickManager();
            }
        }


    }
}