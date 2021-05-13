// example of gui, calculator app
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

public class Calculator extends JFrame {
    JMenuBar myMenuBar = new JMenuBar();
    JMenu myMenu = new JMenu("Menu");
    JMenuItem addition, subtraction, divide, multiply, clear;
    private JTextField outputField;
    private ArrayList<JButton> digits;
    private JButton plusSign;
    private JButton minusSign;
    private JButton multSign;
    private JButton divSign;
    private JButton eqSign;
    private String currentOperation;
    private Double firstOperand;

    public Calculator() {
        this.currentOperation = "";
        this.firstOperand = 0.0;

        JPanel displayPanel = new JPanel(new FlowLayout());
        outputField = new JTextField("0", 20);
        displayPanel.add(outputField);

        JPanel JButtonPanel = new JPanel(new GridLayout(1, 2));

        JPanel digitJButtonPanel = new JPanel(new GridLayout(4, 3));
        digits = new ArrayList<JButton>();
        digits.add(new JButton("0"));
        digits.add(new JButton("1"));
        digits.add(new JButton("2"));
        digits.add(new JButton("3"));
        digits.add(new JButton("4"));
        digits.add(new JButton("5"));
        digits.add(new JButton("6"));
        digits.add(new JButton("7"));
        digits.add(new JButton("8"));
        digits.add(new JButton("9"));
        digits.add(new JButton("."));
        digits.add(new JButton("AC"));

        digits.get(10).setForeground(Color.MAGENTA);
        digits.get(11).setForeground(Color.MAGENTA);

        digitJButtonPanel.add(digits.get(0));
        digitJButtonPanel.add(digits.get(1));
        digitJButtonPanel.add(digits.get(2));
        digitJButtonPanel.add(digits.get(3));
        digitJButtonPanel.add(digits.get(4));
        digitJButtonPanel.add(digits.get(5));
        digitJButtonPanel.add(digits.get(6));
        digitJButtonPanel.add(digits.get(7));
        digitJButtonPanel.add(digits.get(8));
        digitJButtonPanel.add(digits.get(9));
        digitJButtonPanel.add(digits.get(10));
        digitJButtonPanel.add(digits.get(11));
        JButtonPanel.add(digitJButtonPanel);

        JPanel operatorJButtonPanel = new JPanel(new GridLayout(5, 1));
        
        String plusLocation = System.getProperty("user.dir") + "/src/plus.png";
        ImageIcon plus = new ImageIcon(plusLocation);
        plusSign = new JButton(plus);
        
        String minusLocation = System.getProperty("user.dir") + "/src/minus.png";
        ImageIcon minus = new ImageIcon(minusLocation);
        minusSign = new JButton(minus);
        
        String timesLocation = System.getProperty("user.dir") + "/src/times.png";
        ImageIcon times = new ImageIcon(timesLocation);
        multSign = new JButton(times);
        
        String divisionLocation = System.getProperty("user.dir") + "/src/division.png";
        ImageIcon division = new ImageIcon(divisionLocation);
        divSign = new JButton(division);
        
        String equalsLocation = System.getProperty("user.dir") + "/src/equals.png";
        ImageIcon equals = new ImageIcon(equalsLocation);
        eqSign = new JButton(equals);

        //
        
        plusSign.setForeground(Color.BLUE);
        minusSign.setForeground(Color.BLUE);
        multSign.setForeground(Color.BLUE);
        divSign.setForeground(Color.BLUE);
        eqSign.setForeground(Color.GREEN);

        operatorJButtonPanel.add(plusSign);
        operatorJButtonPanel.add(minusSign);
        operatorJButtonPanel.add(multSign);
        operatorJButtonPanel.add(divSign);
        operatorJButtonPanel.add(eqSign);
        JButtonPanel.add(operatorJButtonPanel);
        
        OperatorMenuListener menuStuff = new OperatorMenuListener();
        addition = new JMenuItem("Add");
        subtraction = new JMenuItem("Subtract");
        divide = new JMenuItem("Divide");
        multiply = new JMenuItem("Multiply");
        clear = new JMenuItem("Clear");
        myMenu.add(addition);
        myMenu.add(subtraction);
        myMenu.add(divide);
        myMenu.add(multiply);
        myMenu.add(clear);
        
        addition.addActionListener(menuStuff);
        subtraction.addActionListener(menuStuff);
        divide.addActionListener(menuStuff);
        multiply.addActionListener(menuStuff);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resetValues();
            }});
        
        myMenuBar.add(myMenu);
        displayPanel.add(myMenuBar);
        
        displayPanel.add(JButtonPanel);
        add(displayPanel);
        
        digits.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //currentOperation = "";
                //firstOperand = 0.0;
                //outputField.setText("0");
                resetValues();
            }
        });

        digits.get(10).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = outputField.getText();
                if(currentText.indexOf(".") < 0){
                    outputField.setText(currentText+".");
                }
            }
        });

        OperatorListener opListener = new OperatorListener();
        plusSign.addActionListener(opListener);
        minusSign.addActionListener(opListener);
        multSign.addActionListener(opListener);
        divSign.addActionListener(opListener);

        for(int i = 0; i <= 9; i ++){
            digits.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String currentText = outputField.getText();
                    JButton source = (JButton)event.getSource();
                    String newDigit = "";
                    if (source == digits.get(0)) {
                        newDigit = "0";
                    } else if (source == digits.get(1)) {
                        newDigit = "1";
                    } else if (source == digits.get(2)) {
                        newDigit = "2";
                    } else if (source == digits.get(3)) {
                        newDigit = "3";
                    } else if (source == digits.get(4)) {
                        newDigit = "4";
                    } else if (source == digits.get(5)) {
                        newDigit = "5";
                    } else if (source == digits.get(6)) {
                        newDigit = "6";
                    } else if (source == digits.get(7)) {
                        newDigit = "7";
                    } else if (source == digits.get(8)) {
                        newDigit = "8";
                    } else if (source == digits.get(9)) {
                        newDigit = "9";
                    }

                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        eqSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try{
                    Double secondOperand = new Double(currentText);

                    if(currentOperation == "+"){
                        result = firstOperand + secondOperand;
                    } else if(currentOperation == "-"){
                        result = firstOperand - secondOperand;
                    } else if(currentOperation == "*"){
                        result = firstOperand * secondOperand;
                    } else if(currentOperation == "/"){
                        if(secondOperand != 0.0){
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setBackground(Color.PINK);
                        }
                    }

                    outputField.setText(result.toString());
                    firstOperand = result;
                } catch(NumberFormatException e){
                    resetValues();
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        setTitle("Calculator");
        setSize(500, 200);
        setVisible(true);
    }

    private void resetValues(){
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
        outputField.setBackground(Color.WHITE);
    }


    private class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton)event.getSource();
            if (source == plusSign) {
                currentOperation = "+";
            }else if (source == minusSign) {
                currentOperation = "-";
            }else if (source == multSign) {
                currentOperation = "*";
            }else if (source == divSign) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try{
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch(NumberFormatException e){
                resetValues();              
            }
        }
    }
    
    private class OperatorMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JMenuItem source = (JMenuItem)event.getSource();
            if (source == addition) {
                currentOperation = "+";
            }else if (source == subtraction) {
                currentOperation = "-";
            }else if (source == multiply) {
                currentOperation = "*";
            }else if (source == divide) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try{
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch(NumberFormatException e){
                resetValues();              
            }
        }
    }
    

    public static void main(String[]args) {
        new Calculator();
        System.out.println(System.getProperty("user.dir"));
    }
}
