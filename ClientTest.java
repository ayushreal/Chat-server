import javax.swing.JFrame;

public class ClientTest {
   public static void main(String[] args) {
      Client dhillon;
      dhillon = new Client("127.0.0.1");
      dhillon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      dhillon.startRunning();
   }
}