public class Person {
    private String name ;
    private String email ;

    public void display() {
        System.out.println( "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}');
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
