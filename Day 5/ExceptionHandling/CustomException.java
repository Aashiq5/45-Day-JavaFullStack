class ABCBank {
    public BankAccount openAccount(Person person, String accountType, double initialBalance) {
        if (person.getAge() >= 18) {
            return new BankAccount(person, accountType, initialBalance);
        } else {
            throw new InvalidPersonDetailsException("Account cannot be opened for a person under 18 years of age");
        }
    }
}

class BankAccount {
    private long accountNumber;
    private Person accountHolder;
    private String accountType;
    private double balance;

    private static long nextAccountNumber = 10000001;

    public BankAccount(Person accountHolder, String accountType, double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder.getName() + ", Balance: " + balance;
    }
}

class Person {
    private long aadhaar;
    private int age;
    private String name;

    public Person(long aadhaar, int age, String name) {
        this.aadhaar = aadhaar;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class InvalidPersonDetailsException extends RuntimeException {
    InvalidPersonDetailsException(String exceptionMsg) {
        super(exceptionMsg);
    }
}

class Main {
    public static void main(String[] args) {
        ABCBank bank = new ABCBank();
        Person person = new Person(123456789, 22, "ashik");
        Person person2 = new Person(123456789, 17, "mk");

        try {
            BankAccount account = bank.openAccount(person, "Savings", 5000);
            System.out.println(account);

            BankAccount account2 = bank.openAccount(person2, "Savings", 6000);
            System.out.println(account2);
        } catch (InvalidPersonDetailsException invalidPersonDetailsException) {
            System.out.println(invalidPersonDetailsException);
        }
        System.out.println("End of the Program");
    }
}
