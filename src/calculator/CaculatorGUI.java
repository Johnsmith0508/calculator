package calculator;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CaculatorGUI extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	static String calcType;
	static float inputCount = 0;
	static float tmpInput = 0;
	Label textOne = new Label("Type the Two numbers that you want to add");
	static Label outputField = new Label("Output goes here");
	static TextField entryOne = new TextField("Type Number one here");
	//TextField entryTwo = new TextField("Type Number two here");
	Button cancelButton = new Button("Exit");
	static Label lastInput = new Label("");
	Button multiply = new Button("X");
	Button divide = new Button("/");
	Button addition = new Button("+");
	Button subtract = new Button("-");
	Button equals = new Button("=");

	public void init() {
		setForeground(Color.DARK_GRAY);
		setBackground(Color.orange);
		add(textOne);
		add(lastInput);
		add(entryOne);
		//add(entryTwo);
		add(multiply);
		add(divide);
		add(addition);
		add(subtract);
		add(equals);
		add(cancelButton);
		addition.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				inputCount = inputCount + 1;
				calcType = "+";
				if (inputCount == 1){
					lastInput.setText(entryOne.getText() + "+");
					String TempInput = (entryOne.getText());
					entryOne.setText("");
					tmpInput = Float.parseFloat(TempInput);
				}
				
				if (inputCount == 2)
				{
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) + tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
			}
		});
		
		subtract.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				inputCount = inputCount + 1;
				calcType = "-";
				if (inputCount == 1){
					lastInput.setText(entryOne.getText() + "-");
					String TempInput = (entryOne.getText());
					entryOne.setText("");
					tmpInput = Float.parseFloat(TempInput);
				}
				
				if (inputCount == 2)
				{
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) - tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
			}
		});
		
		multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				inputCount = inputCount + 1;
				calcType = "*";
				if (inputCount == 1){
					lastInput.setText(entryOne.getText() + "X");
					String TempInput = (entryOne.getText());
					entryOne.setText("");
					tmpInput = Float.parseFloat(TempInput);
				}
				
				if (inputCount == 2)
				{
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) * tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
			}

		});
		
		divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				inputCount = inputCount + 1;
				calcType = "/";
				if (inputCount == 1){
					lastInput.setText(entryOne.getText() + "/");
					String TempInput = (entryOne.getText());
					entryOne.setText("");
					tmpInput = Float.parseFloat(TempInput);
				}
				
				if (inputCount == 2)
				{
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) / tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
			}
		});
		equals.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				if (calcType.equals("+")){
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) + tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
				if (calcType.equals("-")){
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) - tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
				if (calcType.equals("*")){
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) * tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
				if (calcType.equals("/")){
					inputCount = 0;
					String TempInput = entryOne.getText();
					float outPut = (Float.parseFloat(TempInput) / tmpInput);
					outputField.setText(String.valueOf(outPut));
					System.out.println(TempInput);
				}
			}
		});

		
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		add(outputField);

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
