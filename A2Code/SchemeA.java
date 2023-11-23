package A2Code;

public class SchemeA implements Encrypt{

    //Just to make it work. Don't know how to write the algorithm
    private Object key = "A";

    @Override
    public Object encryption(Object input, Object key) {
        if(key!=this.key){
            return "KEY FALSE(encrypted wrong)";
        }
        // some algorithms from scheme A
        String output = input+"(encrypted code by scheme A)";
        return output;
    }

    @Override
    public Object decryption(Object input, Object key) {
        if(key!=this.key){
            return "KEY FALSE(encrypted wrong)";
        }
        // some algorithms from scheme A
        String output = input + "(decrypted back from sheme A)";
        return output;
    }
    @Override
    public Object getkey(){return this.key;}
    
}
