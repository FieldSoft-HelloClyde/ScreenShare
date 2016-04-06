package server;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class ScreenCaptureServer{
	
	public static void main(String[] args) throws AWTException, IOException{
		ServerSocket serverSocket = new ServerSocket(7789);
		System.out.println("����������");
		Robot robot = new Robot();
		while (true) {
			Socket client = serverSocket.accept();
			System.out.println("���յ��ͻ���");
			BufferedImage image = robot.createScreenCapture(new Rectangle(0, 0, 800, 600));
			ImageIO.write(image, "jpg", client.getOutputStream());
			client.close();
		}
	}
}
