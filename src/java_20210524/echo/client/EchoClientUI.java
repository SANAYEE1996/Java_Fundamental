package java_20210524.echo.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EchoClientUI implements ActionListener{

	private String id;
	private String ip;
	private int port;
	private JFrame frame;
	private JTextArea txt;
	private JTextField field;
	private JButton btton;

	private BufferedReader br;
	private BufferedWriter wr;

	public EchoClientUI(String id, String ip, int port) {
		
		this.id = id;
		this.ip = ip;
		this.port = port;

		frame = new JFrame("Unicast Chatting");

		/////////////////////////////증앙 시작////////////////////////////////////////
		txt = new JTextArea("", 40, 80);
		txt.setEditable(false);
		JScrollPane jsp = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		txt.setBackground(new Color(255, 255, 255));
		///////////////////////////중앙 끝//////////////////////////////////////////
		///////////////////////////하단 시작//////////////////////////////////////////
		field = new JTextField(30);
		field.addActionListener(this);
		btton = new JButton("SEND");
		btton.addActionListener(this);
		
		JPanel j1 = new JPanel();
		j1.setLayout(new BorderLayout());
		j1.add(field, BorderLayout.CENTER);
		j1.add(btton, BorderLayout.EAST);
		////////////////////////////하단 끝/////////////////////////////////////////
		///////////////////////////상단 시작/////////////////////////////////////////
		JLabel jl1 = new JLabel("User ID : " + id +" .");
		JLabel jl2 = new JLabel("Server ip : " + ip + " .");
		
		JPanel j2 = new JPanel();
		j2.setLayout(new BorderLayout());
		j2.add(jl1, BorderLayout.CENTER);
		j2.add(jl2, BorderLayout.EAST);
		j2.setBackground(new Color(0,255,0));
		///////////////////////////상단 끝/////////////////////////////////////////
		frame.add(jsp, BorderLayout.CENTER);
		frame.add(j1, BorderLayout.SOUTH);
		frame.add(j2, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		frame.pack();
		frame.setResizable(true);
		frame.setVisible(true);
	}
	
	public void connect() {
		try {
			Socket socket = new Socket(ip,port);
			wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new EchoClientUI("SANAYEE", "192.168.0.28", 3000).connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == field) {
			//텍스트 필드의 입력 내용을 가져오기
			String message = field.getText();
			try {
				wr.write(id+" : "+message);
				wr.newLine();
				wr.flush();
				
				String readLine = br.readLine();
				txt.append(readLine +"\r\n");
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
			field.setText("");
			
		}	//텍스트를 누르면 이쪽으로.
		else if(obj == btton) {
			String message = field.getText();
			
			try {
				wr.write(message);
				wr.newLine();
				wr.flush();
				
				String readLine = br.readLine();
				txt.append(readLine +"\r\n");
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
			field.setText("");
		}
	}
}
