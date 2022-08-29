public class User {
    private String name;
    public User (String name) { this.name = name; }
    @Override public boolean equals (Object obj) {
       if (!(obj instanceof User)) return false;
       return ((User) obj).name.equals(this.name);
    }
    // other methods omitted
}
