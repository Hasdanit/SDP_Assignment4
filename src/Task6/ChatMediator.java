package src.Task6;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);

}