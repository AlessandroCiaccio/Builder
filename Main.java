public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.setFirstName("Piero");
        builder.setLastName("Lupo");
        builder.setAge(22);
        builder.setAddress("Via Milano 22");
        Person person1=builder.build();
        System.out.println(person1);

        builder = new PersonBuilder();
        builder.setFirstName("Luca");
        builder.setLastName("Paglia");
        Person person2=builder.build();
        System.out.println(person2);
    }
}
