package com.kh.socket2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// 키보드고 입력받은 데이터를 읽어서 서버로 보낸다
// 다시 서버가 한테 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력 
/*
 * 클라이언트 로직 
 * 1. 소켓 생성
 * 2. 스트림
 * */

public class Chatclient {
	public static void main(String[] args) {
		try {
			// InetAddress ip = InetAddress.getLocalHost();
			String ip = InetAddress.getLocalHost().getHostAddress();
			// 1. 소켓 생성
			Socket s = new Socket(ip, 60000);
			// 2. 스트림(무한 루프)
			// 키보드고 입력받은 데이터를 읽어서 서버로 보낸다
			// PrintWritter <- s.getOutStream
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));

			while (true) {
				String line = br.readLine();
				pw.print(line);
				String serverMsg = br2.readLine();
				System.out.println("내가 보낸 메세지 " + serverMsg);
			}

		} catch (Exception e) {

			System.out.println("서버 연결 실패" + e.getLocalizedMessage());

		}

	}
}
