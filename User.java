package HomeWork1;

public final class User {
    private final String username;
    private final String firstName;
    private final String lastName;

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

/*

    // le-am comentat ca sa fac obiectul immutable

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
*/

    public String generateDisplayName(){
        return this.firstName + this.lastName;
    }
}
