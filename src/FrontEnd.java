import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
public class FrontEnd {
	private BackEnd myBackEnd;
	
	public FrontEnd()
	{
		myBackEnd = new BackEnd();
		final JFrame frame = new JFrame("User Messages");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(600, 400));
		frame.setLocation(400, 200);
		Box vBox = Box.createVerticalBox();
		frame.add(vBox);
		Box titleBox = Box.createHorizontalBox();
		Box subtitleBox = Box.createHorizontalBox();
		Box addmessuserBox = Box.createHorizontalBox();
		Box addmessBox = Box.createHorizontalBox();
		Box okBox = Box.createHorizontalBox();
		Box lineBox = Box.createHorizontalBox();
		Box subtitle2Box = Box.createHorizontalBox();
		Box finduserBox = Box.createHorizontalBox();
		Box outputBox = Box.createHorizontalBox();
		
		
		vBox.add(titleBox);
		vBox.add(subtitleBox);
		vBox.add(addmessuserBox);
		vBox.add(addmessBox);
		vBox.add(okBox);
		vBox.add(lineBox);
		vBox.add(subtitle2Box);
		vBox.add(finduserBox);
		vBox.add(outputBox);
		frame.getContentPane().setBackground(Color.BLACK);
		//titleBox
		JLabel leftStar = new JLabel();
		JLabel title = new JLabel("Messaging");
		JLabel rightStar = new JLabel();
		
		title.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		title.setForeground(Color.WHITE);
		Icon star = new ImageIcon("electricity.gif");
		leftStar.setIcon(star);
		rightStar.setIcon(star);
		leftStar.setPreferredSize(new Dimension(175, 75));
		leftStar.setMaximumSize(new Dimension(175,75));
		leftStar.setMinimumSize(new Dimension(175,75));
		rightStar.setPreferredSize(new Dimension(175, 75));
		rightStar.setMaximumSize(new Dimension(175,75));
		rightStar.setMinimumSize(new Dimension(175,75));
		titleBox.add(leftStar);
		titleBox.add(title);
		titleBox.add(rightStar);
		
		//subtitleBox
		JLabel subtitle = new JLabel("Add Message");
		subtitle.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		subtitle.setForeground(Color.WHITE);
		subtitleBox.add(subtitle);
		
		//addmessuserBox
		JLabel user = new JLabel("User:");
		user.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
		user.setForeground(Color.WHITE);
		String[] users = new String[0];
		users = myBackEnd.getUsers().toArray(users);
		JComboBox<String> comboBox = new JComboBox<String>(users);
		addmessuserBox.add(Box.createHorizontalStrut(100));
		addmessuserBox.add(user);
		addmessuserBox.add(comboBox);
		addmessuserBox.add(Box.createHorizontalStrut(100));
		//addmessBox
		JLabel message = new JLabel("Message:");
		message.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		message.setForeground(Color.WHITE);
		JTextField messagefield = new JTextField();
		addmessBox.add(Box.createHorizontalStrut(81));
		addmessBox.add(message);
		addmessBox.add(messagefield);
		addmessBox.add(Box.createHorizontalStrut(100));
		//okBox
		JButton ok = new JButton("OK");
		okBox.add(ok);
		
		//lineBox
		JPanel line = new JPanel();
		line.setBackground(Color.WHITE);
		line.setMaximumSize(new Dimension(600, 5));

		lineBox.add(line);
		
		//subtitle2Box
		JLabel subtitle2 = new JLabel("Get Message");
		subtitle2.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		subtitle2.setForeground(Color.WHITE);
		subtitle2Box.add(subtitle2);
		
		//finduserBox
		JLabel user2 = new JLabel("User:");
		user2.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
		user2.setForeground(Color.WHITE);
		users = myBackEnd.getUsers().toArray(users);
		JComboBox<String> comboBox2 = new JComboBox<String>(users);
		JButton ok2 = new JButton("OK");
		finduserBox.add(user2);
		finduserBox.add(comboBox2);
		finduserBox.add(ok2);
		
		//outputBox
		final JTextPane defPane = new JTextPane();
		JScrollPane defScroll = new JScrollPane(defPane);
		
		outputBox.add(Box.createHorizontalStrut(78));
		outputBox.add(defScroll);
		outputBox.add(Box.createHorizontalStrut(100));
		
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	
	
	
}
