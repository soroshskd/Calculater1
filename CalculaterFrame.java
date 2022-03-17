
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CalculaterFrame extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JLabel text1 = new JLabel();
    JLabel text2 = new JLabel();
    ArrayList<String> getNumber = new ArrayList();
    ArrayList<JButton> BUTTON = new ArrayList();
    ArrayList<String> RESULT1 = new ArrayList();
    ArrayList<Float> RESULT2 = new ArrayList();
    private String showlabel = "";

    public CalculaterFrame() {
        int x = 298;
        int y = 413;
        this.setSize(x, y);
        Color colorPanel = new Color(245, 255, 250);
        colorPanel.getRGB();
        panel.setBackground(colorPanel);
        this.add(panel);
        panel.setLayout(null);
        this.setResizable(false);
        this.setTitle("ماشین حساب");
        Toolkit tool = this.getToolkit();
        Dimension screenSize = tool.getScreenSize();
        this.setLocation(screenSize.width / 2, screenSize.height / 5);

// Button Mark
        JButton buttonMark = new JButton();
        buttonMark.setText("±");
        buttonMark.setToolTipText("تغییر علامت");
        Font fontMark = new Font(null, 3, 27);
        buttonMark.setFont(fontMark);
        buttonMark.setSize(69, 33);
        buttonMark.setLocation(3, y - 66);
        Color colorMark = new Color(255, 250, 205);
        colorMark.getRGB();
        buttonMark.setBackground(colorMark);
        panel.add(buttonMark);
        BUTTON.add(buttonMark);
// Button 0
        JButton button0 = new JButton();
        button0.setText("0");
        button0.setSize(69, 33);
        button0.setLocation(75, y - 66);
        Color color0 = new Color(167, 107, 207);
        color0.getRGB();
        button0.setBackground(color0);
        panel.add(button0);
        BUTTON.add(button0);
// Button Dot
        JButton buttonDot = new JButton();
        buttonDot.setText(".");
        buttonDot.setFont(fontMark);
        buttonDot.setSize(69, 33);
        buttonDot.setLocation(147, y - 66);
        Color colorDot = new Color(255, 99, 71);
        colorDot.getRGB();
        buttonDot.setBackground(colorDot);
        panel.add(buttonDot);
        BUTTON.add(buttonDot);
// Button Equal
        JButton buttonEqual = new JButton();
        buttonEqual.setText("=");
        buttonEqual.setFont(fontMark);
        buttonEqual.setSize(69, 33);
        buttonEqual.setLocation(219, y - 66);
        Color colorEqual = new Color(128, 128, 128);
        colorEqual.getRGB();
        buttonEqual.setBackground(colorEqual);
        panel.add(buttonEqual);
        BUTTON.add(buttonEqual);
// Button 1
        JButton button1 = new JButton();
        button1.setText("1");
        button1.setSize(69, 33);
        button1.setLocation(3, y - 102);
        button1.setBackground(color0);
        panel.add(button1);
        BUTTON.add(button1);
// Button 2
        JButton button2 = new JButton();
        button2.setText("2");
        button2.setSize(69, 33);
        button2.setLocation(75, y - 102);
        button2.setBackground(color0);
        panel.add(button2);
        BUTTON.add(button2);
// Button 3
        JButton button3 = new JButton();
        button3.setText("3");
        button3.setSize(69, 33);
        button3.setLocation(147, y - 102);
        button3.setBackground(color0);
        panel.add(button3);
        BUTTON.add(button3);
// Button Plus 
        JButton buttonPlus = new JButton();
        buttonPlus.setText("+");
        buttonPlus.setFont(fontMark);
        buttonPlus.setSize(69, 33);
        buttonPlus.setLocation(219, y - 102);
        Color colorPlus = new Color(154, 205, 50);
        colorPlus.getRGB();
        buttonPlus.setBackground(colorPlus);
        panel.add(buttonPlus);
        BUTTON.add(buttonPlus);
// Button 4
        JButton button4 = new JButton();
        button4.setText("4");
        button4.setSize(69, 33);
        button4.setLocation(3, y - 138);
        button4.setBackground(color0);
        panel.add(button4);
        BUTTON.add(button4);
// Button 5
        JButton button5 = new JButton();
        button5.setText("5");
        button5.setSize(69, 33);
        button5.setLocation(75, y - 138);
        button5.setBackground(color0);
        panel.add(button5);
        BUTTON.add(button5);
// Button 6
        JButton button6 = new JButton();
        button6.setText("6");
        button6.setSize(69, 33);
        button6.setLocation(147, y - 138);
        button6.setBackground(color0);
        panel.add(button6);
        BUTTON.add(button6);
// Button Minus 
        JButton buttonMinus = new JButton();
        buttonMinus.setText("−");
        buttonMinus.setFont(fontMark);
        buttonMinus.setSize(69, 33);
        buttonMinus.setLocation(219, y - 138);
        buttonMinus.setBackground(colorPlus);
        panel.add(buttonMinus);
        BUTTON.add(buttonMinus);
// Button 7
        JButton button7 = new JButton();
        button7.setText("7");
        button7.setSize(69, 33);
        button7.setLocation(3, y - 174);
        button7.setBackground(color0);
        panel.add(button7);
        BUTTON.add(button7);
// Button 8
        JButton button8 = new JButton();
        button8.setText("8");
        button8.setSize(69, 33);
        button8.setLocation(75, y - 174);
        button8.setBackground(color0);
        panel.add(button8);
        BUTTON.add(button8);
// Button 9
        JButton button9 = new JButton();
        button9.setText("9");
        button9.setSize(69, 33);
        button9.setLocation(147, y - 174);
        button9.setBackground(color0);
        panel.add(button9);
        BUTTON.add(button9);
// Button Multi
        JButton buttonMulti = new JButton();
        buttonMulti.setText("×");
        buttonMulti.setFont(fontMark);
        buttonMulti.setSize(69, 33);
        buttonMulti.setLocation(219, y - 174);
        buttonMulti.setBackground(colorPlus);
        panel.add(buttonMulti);
        BUTTON.add(buttonMulti);
// Button CE
        JButton buttonCE = new JButton();
        buttonCE.setText("CE");
        buttonCE.setToolTipText("پاک شدن عدد وارد شده فعلی");
        Font fontCE = new Font(null, 3, 17);
        buttonCE.setFont(fontCE);
        buttonCE.setSize(69, 33);
        buttonCE.setLocation(3, y - 210);
        Color colorCE = new Color(245, 245, 245);
        colorCE.getRGB();
        buttonCE.setBackground(colorCE);
        panel.add(buttonCE);
        BUTTON.add(buttonCE);
// Button C
        JButton buttonC = new JButton();
        buttonC.setText("C");
        buttonC.setToolTipText("پاک شدن همه مقادیر");
        buttonC.setFont(fontCE);
        buttonC.setSize(69, 33);
        buttonC.setLocation(75, y - 210);
        buttonC.setBackground(colorCE);
        panel.add(buttonC);
        BUTTON.add(buttonC);
// Button Back
        JButton buttonBack = new JButton();
        buttonBack.setText("←");
        buttonBack.setToolTipText("پاک شدن رقم آخر عدد");
        buttonBack.setFont(fontMark);
        buttonBack.setSize(69, 33);
        buttonBack.setLocation(147, y - 210);
        Color colorBack = new Color(189, 183, 107);
        colorBack.getRGB();
        buttonBack.setBackground(colorBack);
        panel.add(buttonBack);
        BUTTON.add(buttonBack);
// Button Division 
        JButton buttonDivision = new JButton();
        buttonDivision.setText("÷");
        buttonDivision.setFont(fontMark);
        buttonDivision.setSize(69, 33);
        buttonDivision.setLocation(219, y - 210);
        buttonDivision.setBackground(colorPlus);
        panel.add(buttonDivision);
        BUTTON.add(buttonDivision);
// text 1
        text1.setHorizontalAlignment(JLabel.RIGHT);
        text1.setText("0");
//text1.setEditable(false);
        Font fontText1 = new Font(null, 1, 30);
        text1.setFont(fontText1);
        text1.setSize(286, 99);
        text1.setLocation(3, y - 332);
        Color colorText1 = new Color(255, 255, 255);
        colorText1.getRGB();
        text1.setBackground(colorPanel);
        panel.add(text1);
// text 2
        text2.setHorizontalAlignment(JLabel.RIGHT);
        Font fontText2 = new Font(null, 4, 13);
        text2.setFont(fontText2);
        text2.setSize(286, 33);
        text2.setLocation(3, y - 365);
        text2.setBackground(colorPanel);
        panel.add(text2);
// SoRoSh App
        JLabel label = new JLabel();
        label.setText("SoRoSh App");
        label.setHorizontalTextPosition(JLabel.CENTER);
        Font fontLabel = new Font("French Script MT", 1, 33);
        label.setFont(fontLabel);
        label.setSize(200, 56);
        label.setLocation(67, y - 420);
        Color colorText2 = new Color(129, 77, 93);
        colorText2.getRGB();
        label.setForeground(colorText2);
        panel.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        for (JButton button : BUTTON) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("0") && showlabel == "") {

        } else if (e.getActionCommand().equals(".")) {
            dot();
        } else if (e.getActionCommand().equals("C")) {
            clearC();
        } else if (e.getActionCommand().equals("CE")) {
            clearCE();
        } else if (e.getActionCommand().equals("←")) {
            back();
        } else if (e.getActionCommand().equals("±")) {
            mark();
        } else if ((e.getActionCommand().equals("+") && showlabel == "")
                || (e.getActionCommand().equals("−") && showlabel == "")
                || (e.getActionCommand().equals("×") && showlabel == "")
                || (e.getActionCommand().equals("÷") && showlabel == "")
                || (e.getActionCommand().equals("=") && showlabel == "")) {

        } else if ((e.getActionCommand().equals("+") && showlabel != "")
                || (e.getActionCommand().equals("−") && showlabel != "")
                || (e.getActionCommand().equals("×") && showlabel != "")
                || (e.getActionCommand().equals("÷") && showlabel != "")) {
            String switcher1 = null;
            String switcher2 = null;
            RESULT1.add(e.getActionCommand());
            float one = Float.parseFloat(showlabel);
            if (RESULT1.size() == 1) {
                RESULT2.add(0, one);
                String TrOne = String.valueOf(one);
                float getResult1 = one;
                int getResult2 = (int) getResult1;
                String TrResult2 = String.valueOf(getResult2);
                float getResult3 = getResult1 - getResult2;
                if (getResult3 > 0) {
                    text1.setText(TrOne);
                    text2.setText(TrOne + RESULT1.get(RESULT1.size() - 1));
                } else if (getResult3 == 0) {
                    text1.setText(TrResult2);
                    text2.setText(TrResult2 + RESULT1.get(RESULT1.size() - 1));
                }
                showlabel = "";
            } else if (RESULT1.size() == 2) {
                RESULT2.add(1, one);
                switcher1 = RESULT1.get(0);
                float two = 0;
                switch (switcher1) {
                    case "+":
                        two = RESULT2.get(0) + RESULT2.get(1);
                        break;
                    case "−":
                        two = RESULT2.get(0) - RESULT2.get(1);
                        break;
                    case "×":
                        two = RESULT2.get(0) * RESULT2.get(1);
                        break;
                    case "÷":
                        two = RESULT2.get(0) / RESULT2.get(1);
                        break;
                }
                RESULT2.set(0, two);
                String TrTwo = String.valueOf(two);
                float getResult1 = two;
                int getResult2 = (int) getResult1;
                String TrResult2 = String.valueOf(getResult2);
                float getResult3 = getResult1 - getResult2;
                if (getResult3 > 0) {
                    text1.setText(TrTwo);
                    text2.setText(TrTwo + RESULT1.get(RESULT1.size() - 1));
                } else if (getResult3 == 0) {
                    text1.setText(TrResult2);
                    text2.setText(TrResult2 + RESULT1.get(RESULT1.size() - 1));
                }
                showlabel = "";
            } else {
                RESULT2.set(1, one);
                switcher2 = RESULT1.get(RESULT1.size() - 2);
                float three = 0;
                switch (switcher2) {
                    case "+":
                        three = RESULT2.get(0) + RESULT2.get(1);
                        break;
                    case "−":
                        three = RESULT2.get(0) - RESULT2.get(1);
                        break;
                    case "×":
                        three = RESULT2.get(0) * RESULT2.get(1);
                        break;
                    case "÷":
                        three = RESULT2.get(0) / RESULT2.get(1);
                        break;
                }
                RESULT2.set(0, three);
                String TrThree = String.valueOf(three);
                text1.setText(TrThree);
                text2.setText(TrThree + RESULT1.get(RESULT1.size() - 1));
                float getResult1 = three;
                int getResult2 = (int) getResult1;
                String TrResult2 = String.valueOf(getResult2);
                float getResult3 = getResult1 - getResult2;
                if (getResult3 > 0) {
                    text1.setText(TrThree);
                    text2.setText(TrThree + RESULT1.get(RESULT1.size() - 1));
                } else if (getResult3 == 0) {
                    text1.setText(TrResult2);
                    text2.setText(TrResult2 + RESULT1.get(RESULT1.size() - 1));
                }
                showlabel = "";
            }
        } else if (e.getActionCommand().equals("=")) {
            String switcher1 = null;
            String switcher2 = null;
            RESULT1.add(e.getActionCommand());
            float one = Float.parseFloat(showlabel);
            if (RESULT1.size() == 1) {
                RESULT2.add(0, one);
                String TrOne = String.valueOf(one);
                float getResult1 = one;
                int getResult2 = (int) getResult1;
                String TrResult2 = String.valueOf(getResult2);
                float getResult3 = getResult1 - getResult2;
                if (getResult3 > 0) {
                    text1.setText(TrOne);
                    showlabel = TrOne;
                } else if (getResult3 == 0) {
                    text1.setText(TrResult2);
                    showlabel = TrResult2;
                }

            } else if (RESULT1.size() == 2) {
                RESULT2.add(1, one);
                switcher1 = RESULT1.get(0);
                float two = 0;
                switch (switcher1) {
                    case "+":
                        two = RESULT2.get(0) + RESULT2.get(1);
                        break;
                    case "−":
                        two = RESULT2.get(0) - RESULT2.get(1);
                        break;
                    case "×":
                        two = RESULT2.get(0) * RESULT2.get(1);
                        break;
                    case "÷":
                        two = RESULT2.get(0) / RESULT2.get(1);
                        break;
                }
                RESULT2.set(0, two);
                String TrTwo = String.valueOf(two);
                float getResult1 = two;
                int getResult2 = (int) getResult1;
                String TrResult2 = String.valueOf(getResult2);
                float getResult3 = getResult1 - getResult2;
                if (getResult3 > 0) {
                    text1.setText(TrTwo);
                    showlabel = TrTwo;
                } else if (getResult3 == 0) {
                    text1.setText(TrResult2);
                    showlabel = TrResult2;
                }

            } else {
                RESULT2.set(1, one);
                switcher2 = RESULT1.get(RESULT1.size() - 2);
                float three = 0;
                switch (switcher2) {
                    case "+":
                        three = RESULT2.get(0) + RESULT2.get(1);
                        break;
                    case "−":
                        three = RESULT2.get(0) - RESULT2.get(1);
                        break;
                    case "×":
                        three = RESULT2.get(0) * RESULT2.get(1);
                        break;
                    case "÷":
                        three = RESULT2.get(0) / RESULT2.get(1);
                        break;
                }
                RESULT2.set(0, three);
                String TrThree = String.valueOf(three);
                text1.setText(TrThree);
                text2.setText(TrThree + RESULT1.get(RESULT1.size() - 1));
                float getResult1 = three;
                int getResult2 = (int) getResult1;
                String TrResult2 = String.valueOf(getResult2);
                float getResult3 = getResult1 - getResult2;
                if (getResult3 > 0) {
                    text1.setText(TrThree);
                    showlabel = TrThree;
                } else if (getResult3 == 0) {
                    text1.setText(TrResult2);
                    showlabel = TrResult2;
                }

            }
            text2.setText("");
        } else {
            showlabel = showlabel + e.getActionCommand();
            text1.setText(showlabel);
        }
    }

    public void clearC() {
        showlabel = "";
        text1.setText("");
        text2.setText("");
        getNumber.clear();
        RESULT1.clear();
        RESULT2.clear();
    }

    public void clearCE() {
        showlabel = "";
        text1.setText("");
    }

    public void back() {
        showlabel = showlabel.substring(0, showlabel.length() - 1);
        text1.setText(showlabel);
    }

    public void dot() {
        ArrayList<String> getDot = new ArrayList();
        String getDot2[] = showlabel.split("");
        int sumDot = 0;
        for (int i = 0; i < getDot2.length; i++) {
            getDot.add(getDot2[i]);
        }
        for (String gD : getDot) {
            if (gD.equals(".")) {
                sumDot = sumDot + 1;
            }
        }
        if (sumDot == 0 && showlabel.isEmpty()) {
            showlabel = showlabel + "0.";
            text1.setText(showlabel);
        } else if (sumDot == 0) {
            showlabel = showlabel + ".";
            text1.setText(showlabel);
        } else {

        }
    }

    public void mark() {
        if (showlabel.startsWith("-")) {
            showlabel = showlabel.substring(1, showlabel.length());
            text1.setText(showlabel);
        } else {
            showlabel = "-" + showlabel;
            text1.setText(showlabel);
        }
    }
}
