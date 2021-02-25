public class message {
    String s;
    String m;
    String r;
    message()
    {

    }

    boolean sendMessage(String s, String r, String m ){
        if(s.isEmpty() || r.isEmpty() || m.isEmpty()) {
            return false;
        }
        else
            return true;
    }
}
