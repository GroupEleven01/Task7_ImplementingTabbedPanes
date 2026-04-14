package tabs;

import javax.swing.*;

public class MainTabbedPane {

    private JTabbedPane tabbedPane;

    public MainTabbedPane() {

        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Home", createHomePanel());
        tabbedPane.addTab("Students", createStudentsPanel());
        tabbedPane.addTab("Courses", createCoursesPanel());
        tabbedPane.addTab("Help", createHelpPanel());
        tabbedPane.addTab("About", createAboutPanel());
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    private JPanel createHomePanel() {

        JPanel panel = new JPanel(new java.awt.BorderLayout());

        JLabel label = new JLabel("WELCOME TO HOME TAB APPLICATION");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(label, java.awt.BorderLayout.CENTER);

        return panel;
    }

    private JPanel createStudentsPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Student Registration");
        title.setBounds(250, 30, 200, 30);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(200, 80, 100, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(270, 80, 150, 25);

        JLabel regLabel = new JLabel("Reg Number:");
        regLabel.setBounds(200, 120, 100, 25);

        JTextField regField = new JTextField();
        regField.setBounds(270, 120, 150, 25);

        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(270, 170, 100, 30);

        panel.add(title);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(regLabel);
        panel.add(regField);
        panel.add(saveBtn);

        return panel;
    }

    private JPanel createCoursesPanel() {

        JPanel panel = new JPanel(new java.awt.BorderLayout());

        String[] courses = {
                "Software Engineering",
                "Database Systems",
                "Web Development",
                "Data Structures",
                "Operating Systems"
        };

        JList<String> list = new JList<>(courses);

        panel.add(new JLabel("Available Courses", SwingConstants.CENTER), java.awt.BorderLayout.NORTH);
        panel.add(list, java.awt.BorderLayout.CENTER);

        return panel;
    }

    private JPanel createHelpPanel() {

        JPanel panel = new JPanel(new java.awt.BorderLayout());

        JLabel label = new JLabel("HELP & INSTRUCTIONS");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(label, java.awt.BorderLayout.CENTER);

        return panel;
    }

    private JPanel createAboutPanel() {

        JPanel panel = new JPanel(new java.awt.BorderLayout());

        JLabel label = new JLabel("ABOUT THIS APPLICATION");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(label, java.awt.BorderLayout.CENTER);

        return panel;
    }
}