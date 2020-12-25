package Circle;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Circle extends JPanel implements Drawable, MusicPlayable {

    private final JLabel background;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private Clip clip;
    private long count = 0;

    public Circle(JLabel background) {
        this.background = background;
    }

    @Override
    public void draw() {
        button1 = new JButton("▶");
        button1.setBounds(50, 100, 50, 30);
        button1.setFocusPainted(false);
        button1.setBackground(Color.GRAY);
        button1.setBorder(null);
        button1.setForeground(Color.WHITE);
        background.add(button1);

        JTextField text1 = new JTextField("In My Mind");
        text1.setEditable(false);
        text1.setBounds(110, 100, 150, 30);
        text1.setFont(new Font("Ink Free", Font.BOLD, 25));
        text1.setBorder(null);
        text1.setBackground(Color.BLACK);
        text1.setForeground(Color.WHITE);
        background.add(text1);

        button1.addActionListener(e -> {
            if (e.getSource() == button1) {
                count++;
                if (count % 2 != 0) {
                    button1.setText("||");
                    playMusic("./src/Music/Dynoro.wav");
                    disableButton(button1);
                } else {
                    button1.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button2 = new JButton("▶");
        button2.setBounds(50, 140, 50, 30);
        button2.setFocusPainted(false);
        button2.setBackground(Color.GRAY);
        button2.setBorder(null);
        button2.setForeground(Color.WHITE);
        background.add(button2);

        JTextField text2 = new JTextField("Thank You");
        text2.setEditable(false);
        text2.setBounds(110, 140, 150, 30);
        text2.setFont(new Font("Ink Free", Font.BOLD, 25));
        text2.setBorder(null);
        text2.setBackground(Color.BLACK);
        text2.setForeground(Color.WHITE);
        background.add(text2);

        button2.addActionListener(e -> {
            if (e.getSource() == button2) {
                count++;
                if (count % 2 != 0) {
                    button2.setText("||");
                    playMusic("./src/Music/ThankYou.wav");
                    disableButton(button2);
                } else {
                    button2.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button3 = new JButton("▶");
        button3.setBounds(50, 180, 50, 30);
        button3.setFocusPainted(false);
        button3.setBackground(Color.GRAY);
        button3.setBorder(null);
        button3.setForeground(Color.WHITE);
        background.add(button3);

        JTextField text3 = new JTextField("I think I'm Fallin' For Ya");
        text3.setEditable(false);
        text3.setBounds(110, 180, 300, 30);
        text3.setFont(new Font("Ink Free", Font.BOLD, 25));
        text3.setBorder(null);
        text3.setBackground(Color.BLACK);
        text3.setForeground(Color.WHITE);
        background.add(text3);

        button3.addActionListener(e -> {
            if (e.getSource() == button3) {
                count++;
                if (count % 2 != 0) {
                    button3.setText("||");
                    playMusic("./src/Music/MirrorMasa.wav");
                    disableButton(button3);
                } else {
                    button3.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button4 = new JButton("▶");
        button4.setBounds(50, 220, 50, 30);
        button4.setFocusPainted(false);
        button4.setBackground(Color.GRAY);
        button4.setBorder(null);
        button4.setForeground(Color.WHITE);
        background.add(button4);

        JTextField text4 = new JTextField("Prayer in C");
        text4.setEditable(false);
        text4.setBounds(110, 220, 150, 30);
        text4.setFont(new Font("Ink Free", Font.BOLD, 25));
        text4.setBorder(null);
        text4.setBackground(Color.BLACK);
        text4.setForeground(Color.WHITE);
        background.add(text4);

        button4.addActionListener(e -> {
            if (e.getSource() == button4) {
                count++;
                if (count % 2 != 0) {
                    button4.setText("||");
                    playMusic("./src/Music/PrayerInC.wav");
                    disableButton(button4);
                } else {
                    button4.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button5 = new JButton("▶");
        button5.setBounds(50, 260, 50, 30);
        button5.setFocusPainted(false);
        button5.setBackground(Color.GRAY);
        button5.setBorder(null);
        button5.setForeground(Color.WHITE);
        background.add(button5);

        JTextField text5 = new JTextField("Safe And Sound");
        text5.setEditable(false);
        text5.setBounds(110, 260, 180, 30);
        text5.setFont(new Font("Ink Free", Font.BOLD, 25));
        text5.setBorder(null);
        text5.setBackground(Color.BLACK);
        text5.setForeground(Color.WHITE);
        background.add(text5);

        button5.addActionListener(e -> {
            if (e.getSource() == button5) {
                count++;
                if (count % 2 != 0) {
                    button5.setText("||");
                    playMusic("./src/Music/SafeAndSound.wav");
                    disableButton(button5);
                } else {
                    button5.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button6 = new JButton("▶");
        button6.setBounds(50, 300, 50, 30);
        button6.setFocusPainted(false);
        button6.setBackground(Color.GRAY);
        button6.setBorder(null);
        button6.setForeground(Color.WHITE);
        background.add(button6);

        JTextField text6 = new JTextField("Goodbye To A World");
        text6.setEditable(false);
        text6.setBounds(110, 300, 240, 30);
        text6.setFont(new Font("Ink Free", Font.BOLD, 25));
        text6.setBorder(null);
        text6.setBackground(Color.BLACK);
        text6.setForeground(Color.WHITE);
        background.add(text6);

        button6.addActionListener(e -> {
            if (e.getSource() == button6) {
                count++;
                if (count % 2 != 0) {
                    button6.setText("||");
                    playMusic("./src/Music/GoodbyeToAWorld.wav");
                    disableButton(button6);
                } else {
                    button6.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button7 = new JButton("▶");
        button7.setBounds(50, 340, 50, 30);
        button7.setFocusPainted(false);
        button7.setBackground(Color.GRAY);
        button7.setBorder(null);
        button7.setForeground(Color.WHITE);
        background.add(button7);

        JTextField text7 = new JTextField("I'll Keep You Safe");
        text7.setEditable(false);
        text7.setBounds(110, 340, 225, 30);
        text7.setFont(new Font("Ink Free", Font.BOLD, 25));
        text7.setBorder(null);
        text7.setBackground(Color.BLACK);
        text7.setForeground(Color.WHITE);
        background.add(text7);

        button7.addActionListener(e -> {
            if (e.getSource() == button7) {
                count++;
                if (count % 2 != 0) {
                    button7.setText("||");
                    playMusic("./src/Music/I'll KeepYouSafe.wav");
                    disableButton(button7);
                } else {
                    button7.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });

        button8 = new JButton("▶");
        button8.setBounds(50, 380, 50, 30);
        button8.setFocusPainted(false);
        button8.setBackground(Color.GRAY);
        button8.setBorder(null);
        button8.setForeground(Color.WHITE);
        background.add(button8);

        JTextField text8 = new JTextField("Losing Interest");
        text8.setEditable(false);
        text8.setBounds(110, 380, 190, 30);
        text8.setFont(new Font("Ink Free", Font.BOLD, 25));
        text8.setBorder(null);
        text8.setBackground(Color.BLACK);
        text8.setForeground(Color.WHITE);
        background.add(text8);

        button8.addActionListener(e -> {
            if (e.getSource() == button8) {
                count++;
                if (count % 2 != 0) {
                    button8.setText("||");
                    playMusic("./src/Music/LosingInterest.wav");
                    disableButton(button8);
                } else {
                    button8.setText("▶");
                    clip.stop();
                    enableButton();
                }
            }
        });
    }


    public void disableButton(JButton button) {
        JButton[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8};

        for (JButton jButton : buttons) {
            if (jButton != button)
                jButton.setEnabled(false);
        }
    }

    public void enableButton() {
        JButton[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8};

        for (JButton button : buttons) {
            button.setEnabled(true);
        }
    }

    @Override
    public void playMusic(String path) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(path)));
            this.clip = clip;
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
