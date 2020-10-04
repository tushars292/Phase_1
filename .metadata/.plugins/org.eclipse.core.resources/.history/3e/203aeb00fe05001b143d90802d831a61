package org.lockers.code;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Fileview {
	private String dirfilepath;
	private String projectendtag;
	Scanner sc;
	private String wrngoptsel;

	public Fileview(String dirfilepath, String projectendtag,String wrngoptsel,	Scanner sc) {

		this.dirfilepath = dirfilepath;
		this.projectendtag = projectendtag;
		this.sc = sc;
		this.wrngoptsel = wrngoptsel;

	}

	public Fileview() {

	}

	void fileSearch() throws BussinessException, BussinessCloseException,BussinessmainmenuException {
		File dirfile = new File(dirfilepath);
		File[] arrfiles = dirfile.listFiles();
		if (arrfiles.length > 0) {
			Arrays.sort(arrfiles);
			System.out.println("The File are : \r\n");
			int fsno=1;
			for (int i = 0; i < arrfiles.length; i++) {
				System.out.println(fsno  + ") " + arrfiles[i].getName());
				fsno++;
			}

			Gobacktoppreviousmennu gnpm = new Gobacktoppreviousmennu( projectendtag, wrngoptsel,sc);
			gnpm.goback();
		} else {
			throw new BussinessException("There are no files in the Folder :" + dirfile.getName());

		}

	}

}
