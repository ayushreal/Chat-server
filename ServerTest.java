import javax.swing.JFrame;

public class ServerTest {
   public static void main(String[] args) {
      Server benipal = new Server();
      benipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      benipal.startRunning();
   }
}
