//TASK 4

public class InvalidAgeException extends RuntimeException {
        public InvalidAgeException(String message){
            super(message);
        }
}
class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Registration failed: The age for " + name + " is invalid (" + age + "). The age must be between 18 and 120!");
        }
        this.age = age;
    }
    public static void main(String[] args) {
        try {
            User registerUser = new User("nebi", 17);
            registerUser.setAge(100);
            System.out.println("Registration successful:" + registerUser.getName());
        } catch (InvalidAgeException e) {
            System.out.println("An error occurred. -> " + e.getMessage());
        }
    }
}
