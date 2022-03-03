
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    private String getNormalizedString(String str) {
        return str == null ? "" : str;
    }

    public void setFirstName(String firstName) {
        this.firstName = this.getNormalizedString(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = this.getNormalizedString(lastName);
    }

    public String getFullName() {
        String res = (firstName + " " + lastName).trim();
        return res.length() == 0 ? "Unknown" : res; // write your code here
    }
}
