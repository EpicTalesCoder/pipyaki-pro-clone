package wfree;

import javax.microedition.io.Connection;

public interface MessageConnection extends Connection {
   String TEXT_MESSAGE = "text";
   String BINARY_MESSAGE = "binary";
   String MULTIPART_MESSAGE = "multipart";

   Message newMessage(String var1);

   Message newMessage(String var1, String var2);

   int numberOfSegments(Message var1);

   Message receive();

   void send(Message var1);

   void setMessageListener(MessageListener var1);
}
