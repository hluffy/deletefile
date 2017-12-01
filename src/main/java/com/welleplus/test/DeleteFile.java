package com.welleplus.test;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		String str1 = "D:/KuGou";
		File file = new File(str1);
		while(file.listFiles().length!=0){
			getfiles(file);
		}
		
	}
	
	public static void getfiles(File file){
		if(file.isDirectory()){
			File[] files = file.listFiles();
			if(files.length==0){
				file.delete();
				System.out.println(file.getName());
			}else{
				for (File file1 : files) {
					getfiles(file1);
				}
			}
			
		}else{
			file.delete();
			System.out.println(file.getName());
		}
	}

}
