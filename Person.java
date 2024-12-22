public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getInitials() {
        StringBuilder initials = new StringBuilder(lastName);
        if (firstName != null && !firstName.isEmpty()) {
            initials.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            initials.append(" ").append(middleName.charAt(0)).append(".");
        }
        return initials.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Губский", "Андрей", "Игоревич");
        Person person2 = new Person("Сидоров", "Винсент", null);
        Person person3 = new Person("Квузнецо", null, null);

        System.out.println(person1.getInitials());
        System.out.println(person2.getInitials());
        System.out.println(person3.getInitials());
    }
}