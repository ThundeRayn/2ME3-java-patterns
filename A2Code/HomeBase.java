package A2Code;

import java.util.ArrayList;

public class HomeBase implements Entity{

    private Encrypt current_scheme;
    private Object key;
    ArrayList<FieldBase> current_fields = new ArrayList<FieldBase>();
    private String selfname;
    private String fromwho;
    private Object received_message;
    private Object received_key;
    private ArrayList<String> allmessages = new ArrayList<>();

    public HomeBase(Encrypt scheme){
        this.current_scheme = scheme;
        this.selfname="HOMEBASE";
        this.key=scheme.getkey();//default value of key
    }

    public void setscheme(Encrypt scheme){
        current_scheme=scheme;
        this.key=scheme.getkey();
        for(FieldBase fields:current_fields){
            fields.receiveMesage(this,this.current_scheme.encryption("scheme is now updated, new key:" +scheme.getkey(),this.key), this.key);
        }
    }//you can change scheme in the future

    public void setkey(Object newkey){
        this.key=newkey;
    }//since I don't write the algorithm for Scheme A,B, I use default key inside algorithm, therefore I didn't test this function here


    public Encrypt getscheme(){
        return this.current_scheme;
    }
    public Object getkey(){return this.key;}

    public void addfield(FieldBase field){
        current_fields.add(field);
    };
    public void darkenfield(FieldBase field){
        current_fields.remove(field);
    };

    public void update(){
        for(FieldBase fields: current_fields) {
			fields.update();
		}
    }

    public void viewFields(){
        System.out.println("Fields registered in homebase");
        for(FieldBase fields:current_fields){
            System.out.println(fields.getSelfname());
        }
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
        allmessages.add("from "+this.fromwho +": "+this.received_message);
    }

    //getters
    @Override
    public String getSelfname(){return this.selfname;};
    @Override
    public Object getRecievedMessage(){return "from "+this.fromwho +": "+this.received_message;}
    @Override
    public Object getRecievedKey(){return this.received_key;}
    @Override
    public ArrayList<String> getAllMessages() {return allmessages;}

}
