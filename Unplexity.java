import javax.swing.*;

public class Unplexity {
	public static void main(String args[]){

	JFrame myWindow = new JFrame("skibidi rizzler");
	myWindow.setDefaultCloseOperation(myWindow.EXIT_ON_CLOSE);
	myWindow.setSize(498,494);
	myWindow.setAlwaysOnTop(true);
	myWindow.setLocationRelativeTo(null);
	myWindow.setResizable(false);
	

	ImageIcon gif = new ImageIcon("loader.gif");
	JLabel gifHolder = new JLabel(gif);

	myWindow.add(gifHolder);
	myWindow.setVisible(true);
	}
}
