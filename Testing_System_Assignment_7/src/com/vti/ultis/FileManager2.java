package com.vti.ultis;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class FileManager2 {	
	public static final String FILE_NOT_EXISTS = "Error! File not exists.";
	public static final String FILE_EXISTS = "File is exists.";
	public static final String CREATE_FILE_SUCCESS = "Create new file success!";
	public static final String CREATE_FILE_FAIL = "Create new file fail!";
	public static final String DELETE_FILE_SUCCESS = "Delete file success!";
	public static final String DELETE_FILE_FAIL = "Delete file fail!";
	public static final String SOURCE_FILE_NOT_EXISTS = "Source File is not exits!";
	public static final String DESTINATION_FILE_EXISTS = "Destination File is exits!";
	public static final String FOLDER_EXIST = "Error! Folder Exist";
	
	public static final String NAME_FILE_EXIST = "Error! Name is Exist.";
	
	public static final String PATH_NOT_FOLDER = "Error! Path not folder.";
	public static final String IS_FOLDER = "Is it folder ";
	public static final String DOWNLOAD_SUCCESS = "Download success";
	public static boolean fileIsExists(String  pathFile) {
		return new File(pathFile).exists() ? true : false;
	}
	public static boolean folderIsExists(String pathFolder) {
		return new File(pathFolder).exists() ? true : false;
	}
	
	public static void createNewFile(String pathFile) throws Exception {
		if(fileIsExists(pathFile)) {
			throw new Exception(FILE_EXISTS);
		}
		boolean result = new File(pathFile).createNewFile();
		
		System.out.println(result ? CREATE_FILE_SUCCESS:CREATE_FILE_FAIL);
	}
	
	public static void createNewFile(String path, String fileName) throws Exception {
		String pathFile = path +"//"+ fileName;
		createNewFile(pathFile);
	}
	
	public static void deleteFile(String pathFile) throws Exception {
		if(!fileIsExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		
		boolean result = new File(pathFile).delete();
		System.out.println(result ? DELETE_FILE_SUCCESS:DELETE_FILE_FAIL);
	}
	
	public static boolean isFolder(String path) {
		return new File(path).isDirectory() ? true : false;
	}
	
	public static List<String> getAllFileName(String path) throws Exception{
		File file = new File(path);
		if(!isFolder(path)) {
			throw new Exception(PATH_NOT_FOLDER);
		}
		
		return Arrays.asList(file.list());
	}
	
	public static void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
		if(!fileIsExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		
		String destinationFile = destinationPath + "//"+ newName;
		
		if(fileIsExists(destinationFile)) {
			throw new Exception(DESTINATION_FILE_EXISTS);
		}
		
		File source = new File(sourceFile);
		
		File dest = new File(destinationFile);
		
		Files.copy(source.toPath(), dest.toPath());
	}
	
	public static void copyFile(String sourceFile, String destinationPath) throws Exception {
		
		String s[] = sourceFile.split("/");
		String nameFile = s[s.length-1];
		
		copyFile(sourceFile, destinationPath, nameFile);
	}
	
	public static void moveFile(String sourceFile, String destinationPath) throws Exception {
		if(!fileIsExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		
		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		
		Files.move(source.toPath(), dest.toPath());
	}
	
	public static void renameFile(String pathFile, String newName) throws Exception {
		if(!fileIsExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		
		if(fileIsExists(newName)) {
			throw new Exception(FILE_EXISTS);
		}
		
		File oldFile = new File(pathFile);
		File newFile = new File(newName);
		
		oldFile.renameTo(newFile);		
	}
	
	public static void createNewFolder(String newPathFolder) throws Exception {
		if(folderIsExists(newPathFolder)) {
			throw new Exception(FOLDER_EXIST);
		}
		
		new File(newPathFolder).mkdir();
	}
	
	public static void downloadFile(String fileLink, String folder) throws Exception {
		if(!folderIsExists(folder)) {
			createNewFolder(folder);
		}
		
		// get name file
		String s[] = fileLink.split("/");
		String nameFile = s[s.length-1];
		folder = folder + "/" + nameFile;
		//create connection to URL
		URL url = new URL(fileLink);
		// open connection
		URLConnection connection = url.openConnection();
		//get size of file
		int size = connection.getContentLength();
		//read file from Internet use InputStream 
		InputStream in = connection.getInputStream();
		//save file use FileOutputStream
		FileOutputStream output = new FileOutputStream(folder);
		int byteDownloaded = 0;
		byte[] b = new byte[1024];
		// get length of file. If not read then length = -1
		int length = in.read(b);
		while(length != -1) {
			byteDownloaded += length;
			// print % byte downloaded
			System.err.println(byteDownloaded * 100f/size + "%");
			output.write(b,0,length);
			length = in.read(b);
		}
		//close
		output.close();
		in.close();
		//show message
		System.out.println(DOWNLOAD_SUCCESS);
	}
}
