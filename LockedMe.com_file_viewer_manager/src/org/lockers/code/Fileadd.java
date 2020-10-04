package org.lockers.code;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Fileadd {

	private String dirfilepath;
	private String projectendtag;
	private String wrngoptsel;
	Scanner sc;

	public Fileadd(String dirfilepath, String projectendtag, String wrngoptsel, Scanner sc) {
		super();

		this.dirfilepath = dirfilepath;
		this.projectendtag = projectendtag;
		this.wrngoptsel = wrngoptsel;
		this.sc = sc;
	}

	public Fileadd() {

	}

	@SuppressWarnings("resource")
	void file_add() throws BussinessCloseException,BussinessmainmenuException {
		File dirfile = new File(dirfilepath);
		System.out.println(" Filename should not contain special character ");

		System.out.println("Please Enter The name of file to be created ");

		String filename = null;
		try {
			filename = sc.nextLine();
			// read input from client

		} catch (NumberFormatException e) {
			System.out.println("Input does not match");
		}

		filename = getRidOfIllegalFileNameCharacters(filename);

		File[] arrfiles = dirfile.listFiles();

		if (arrfiles.length > 0) {
			String filepath = dirfilepath + "/" + filename + ".txt";
			while (true) {
				File filecheck = new File(filepath);
				if (filecheck.isFile()) {
					System.out.println("File already exist Please choose a different name ");
					String filerename = null;
					try {
						filerename = sc.nextLine();
						// read input from client
						filerename=getRidOfIllegalFileNameCharacters(filerename);

					} catch (NumberFormatException e) {
						System.out.println("Input does not match");
					}

					filepath = dirfilepath + "/" + filerename + ".txt";
					
					if(!(new File(filepath).isFile())) {
					try {
						new FileOutputStream(filepath);
						
						
						System.out.println("File creation sucessful ");
						break;
					} catch (FileNotFoundException e) {

					}}else {
						System.out.println("File already exist .you have reached maximum limit ");
						break;
					}
				} else {

					try {
						new FileOutputStream(dirfilepath + "/" + filename + ".txt");
						System.out.println("File creation sucessful ");
						break;
					} catch (FileNotFoundException e) {

					}

				}
			}

		} else {

			try {
				new FileOutputStream(dirfilepath + "/" + filename + ".txt");
				System.out.println("File creation sucessful ");
			} catch (FileNotFoundException e) {

			}

		}

		Gobacktoppreviousmennu gbp = new Gobacktoppreviousmennu(projectendtag, wrngoptsel, sc);
		gbp.goback();

	}

	private String getRidOfIllegalFileNameCharacters(String strName) {
		String strLegalName = strName.replace(":", " ").replace("\\", "").replace("?", "").replace("/", "")
				.replace("|", "").replace("*", "").replace("<", "").replace(">", "").replace("\t", "")
				.replace("//s", "").replace("\"", "");
		if (strLegalName.length() >= 80) {
			strLegalName = strLegalName.substring(0, 80);
		}
		return strLegalName;
	}

}
