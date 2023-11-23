package A2Code;
import java.util.ArrayList;
public interface Entity {

    //messages
    public void sendMessage(Entity who, Object Message, Object key);
    public void receiveMesage(Entity fromwho, Object Message, Object key);

    //getters
    public String getSelfname();
    public Object getRecievedMessage();
    public Object getRecievedKey();
    public ArrayList<String> getAllMessages();
}
