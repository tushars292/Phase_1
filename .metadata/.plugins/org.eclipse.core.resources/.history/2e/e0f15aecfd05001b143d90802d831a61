package org.lockers.code;

import java.io.File;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Filesearch {
	private String wrngoptsel;
	private String projectendtag;
	Scanner sc;
	private String dirfilepath;

	public Filesearch(String wrngoptsel, String projectendtag, String dirfilepath, Scanner sc) {
		super();
		this.wrngoptsel = wrngoptsel;
		this.projectendtag = projectendtag;
		this.sc = sc;
		this.dirfilepath = dirfilepath;
	}

	public Filesearch() {

	}

	void file_search() throws BussinessException,  BussinessmainmenuException {
		File dirfile = new File(dirfilepath);
		File[] arrfiles = dirfile.listFiles();

		if (arrfiles.length > 0) {

			System.out.println(" Please enter the name of file you want to search ");

			String filename = sc.nextLine();
			String filepath = dirfilepath + "/" + filename + ".txt";

			try {
				File filesearched = new File(filepath);
				Boolean fs = filesearched.isFile();
				if (fs) {
					Boolean fcheck = false;
					for (int i = 0; i < arrfiles.length; i++) {

						if (filesearched.getName().equals(arrfiles[i].getName())) {
							fcheck = true;
							break;
						}

					}

					if (fcheck) {

						System.out.printf(" File searched %s is found, The File is %s ", filename,
								filesearched.getName());
						System.out.println("");
					} else {
						System.out.println("File not found");
						printfilename(arrfiles);
					}

				} else {
					System.out.printf(" File %s cannot be found, The files present in the folder are", filename);
					printfilename(arrfiles);
				}
			} catch (NoSuchElementException e) {
				System.out.printf(" File %s cannot be found, The files present in the folder are", filename);
				printfilename(arrfiles);
			
			}

		} else {

			throw new BussinessException("There are no files in the Folder : " + dirfile.getName()
					+ ", Please create file before selecting this option ");
		}

		Gobacktoppreviousmennu gbpm = new Gobacktoppreviousmennu(projectendtag, wrngoptsel, sc);
		gbpm.goback();

	}

	void printfilename(File [] arrFiles) {
		System.out.println("");
		Arrays.sort(arrFiles);

		int fsno = 1;
		for (int i = 0; i < arrFiles.length; i++) {
			System.out.println(fsno + ") " + arrFiles[i].getName());
			fsno++;
		}
	}

}
