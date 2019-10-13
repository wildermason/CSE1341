/*
Name: Wilder Mason
Date: December 1, 2017
Lab 8 - Fall 2017
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUISMUQuest extends JFrame
{
    private int roundNumber = 1;
    private JButton start;
    private JButton round;
    private JLabel p1AskName;
    private JLabel p2AskName;
    private JLabel askMoney;
    private JTextField p1Name;
    private JTextField p2Name;
    private JTextField inputMoney;
    private JTextArea output;
    private JScrollPane scrollPane;
    SMUQuest game = new SMUQuest();

    public GUISMUQuest()
    {
        super("SMU QUEST");
        setLayout(new FlowLayout());
        MyInner mi = new MyInner();

        p1AskName = new JLabel("Player 1 Name:");
        add(p1AskName);

        p1Name = new JTextField(15);
        add(p1Name);

        p2AskName = new JLabel("Player 2 Name:");
        add(p2AskName);

        p2Name = new JTextField(15);
        add(p2Name);

        askMoney = new JLabel("How much is needed to win?");
        add(askMoney);

        inputMoney = new JTextField(25);
        add(inputMoney);

        start = new JButton("Start Playing!");
        add(start);
        start.addActionListener(mi);

        round = new JButton("Play One Round");
        add(round);
        round.setEnabled(false);
        round.addActionListener(mi);

        output = new JTextArea(20,50);
        scrollPane = new JScrollPane(output);
        add(scrollPane);
        scrollPane.setEnabled(false);
    }

    private class MyInner implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == start)
            {
                if(p1Name.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter a value for Player 1", "Missing Data", JOptionPane.WARNING_MESSAGE); //error message
                }
                else if(p2Name.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter a value for Player 2", "Missing Data", JOptionPane.WARNING_MESSAGE); //error message
                }
                else if(inputMoney.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter a value for Winning Amount", "Missing Data", JOptionPane.WARNING_MESSAGE); //error message
                }
                else
                {
                    output.setText("");
                    game.addPlayer(p1Name.getText(), 0);
                    game.addPlayer(p2Name.getText(), 0);
                    game.setWinningAmount(Integer.parseInt(inputMoney.getText()));
                    start.setEnabled(false);
                    p1Name.setEnabled(false);
                    p2Name.setEnabled(false);
                    inputMoney.setEnabled(false);
                    round.setEnabled(true);
                }
            }
            if(e.getSource() == round)
            {
                scrollPane.setEnabled(true);
                String result = game.playRound();
                output.append("Round " + roundNumber + ":");
                output.append("\n");
                output.append(result);
                output.append("\n");
                roundNumber++;

                if(game.checkForWinner(0))
                {
                    output.append(p1Name.getText() + " WON!");
                    resetGame();
                }
                else if(game.checkForWinner(1))
                {
                    output.append(p2Name.getText() + " WON!");
                    resetGame();
                }
                else if(game.checkForWinner(0) && game.checkForWinner(1))
                {
                    output.append("TIE");
                    resetGame();
                }

            }
        }
        public void resetGame()
        {
            round.setEnabled(false);
            p1Name.setEnabled(true);
            p2Name.setEnabled(true);
            inputMoney.setEnabled(true);
            start.setEnabled(true);
            scrollPane.setEnabled(false);
            output.setEnabled(false);
            roundNumber = 1;
            game.removePlayers();
        }
    }

}