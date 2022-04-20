import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener{
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNI_SIZE = 25;
	static final int GAME_UNITS = (SCREEN_HEIGHT*SCREEN_HEIGHT)/UNI_SIZE;
	static final int DELAY = 75;
	final int[] x = new int[GAME_UNITS];
	final int[] y = new int[GAME_UNITS];
	int bodyParts = 6;
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;


	GamePanel() {
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		this.addKeyListener(new MykeyAdapter());
		startGame();

	}
	
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();

	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);

	}
	
	public void draw(Graphics g) {
		for (int i=0;i<SCREEN_HEIGHT/UNI_SIZE;i++) {
			g.drawLine(i*UNI_SIZE,0,i*UNI_SIZE,SCREEN_HEIGHT);
			g.drawLine(0,i*UNI_SIZE,SCREEN_WIDTH,i*UNI_SIZE);

		}
	}

	public void newApple() {

	}

	public void move() {
		
	}
	
	public void checkApple() {
		
	}
	
	public void checkCollisions() {
		
	}
	
	public void gameOver(Graphics g) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static class MykeyAdapter extends KeyAdapter {

		public void KeyPressed(KeyEvent e) {

		}

	}

}
