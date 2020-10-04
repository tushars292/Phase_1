package org.lockers.code;

import java.util.Scanner;

public class Gobacktoppreviousmennu {

	String gobackpre = "Please Press ";
	private String projectendtag;
	private String wrngoptsel;
	Scanner sc;
	public Gobacktoppreviousmennu(String projectendtag, String wrngoptsel,Scanner sc) {

		this.projectendtag = projectendtag;
		this.wrngoptsel = wrngoptsel;
		this.sc = sc;
	}

	public Gobacktoppreviousmennu() {

	}

	void goback() throws BussinessCloseException,BussinessmainmenuException {
		
		Boolean optionflag = true;
		while (optionflag) {
			System.out.println(" Press  : ");
			System.out.println(" 1 to go back to previous menu");
			System.out.println(" 2 to go back to main menu");
			System.out.println(" 3 to Exist the app");
			int option = 0;
			try {
				option = Integer.parseInt(sc.nextLine());
				// read input from client

			} catch (NumberFormatException e) {
				System.out.println("Input does not match");
			}

			switch (option) {
			case 1:
				optionflag = false;
				break;
			case 2:
				throw new BussinessmainmenuException();

			case 3:
				throw new BussinessCloseException(projectendtag);

			default:
				System.out.println(wrngoptsel);
				break;
			}

		}
	
	}

}
