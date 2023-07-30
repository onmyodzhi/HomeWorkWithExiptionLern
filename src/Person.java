import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    protected String name;
    protected String surname;
    protected String fatherName;
    protected String birthday;
    protected String phoneNumber;

    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = scanner.nextLine();
        System.out.println("Enter surname");
        this.surname = scanner.nextLine();
        System.out.println("Enter fatherName");
        this.fatherName = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{2}" + '.' + "\\d{2}" + '.' + "\\d{4}");
        Matcher matcher;
        while (true) {
            System.out.println("Enter birthday");
            this.birthday = scanner.nextLine();
            matcher = pattern.matcher(birthday);
            if (matcher.find()){
                break;
            }
            System.err.println("You entered your birthday incorrectly, please try again.");
        }
        Pattern pattern1 = Pattern.compile(  "\\+\\d{11}");
        Matcher matcher1;
        while (true) {
            System.out.println("Enter phone number");
            this.phoneNumber = scanner.nextLine();
            matcher1 = pattern1.matcher(phoneNumber);
            if (matcher1.find()) {
                break;
            }
            System.err.println("You entered your phone number incorrectly, please try again.");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
