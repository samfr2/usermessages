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
		
		//titleBox
		JLabel leftStar = new JLabel();
		JLabel title = new JLabel("Messaging");
		JLabel rightStar = new JLabel();
		
		title.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		
		Icon star = new ImageIcon("electricity.gif");
		leftStar.setIcon(star);
		rightStar.setIcon(star);
		titleBox.add(leftStar);
		titleBox.add(title);
		titleBox.add(rightStar);
		
		//subtitleBox
		JLabel subtitle = new JLabel("Add Message");
		subtitle.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		subtitleBox.add(subtitle);
		
		//addmessuserBox
		JLabel user = new JLabel("User:");
		user.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
		
		String[] users = new String[0];
		users = myBackEnd.getUsers().toArray(users);
		JComboBox<String> comboBox = new JComboBox<String>(users);
		addmessuserBox.add(user);
		addmessuserBox.add(comboBox);
		
		//addmessBox
		JLabel message = new JLabel("Message:");
		message.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		JTextField messagefield = new JTextField();
		addmessBox.add(message);
		addmessBox.add(messagefield);
		
		//okBox
		JButton ok = new JButton("OK");
		okBox.add(ok);
		
		//lineBox
		JPanel line = new JPanel();
		line.setBackground(Color.BLACK);
		line.setMaximumSize(new Dimension(400, 5));
		
		
		lineBox.add(Box.createHorizontalStrut(100));
		lineBox.add(line);
		lineBox.add(Box.createHorizontalStrut(100));
		
		//subtitle2Box
		JLabel subtitle2 = new JLabel("Get Message");
		subtitle.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		subtitleBox.add(subtitle2);
		
		//finduserBox
		JLabel user2 = new JLabel("User:");
		user.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
		users = myBackEnd.getUsers().toArray(users);
		JComboBox<String> comboBox2 = new JComboBox<String>(users);
		JButton ok2 = new JButton("OK");
		subtitle2Box.add(user2);
		subtitle2Box.add(comboBox2);
		subtitle2Box.add(ok2);
		
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
