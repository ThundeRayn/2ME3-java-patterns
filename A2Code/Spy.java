package A2Code;
import java.util.ArrayList;

public class Spy implements SpyObserver{

    private String selfname;
    private String fromwho;
    private Object received_message;
    private Object received_key;
    private ArrayList<String> allmessages = new ArrayList<String>();
    private FieldBase fieldbase;
    private Encrypt current_scheme;


    public Spy(String name, FieldBase fieldbase){
        this.selfname = name;
        this.fieldbase = fieldbase;
        this.fieldbase.registerSpy(this);
        this.current_scheme=this.fieldbase.getscheme();
    }//once create a new spy, is a new person

    @Override
    public void isdead(){
        sendMessage(this.fieldbase,this.current_scheme.encryption(selfname+" is Dead", this.received_key),this.received_key);
        fieldbase.removeDead(this);
    }//once dead, never be found. 
    //there is no add back to fieldbase methods

    @Override
    public void update(){
        this.current_scheme=this.fieldbase.getscheme();
    }

    //methods from entity
    //messages
    @Override
    public void sendMessage(Entity who, Object Message, Object key) {
        who.receiveMesage(this, this.current_scheme.encryption(Message,key), key);
    }
    
    @Override
    public void receiveMesage(Entity fromwho, Object Message, Object key) {
        this.received_message=this.current_scheme.decryption(Message,key);
        this.fromwho = fromwho.getSelfname();
        this.received_key=key;
        allmessages.add("from "+this.fromwho+ ": "+this.received_message);
    }
    //getters
    @Override
    public String getSelfname(){return this.selfname;};
    @Override
    public Object getRecievedMessage(){return "from "+this.fromwho+ ": "+this.received_message;}
    @Override
    public Object getRecievedKey(){return this.received_key;}
    @Override
    public ArrayList<String> getAllMessages() {return allmessages;}
}