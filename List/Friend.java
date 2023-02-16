package List;
public class Friend {
    private String username;
    private boolean status; //true for online, false for offline

    public Friend(String name, boolean online){
        this.username = name;
        this.status = online;
    }

    public Friend(String name){
        this(name,false);
    }

    public void setStatus(boolean online){
        this.status = online;
    }
    @Override
    public String toString() {
        String s = this.status ? "Online" : "Offline";
        return username + " " + s;
    }
}
