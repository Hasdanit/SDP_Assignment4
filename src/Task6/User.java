package src.Task6;

abstract class User {

    protected ChatMediator chatMediator;

    protected String name;

    User(String name){

        this.name=name;

    }

    abstract void send(String message);

    abstract void receive(String message);

    String getName(){ return name; }

    void setChatMediator(ChatMediator chatMediator){ this.chatMediator=chatMediator; }

}
