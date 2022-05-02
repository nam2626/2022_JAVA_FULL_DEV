package io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest {
	public String readline() {
		InputStreamReader isr = new InputStreamReader(System.in);
		char buffer[] = new char[10];
		String message = null;
		int idx = 0;

		try {
			do {
				// 배열에 내용이 가득차있으면 배열의 길이를 늘림
				if (idx == buffer.length - 1)// 이때 배열에 내용이 가득차있는 상태
					buffer = reallocBuffer(buffer);
				buffer[idx] = (char) isr.read();// 한글자씩 입력 받음
				idx++;
			} while (buffer[idx - 1] != '\n');
			// System.out.println(Arrays.toString(buffer));

			for (int i = 0; i < idx; i++) {
				System.out.print((int) buffer[i] + " ");
			}

			System.out.println();
			message = String.copyValueOf(buffer, 0, idx - 2);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null)
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return message;
	}

	private char[] reallocBuffer(char[] buffer) {
		char[] temp = buffer;// 임시 배열에 기존 배열을 저장

		buffer = new char[temp.length * 2]; // 기존 배열에다가 2배 길이만큼 배열을 새로 생성

		for (int i = 0; i < temp.length; i++)
			buffer[i] = temp[i];// 임시 저장된 내용을 새로 생성된 배열에 저장

		return buffer;
	}

	public void println(String msg) {
		char[] buffer = msg.toCharArray();
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		try {
			osw.write(buffer);
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null)
					osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
