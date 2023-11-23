package A2Code;
import java.util.ArrayList;

public class FieldBase implements FieldSubject{

    private String selfname;
    private String fromwho;
    private Object received_message;
    private Object received_key;
    private ArrayList<String> allmessages = new ArrayList<String>();
    private ArrayList<Spy> spylist = new ArrayList<Spy>();
    private HomeBase homebase;
    private Encrypt current_scheme;

    public FieldBase(String fieldname,HomeBase homebase){
        this.selfname=fieldname;
        this.homebase=homebase;
        this.current_scheme=homebase.getscheme();
    }

    @Override
    public void registerSpy(Spy spy) {
        spylist.add(spy);
    }

    @Override
    public void removeDead(Spy spy) {
        spylist.remove(spy);
    }

    @Override
    public Encrypt getscheme(){
        return this.homebase.getscheme();
    }

    @Override
    public void update(){
        for(Spy spy: spylist) {
			spy.update();
		}
        this.current_scheme=this.homebase.getscheme();
    }

    public void viewSpies(){
        for(Spy spy: spylist){
            System.out.println(spy.getSelfname());
        }
    }


    //methods from entity
    //getters
    @Override
    public String getSelfname(){return this.selfname;};
    @Override
    public Object getRecievedMessage(){return "from "+this.fromwho+":"+this.received_message;}
    @Override
    public Object getRecievedKey() {return this.received_key;};

    @Override
    public void sendMessage(Entity who, Object Message, Object key) {
        who.receiveMesage(this, this.current_scheme.encryption(Message, key),key);
    }

    @Override
    public void receiveMesage(Entity fromwho, Object Message, Object key) {
        this.fromwho = fromwho.getSelfname();
        this.received_message=this.current_scheme.decryption(Message, key);
        this.received_key=key;
        allmessages.add("from "+this.fromwho+":"+this.received_message);
    }
    @Override
    public ArrayList<String> getAllMessages() {return allmessages;}
}
