import javax.swing.JFrame;
import tabs.MainTabbedPane;

public class MainFrame {

    public JFrame createJFrame() {

        JFrame frame = new JFrame("Tabbed Application");

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        MainTabbedPane tabs = new MainTabbedPane();
        frame.add(tabs.getTabbedPane());

        return frame;
    }
}