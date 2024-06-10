import javax.swing.*;// swing library is used for building GUI applications
import java.awt.event.*;//awt.event library is used for handling user interactions with GUI components

//the public class named Main inherits the JFrame class. This JFrame class is the foundation of most windows in the swing application
public class Main extends JFrame
//helps in setting up of basic structure of the GUI application
    {
    JLabel l1, l2, l3, l4;//created labels for creating text
    JComboBox tc1, tc2;//used for making dropdown boxes
    JTextField t1, t2;// these are the text field used for user input and output
    JButton b, dot, ac, bs, pm;//performing actions like conversion (b), entering decimal point (dot), clearing (ac), backspace (bs), sign change (pm)
    JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;//these are the buttons which are from 0-9
        // These declarations define the visual elements that will be displayed on the screen.

    public Main(String s) {
        super(s);//It takes a string argument s and calls the superclass constructor (super(s)) to set the title of the application window to the value of s.
    }

    public void setComp() {//used to set up the components of the GUI.
        String arr1[] = { "Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reaumur" };//arr1[] and arr2[]contains different temperature units for the dropdown box
        String arr2[] = { "Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reaumur" };
        l1 = new JLabel("To");//label containing 'To'
        l2 = new JLabel("Enter the Value:");//label containing 'Enter The Value'
        l3 = new JLabel("Converted Value:");
        l4 = new JLabel("From");
        tc1 = new JComboBox(arr1);//now the dropdown contains arr1 elements
        tc2 = new JComboBox(arr2);// contains arr2 elements
        t1 = new JTextField();//textbox
        t2 = new JTextField();
        b = new JButton("Convert");
        dot = new JButton(".");
        pm = new JButton("±");
        bs = new JButton("<--");
        ac = new JButton("AC");
        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        setLayout(null);//setLayout(null) gives you complete control over component positioning but can be difficult to manage for complex layouts.
        //Consider using layout managers or explore advanced options like GridBagLayout for more robust and adaptable UI design.
        //In Java Swing, setLayout(null) sets the layout manager for a container (like a window or panel) to be null.
        // This means that you, the programmer, are responsible for manually positioning and sizing all the child components within the container using methods like setBounds.
        tc1.setBounds(75, 50, 100, 20);//This sets the dropdown menu tc1 (likely for selecting the temperature unit to convert from) at an x-coordinate of 75 pixels, a y-coordinate of 50 pixels, with a width of 100 pixels and a height of 20 pixels.
        t1.setBounds(200, 50, 100, 20);//..........
        l1.setBounds(100, 75, 50, 20);//...........
        l4.setBounds(90, 25, 50, 20);
        l2.setBounds(200, 35, 100, 20);
        l3.setBounds(200, 85, 100, 20);
        tc2.setBounds(75, 100, 100, 20);
        t2.setBounds(200, 100, 100, 20);
        b.setBounds(138, 150, 100, 20);
        ac.setBounds(238, 200, 50, 100);
        pm.setBounds(238, 350, 50, 50);
        bs.setBounds(238, 300, 50, 50);
        dot.setBounds(188, 350, 50, 50);
        n0.setBounds(88, 350, 100, 50);
        n1.setBounds(88, 200, 50, 50);
        n2.setBounds(138, 200, 50, 50);
        n3.setBounds(188, 200, 50, 50);
        n4.setBounds(88, 250, 50, 50);
        n5.setBounds(138, 250, 50, 50);
        n6.setBounds(188, 250, 50, 50);
        n7.setBounds(88, 300, 50, 50);
        n8.setBounds(138, 300, 50, 50);
        n9.setBounds(188, 300, 50, 50);//.........
        //These lines focus on adding functionality to the buttons and arranging the components on the window.
        b.addActionListener(new Handler());
        ac.addActionListener(new Handler());
        pm.addActionListener(new Handler());
        bs.addActionListener(new Handler());//addActionListener is a method inherited from the JButton class.
        dot.addActionListener(new Handler());//In Java Swing, the ActionListener interface is a core concept for handling user interactions with buttons and other GUI components
        n0.addActionListener(new Handler());//The addActionListener method essentially creates a link between a button and an object that can handle the button's click events.
        n1.addActionListener(new Handler());//Since Handler implements ActionListener, it's guaranteed to have the required actionPerformed method.
        n2.addActionListener(new Handler());//The Handler class is likely designed to handle button click events for the various buttons in the temperature converter application.
                                            //Since each button calls addActionListener(new Handler()),
                                            // a new instance of the Handler class is created and associated with each button.
        n3.addActionListener(new Handler());
        n4.addActionListener(new Handler());
        n5.addActionListener(new Handler());
        n6.addActionListener(new Handler());
        n7.addActionListener(new Handler());
        n8.addActionListener(new Handler());
        n9.addActionListener(new Handler());
        //-----------------------------------
        add(tc1);
        add(tc2);//Each line uses the add method of the JFrame class
        add(l1);//By calling add on these components, you're essentially adding them to the window's content pane
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b);
        add(ac);
        add(dot);
        add(pm);
        add(bs);
        add(n0);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);
        t2.setEditable(false);
    }

    class Handler implements ActionListener {//This declares the Handler class that implements the ActionListener interface.
       // The actionPerformed method is called whenever a button with an associated Handler object is clicked.
        //The ActionEvent argument (e) provides information about the event, including the source of the event (the button that was clicked).
        public void actionPerformed(ActionEvent e) {
            String x, y;
            x = (String) tc1.getSelectedItem();
            y = (String) tc2.getSelectedItem();

            if (e.getSource() == n0)
                t1.setText(t1.getText() + "0");
            if (e.getSource() == n1)
                t1.setText(t1.getText() + "1");
            if (e.getSource() == n2)
                t1.setText(t1.getText() + "2");
            if (e.getSource() == n3)
                t1.setText(t1.getText() + "3");
            if (e.getSource() == n4)
                t1.setText(t1.getText() + "4");
            if (e.getSource() == n5)
                t1.setText(t1.getText() + "5");
            if (e.getSource() == n6)
                t1.setText(t1.getText() + "6");
            if (e.getSource() == n7)
                t1.setText(t1.getText() + "7");
            if (e.getSource() == n8)
                t1.setText(t1.getText() + "8");
            if (e.getSource() == n9)
                t1.setText(t1.getText() + "9");
            if (e.getSource() == dot)
                t1.setText(t1.getText() + ".");
            if (e.getSource() == ac) {
                t1.setText("");
                t2.setText("");
            }
            if (e.getSource() == pm) {
                String spm = new String();
                spm = t1.getText();
                if (spm.length() == 0)
                    t1.setText("-");
                else if (spm.charAt(0) != '-')
                    t1.setText("-" + t1.getText());
                else
                    t1.setText("" + spm.substring(1));
            }
            if (e.getSource() == bs) {
                int n;
                String bsp = new String();
                bsp = t1.getText();
                n = bsp.length();
                t1.setText("" + bsp.substring(0, n - 1));
            }
            if (e.getSource() == b) {
                // Both are same.......................
                if (x == "Celsius" && y == "Celsius") {
                    t2.setText("" + t1.getText());
                } else if (x == "Fahrenheit" && y == "Fahrenheit") {
                    t2.setText("" + t1.getText());
                } else if (x == "Kelvin" && y == "Kelvin") {
                    t2.setText("" + t1.getText());
                } else if (x == "Rankine" && y == "Rankine") {
                    t2.setText("" + t1.getText());
                } else if (x == "Reaumur" && y == "Reaumur") {
                    t2.setText("" + t1.getText());
                }

                // Celsius to others.........................
                else if (x == "Celsius" && y == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a * 9 / 5) + 32);
                    t2.setText("" + b);
                } else if (x == "Celsius" && y == "Kelvin") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);//float.parseFloat(String s) is a method in Java that's used to convert a string representation of a floating-point number to a float primitive data type.
                    float b = (float) (a + 273.15);
                    t2.setText("" + b);
                } else if (x == "Celsius" && y == "Rankine") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 9 / 5 + 32 + 459.67);
                    t2.setText("" + b);
                } else if (x == "Celsius" && y == "Reaumur") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 0.8);
                    t2.setText("" + b);
                }

                // Fahrenheit to others......................
                else if (x == "Fahrenheit" && y == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9);
                    t2.setText("" + b);
                } else if (x == "Fahrenheit" && y == "Kelvin") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9 + 273.15);
                    t2.setText("" + b);
                } else if (x == "Fahrenheit" && y == "Rankine") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a + 459.67);
                    t2.setText("" + b);
                } else if (x == "Fahrenheit" && y == "Reaumur") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) / 2.25);
                    t2.setText("" + b);
                }

                // Kelvin to others.........................
                else if (x == "Kelvin" && y == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a - 273.15);
                    t2.setText("" + b);
                } else if (x == "Kelvin" && y == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 273.15) * 9 / 5 + 32);
                    t2.setText("" + b);
                } else if (x == "Kelvin" && y == "Rankine") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 9 / 5);
                    t2.setText("" + b);
                } else if (x == "Kelvin" && y == "Reaumur") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 273.15) * 0.8);
                    t2.setText("" + b);
                }

                // Rankine to others............................
                else if (x == "Rankine" && y == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32 - 459.67) / 1.8);
                    t2.setText("" + b);
                } else if (x == "Rankine" && y == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a - 459.67);
                    t2.setText("" + b);
                } else if (x == "Rankine" && y == "Kelvin") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a / 1.8);
                    t2.setText("" + b);
                } else if (x == "Rankine" && y == "Reaumur") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32 - 459.67) / 2.25);
                    t2.setText("" + b);
                }

                // Reaumur to others........................
                else if (x == "Reaumur" && y == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 1.25);
                    t2.setText("" + b);
                } else if (x == "Reaumur" && y == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 2.25 + 32);
                    t2.setText("" + b);
                } else if (x == "Reaumur" && y == "Kelvin") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a * 1.25 + 273.15);
                    t2.setText("" + b);
                } else if (x == "Reaumur" && y == "Rankine") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float)(a * 2.25 + 32 + 459.67);
                    t2.setText("" + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main jf = new Main("Temperature Converter");
        jf.setComp();
        jf.setSize(400, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
