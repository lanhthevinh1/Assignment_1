package com.vti.ultis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOManager {
	
	public static String readFile(String pathFile) throws Exception {
		if(!FileManager.isFileExists(pathFile)) {
			throw new Exception(FileManager.FILE_NOT_EXISTS);
		}
		
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(pathFile);
			byte[] b = new byte[1024];
			
			
			int length = fileInputStream.read(b);
			String content = "";
			
			while(length != -1) {
				content = new String(b,0,length);
				
				length = fileInputStream.read(b);
			}
			return content;
		} finally {
			fileInputStream.close();
		}
		
	}
	
	public static void writeFile(String pathFile,boolean isContinuing, String content) throws Exception {
		if(!FileManager.isFileExists(pathFile)) {
			throw new Exception(FileManager.FILE_NOT_EXISTS);
		}
		
		FileOutputStream fileOutputStream = null;
		
		try{
			fileOutputStream = new FileOutputStream(pathFile,isContinuing);
			
			fileOutputStream.write(content.getBytes());
		}finally {
			fileOutputStream.close();
		}
	}
	
	public static void writeObject(Object object, String path, String fileName) throws Exception {
		if(object.equals(null)) {
			throw new Exception("Error! Object is Null");
		}
		if(!FileManager.isFolderExists(path)) {
			FileManager.createNewFolder(path);
		}
		
		ObjectOutputStream objectOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			if(!FileManager.isFileExists(path+"\\"+fileName)) {
				FileManager.createNewFile(path, fileName);
			}
			fileOutputStream = new FileOutputStream(path+"\\"+fileName);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(object);
		} finally {
			objectOutputStream.close();
			fileOutputStream.close();
		}
		
	}
	
	public static Object readObject(String pathFile) throws Exception {
		if(!FileManager.isFileExists(pathFile)) {
			throw new Exception(FileManager.FILE_NOT_EXISTS);
		}
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(pathFile);
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			return objectInputStream.readObject();
		} finally {
			
			fileInputStream.close();
			objectInputStream.close();
		}
		
	}

}
