import business.Company;

public class Person {
    private final double PI = 3.14;
    private final String constant = "Hello";
    private String firstName = "Nguyen";
    private int age;
    private long id;
    private char MiddleInit;
    private byte MyByte;
    private static Company company = new Company();
    private static Company company1 = new Company();
    private NewsAgency agency;

    public static void main(String[] args) {
        System.out.println(company);
        System.out.println(company1);
    }
}
