package controller;

import java.util.Scanner;
/**
 * 모든 컨트롤러의 Interface
 * @author ITSC
 *
 */
public interface Controller {
	/**
	 * 각 기능의 시작점
	 * @param sc 사용자로 부터 입력 받는 Scanner
	 */
	public abstract void execute(Scanner sc);
}
