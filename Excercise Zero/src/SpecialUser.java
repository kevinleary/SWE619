public class SpecialUser extends User {
    private int id;
    public SpecialUser (String name, int id) { super(name); this.id = id; }
    @Override public boolean equals (Object obj) {
       if (!(obj instanceof SpecialUser)) return false;
       return super.equals(obj) && ((SpecialUser) obj).id == this.id;
    }
    // other methods omitted
}