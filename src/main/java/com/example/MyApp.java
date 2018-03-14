package com.example;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp extends JFrame {

    final Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new MyApp();
            }
      });
    }

    public MyApp() {
        logger.trace("Loading {}.", "MyApp");
        logger.info("Loading {}.", "MyApp");
        logger.debug("Loading {}.", "MyApp");
        logger.warn("Loading {}.", "MyApp");
        logger.error("Loading {}.", "MyApp");
        logger.debug("Loading {}.", "MyApp");

        this.setTitle("MyApp");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public int add(int a, int b) {
        return a + b;
    }
}