package com.seungjun.studyedu.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {

	static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
	
	
	
	/**
	 * base64로 넘어온 이미지를 url로 변경시켜주는 함수 
	 * @param profileimage base64이미지
	 * @param key 유저 키 
	 * @return url
	 */
	public static String base64ToUrl(String profileimage, String key) {
        
		String imgUrl = "";
		
		if(profileimage.equals("") || profileimage == null)
			return imgUrl;
			
			
		try {

			byte[] imageByte = Base64.decodeBase64(profileimage);

			imgUrl = "http://13.209.214.110:8080/image/"+ key + ".png";
	        String realDir = "/var/lib/tomcat8/webapps/image/";
	        String fileStr = "/var/lib/tomcat8/webapps/image/" + key + ".png";
	        
	        BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageByte));
	        
	        logger.debug("directory > " + imgUrl);
			
	   		File dir = new File(realDir);
	   		File file = new File(fileStr);
		      
	   		 
	   		if(!dir.exists()) {
	   			dir.mkdir();
	   			logger.debug("dir is created!");
	   		}
	   		
	   		
	   		if(file.exists()) {
	   			file.delete();
	   		}
	   		
	   		
		    if (file.createNewFile()){
		    	logger.debug("File is created!");
		    }else {
		    	logger.debug("File is not created!");
		    }
		    
			ImageIO.write(img, "png", file);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

		
		return imgUrl;
	}
	
	
	
	/**
	 * 30자 랜덤 문자를 만들어 주는 함수 
	 * @return 30자 랜덤문자 
	 */
	public static String getUserRandKey() {
		
		Random rnd = new Random();
		
		StringBuffer buf =new StringBuffer();
		
		for(int i=0; i<30; i++){
		   
		    if(rnd.nextBoolean()){
		        buf.append((char)((int)(rnd.nextInt(26))+97));
		        
		    }else{
		        buf.append((rnd.nextInt(10)));
		    }
		}

		
		return buf.toString();
	}
}
