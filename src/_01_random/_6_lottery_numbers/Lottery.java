package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	Random lot=new Random();
	String ltry="Your Numbers Are ";
	for (int i = 0; i < 6; i++) {
		int num=lot.nextInt(60) +1;
		ltry=ltry+num+" ";
	}
	System.out.println(ltry);
	JOptionPane.showMessageDialog(null,ltry,"Eclipse Lottery",JOptionPane.WARNING_MESSAGE);
}
}
