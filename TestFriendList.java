public class TestFriendList {
    public static void main(String[] args) {
        FriendsList friends = new FriendsList();
        System.out.println("testing add");
        friends.add(0,new Friend("Justin", true));
        friends.add(1,new Friend("Becnel", true));
        friends.add(2,new Friend("HoosierDaddy", false));
        System.out.println(friends.toString());
        friends.remove(0);
        System.out.println(friends.toString());

    }
}
