package src.Task6;


class Main {

    public static void main(String[] args){

        ChatMediator chatRoom=new ChatRoom();

        User user1=new RegularUser("Alice");

        User user2=new PremiumUser("Bob");

        chatRoom.addUser(user1);

        chatRoom.addUser(user2);

        user1.send("Hi Bob!");

        user2.send("Hello Alice!");

    }

}
