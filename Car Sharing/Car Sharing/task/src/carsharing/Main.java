package carsharing;

import carsharing.config.DBConnection;
import carsharing.models.Car;
import carsharing.models.Company;
import carsharing.models.Customer;
import carsharing.services.CarService;
import carsharing.services.CompanyService;
import carsharing.services.CustomerService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static CompanyService companyService = null;
    public static CarService carService = null;
    public static CustomerService customerService = null;
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
        customerService = new CustomerService(dbConnection.getConnection());
        while (mainMenu != 0) {
            if (mainMenu == -1) {
                System.out.println("1. Log in as a manager");
                System.out.println("2. Log in as a customer\n" +
                        "3. Create a customer");
                System.out.println("0. Exit");
                mainMenu = Integer.parseInt(sc.nextLine());
            }
            if (mainMenu == 1) {
                pickManager();
            } else if (mainMenu == 3) {
                createUser();
                mainMenu = -1;
            } else if (mainMenu == 2) {
                pickUser();
                mainMenu = -1;
            }
        }


    }

    private static void pickUser() throws SQLException {
        String res = customerService.getCustomersAsString();
        if (!res.equals("The customer list is empty!")) {
            while (true) {
                System.out.println(res + "0. Back");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 0) {
                    break;
                } else {
                    userMenu(choice);
                }
            }

        } else {
            System.out.println(res);
        }
    }

    private static void userMenu(int userId) throws SQLException {
        while (true) {
            System.out.println("1. Rent a car\n" +
                    "2. Return a rented car\n" +
                    "3. My rented car\n" +
                    "0. Back");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                listCompanies(userId);
            } else if (choice == 2) {
                returnCar(userId);
            } else if (choice == 3) {
                rentedCar(userId);
            }
        }
    }

    private static void returnCar(int userId) throws SQLException {
        Customer customer = customerService.getCustomerById(userId);
        if (customer.getRentedCarId() == 0) {
            System.out.println("You didn't rent a car!");
        } else {
            customerService.updateCustomer(userId, null);
            System.out.println("You've returned a rented car!");
        }
    }

    private static void rentedCar(int userId) throws SQLException {
        Customer customer = customerService.getCustomerById(userId);
        if (customer.getRentedCarId() == 0) {
            System.out.println("You didn't rent a car!");
        } else {
            Car car = carService.getCarById(customer.getRentedCarId());
            Company company = companyService.getCompanyById(car.getCompanyId());
            System.out.println("Your rented car:");
            System.out.println(car.getName());
            System.out.println("Company:");
            System.out.println(company.getName());
        }
    }

    private static void listCompanies(int userId) throws SQLException {
        Customer customer = customerService.getCustomerById(userId);
        if (customer.getRentedCarId() != 0) {
            System.out.println("You've already rented a car!");
        } else {
            System.out.println(companyService.getCompaniesAsString() + "0. Back");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice != 0) {
                List<Car> carList = carService.getCarsAsList(choice);
                for (int i = 1; i <= carList.size(); i++) {
                    System.out.printf("%d. %s%n", i, carList.get(i - 1).getName());
                }
                System.out.println("0. Back");
                int carChoice = Integer.parseInt(sc.nextLine());
                if (carChoice != 0) {
                    customerService.updateCustomer(userId, carList.get(carChoice - 1).getId());
                    System.out.printf("You rented '%s'%n", carList.get(carChoice - 1).getName());
                }
            }
        }
    }

    private static void createUser() throws SQLException {
        System.out.println("Enter the customer name:");
        customerService.createCustomer(sc.nextLine());
    }
}