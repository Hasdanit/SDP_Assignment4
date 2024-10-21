package src.Task6;

class PremiumUser extends User {

    PremiumUser(String name){

        super(name);

    }

    @Override

    void send(String message){

        System.out.println(name+": Sending Message="+message);

        chatMediator.sendMessage(message,this);

    }

    @Override

    void receive(String message){

        System.out.println(name+": Received Message:"+message);

    }

}
