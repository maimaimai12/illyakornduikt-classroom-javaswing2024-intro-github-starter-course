package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a new window
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit
        window.setResizable(false); // Disable resizing
        window.setTitle("2D Adventure"); // Set the window title

        // Create and add the GamePanel to the window
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); // Adjust window size to fit its components
        window.setLocationRelativeTo(null); // Center the window on the screen
        window.setVisible(true); // Make the window visible

        // Start the game thread
        gamePanel.startGameThread();
    }
}
