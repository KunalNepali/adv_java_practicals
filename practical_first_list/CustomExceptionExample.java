class AgeLimitException extends Exception {
    public AgeLimitException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void checkAge(int age) throws AgeLimitException {
        if (age < 18) {
            throw new AgeLimitException("You must be 18 or older to register.");
        } else {
            System.out.println("You are eligible to register.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeLimitException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkAge(20);
        } catch (AgeLimitException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}