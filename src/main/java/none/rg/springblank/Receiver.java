package none.rg.springblank;

import org.springframework.stereotype.Component;

@Component("receiver")
public class Receiver {

    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }

}
