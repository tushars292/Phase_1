package org.lockers.code;

import java.util.Scanner;

public class File_manger {
	private String wrngoptsel;
	private String projectendtag;
	private Scanner sc;
	private String dirfilepath;

	public File_manger() {

	}

	public File_manger(String wrngoptsel, String projectendtag, Scanner sc, String dirfilepath) {

		this.wrngoptsel = wrngoptsel;
		this.projectendtag = projectendtag;
		this.sc = sc;
		this.dirfilepath = dirfilepath;
	}

	void filemanger() throws BussinessCloseException, BussinessmainmenuException {
		boolean optionFlg = true;

		while (optionFlg) {
			// sub menu
			System.out.println(" Press  : ");
			System.out.println("        1     to add a new File   ");
			System.out.println("        2     to delete a  file   ");
			System.out.println("        3     to serch a  file   ");
			System.out.println("        4     Go back to the previous menu   ");
			int option = 0;
			try {
				option = Integer.parseInt(sc.nextLine());
				// read input from client

			} catch (NumberFormatException e) {
				System.out.println("Input does not match");
			}

			switch (option) {
			case 1:
				Fileadd fa = new Fileadd(dirfilepath, projectendtag, wrngoptsel, sc);
				fa.file_add();
				break;

			case 2:
				Filedelete fd = new Filedelete(wrngoptsel, projectendtag, dirfilepath, sc);
				try {
					fd.file_delete();
					break;
				} catch (BussinessException e) {
					System.out.println(e.getMessage());
					continue;
				}

			case 3:
				Filesearch fs = new Filesearch(wrngoptsel, projectendtag, dirfilepath, sc);
				try {
					fs.file_search();
					break;
				} catch (BussinessException e) {
					System.out.println(e.getMessage());
					continue;
				}

			case 4:

				optionFlg = false;
				break;

			default:
				System.out.println(wrngoptsel);
				break;
			}

		}

	}
}
