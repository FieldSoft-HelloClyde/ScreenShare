package client;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.*;

public class ClientScreen extends JPanel {
	BufferedImage bufferedImage;
	
	public ClientScreen(){
		this.bufferedImage = null;
	}
	
	public void SendImg(BufferedImage image) {
		this.bufferedImage = image;
	}
	
	@Override
	public void paint(Graphics g){
		if (this.bufferedImage == null){
			g.drawString("�ȴ�ͼ����...", this.getWidth() / 2, this.getHeight() / 2);
			System.out.println("δ���յ�ͼ��");
		}
		else{
			g.drawImage(this.bufferedImage, 0, 0, this);
			System.out.println("���յ�ͼ��");
		}
	}
}
