package org.lockers.code;

import java.util.Scanner;

public class Main_menu {

	private String projectendtag;
	private String dirfilepath;
	final String wrngoptsel = "please select a correct option here are the option again";

	public Main_menu() {

	}

	public Main_menu(String projectendtag, String dirfilepath) {

		this.projectendtag = projectendtag;
		this.dirfilepath = dirfilepath;
	}

	void main_menu() {
		Scanner sc = new Scanner(System.in);

		boolean optionFlg = true;

		while (optionFlg) {
			// main menu
			System.out.println("Please select one off the following option : ");
			System.out.println(" Press  : ");
			System.out.println("    1     to  view all the file in the folder  ");
			System.out.println("    2     to  get to Business-level operations   ");
			System.out.println("    3     to  exist the project   ");
			int option = 0;
			try {
				option = Integer.parseInt(sc.nextLine());
				// read input from client

			} catch (NumberFormatException e) {
				System.out.println("Input does not match");
			}

			switch (option) {
			case 1:
				Fileview fv = new Fileview(dirfilepath, projectendtag, wrngoptsel, sc);
				try {
					fv.fileSearch();
				} catch (BussinessException e) {
					System.out.println(e.getMessage());
					System.out.println("-----------------------------------------------------");
				} catch (BussinessCloseException e) {
					System.out.println(e.getMessage());
					optionFlg = false;
					System.out.println("----------------------*-------------------------------");
				} catch (BussinessmainmenuException e) {

				} catch (Exception e) {

				}
				break;

			case 2:
				File_manger fm = new File_manger(wrngoptsel, projectendtag, sc, dirfilepath);
				try {
					fm.filemanger();
				} catch (BussinessCloseException e) {
					System.out.println(e.getMessage());
					optionFlg = false;
					System.out.println("----------------------*-------------------------------");
				} catch (BussinessmainmenuException e) {

				} catch (Exception e) {

				}

				break;
			case 3:
				optionFlg = false;
				System.out.println(projectendtag);
				break;
			default:
				System.out.println(wrngoptsel);
				break;
			}

		}
		sc.close();
	}
}
