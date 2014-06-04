package calculator;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	Label textOne = new Label("Type the Two numbers that you want to add");
	static Label outputField = new Label("Output goes here");
	TextField entryOne = new TextField("Type Number one here");
	TextField entryTwo = new TextField("Type Number two here");
	Button cancelButton = new Button("Exit");
	Label lastInput = new Label("");
	Button multiply = new Button("X");
	Button divide = new Button("/");
	Button addition = new Button("+");
	Button subtract = new Button("-");
	
	
	
	

	public void init() {
		setForeground(Color.DARK_GRAY);
		setBackground(Color.orange);
		add(textOne);
		add(lastInput);
		add(entryOne);
		add(entryTwo);
		add(outputField);
		add(multiply);
		add(divide);
		add(addition);
		add(subtract);
		add(cancelButton);
		addition.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				float userIn1 = Float.parseFloat(entryOne.getText());
				float userIn2 = Float.parseFloat(entryTwo.getText());
				String userOut1 = String.valueOf(userIn1 + userIn2);
				outputField.setText(userOut1);
				lastInput.setText(entryOne.getText());
				
			}
		});
		
		subtract.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				float userIn1 = Float.parseFloat(entryOne.getText());
				float userIn2 = Float.parseFloat(entryTwo.getText());
				String userOut1 = String.valueOf(userIn1 - userIn2);
				outputField.setText(userOut1);
				lastInput.setText(entryOne.getText());
				
			}
		});
		
		multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				float userIn1 = Float.parseFloat(entryOne.getText());
				float userIn2 = Float.parseFloat(entryTwo.getText());
				String userOut1 = String.valueOf(userIn1 * userIn2);
				outputField.setText(userOut1);
				lastInput.setText(entryOne.getText());
				
			}
		});
		
		divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				float userIn1 = Float.parseFloat(entryOne.getText());
				float userIn2 = Float.parseFloat(entryTwo.getText());
				String userOut1 = String.valueOf(userIn1 / userIn2);
				outputField.setText(userOut1);
				lastInput.setText(entryOne.getText());
				
			}
		});

		
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void testr(String userTyped, String userTwo)
	{
		float userIn1 = Float.parseFloat(userTyped);
		float userIn2 = Float.parseFloat(userTwo);
		String userOut = String.valueOf(userIn1 + userIn2);
		outputField.setText(userOut);
		
	}


	@Override public void actionPerformed(ActionEvent e){}

}
