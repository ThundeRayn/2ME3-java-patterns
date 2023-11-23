package A2Code;

public class SchemeB implements Encrypt{

    //Just to make it seems to be work. Don't know how to write the algorithm
    private Object key = "B";

    @Override
    public Object encryption(Object input, Object key) {
        if(key!=this.key){
            return "KEY FALSE(encrypted wrong)";
        }
        // some algorithms from scheme A
        String output = input + "(encrypted code by scheme B)";
        return output;
    }

    @Override
    public Object decryption(Object input, Object key) {
        if(key!=this.key){
            return "KEY FALSE(encrypted wrong)";
        }
        // some algorithms from scheme A
        String output = input + "(decrypted back from sheme B)";
        return output;
    }

    @Override
    public Object getkey(){return this.key;}
    
}
