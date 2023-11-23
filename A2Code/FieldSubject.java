package A2Code;

public interface FieldSubject extends Entity {
    //public ArrayList<Spy> dead = new ArrayList<Spy>();

    public void registerSpy(Spy spy);
    public void removeDead(Spy spy);
    public Encrypt getscheme();
    public void update();
}