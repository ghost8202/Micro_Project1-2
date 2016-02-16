import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;


public class PlayMusicProgressBar extends JFrame {
	JProgressBar current;
    	JTextArea out;
    	JButton find;
    	Thread runner;
    	int num = 0;
	void playMusicProgressBar(){
		setTitle("Music");
		JFrame b = new JFrame();
		FileDialog fd=new FileDialog(b,"pick a file:",FileDialog.LOAD);
		fd.setFile("*.mp3*");
		fd.setVisible(true);
		String path=fd.getDirectory();
		String file=fd.getFile();
		try {
			FileReader fr=new FileReader(path+"C:\\temp\\korra.mp3"+file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
        	p.setLayout(new FlowLayout());
        	current = new JProgressBar(0, 119000);
        	current.setValue(0);
        	current.setStringPainted(true);
        	p.add(current);
        	setContentPane(p);
	}
	public void iterate(){
		JProgressBar current;
		Thread runner;
		int num = 0;
		while(num <= 119000){
			current.setValue(num);
			try{
				Thread.sleep(595);
			}catch (InterruptedException e)
			{
		}num += 595;
	}
	}

}
