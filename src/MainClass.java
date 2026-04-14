import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            MainFrame mainFrame = new MainFrame();
            mainFrame.createJFrame().setVisible(true);

        });
    }
}
