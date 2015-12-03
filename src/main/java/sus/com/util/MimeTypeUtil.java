package sus.com.util;

import java.io.File;
import java.util.Hashtable;

import javax.activation.MimetypesFileTypeMap;

/**
 * Created on Mar 17, 2015
 * 
 * @author Sushant
 * @version 1.0
 */

public class MimeTypeUtil {
	
    private static final Hashtable<String, String> mimeTypes;
    
    public static String getMimeType(String fileName) {
        String mimeType = "application/octetstream";
        String extension = getFileExtension(fileName);
        if(mimeTypes.get(extension.trim().toLowerCase()) != null) {
            mimeType = mimeTypes.get(extension.trim().toLowerCase());
        }else {
            mimeType = new MimetypesFileTypeMap().getContentType(new File(fileName));
        }
        return mimeType;
    }
    
    private static String getFileExtension(String fileName) {
        String extension = "";
        if(fileName != null && fileName.length() > 0) {
            int index = fileName.lastIndexOf("."); 
            if(index >= 0 && index != fileName.length()-1) {
                extension = fileName.substring(index+1);
            }
        }
        return extension; 
    }
    
    static {
        mimeTypes = new Hashtable<String, String>();
        
        //Audio mimetypes with extension
        mimeTypes.put("ua","audio/basic");
        mimeTypes.put("wav","audio/x-wav");
        mimeTypes.put("mid","audio/x-midi");
        mimeTypes.put("mp3","audio/mpeg");
        
        //Video mimetypes with extension
        mimeTypes.put("mpg", "video/mpeg");
        mimeTypes.put("mpeg", "video/mpeg");
        mimeTypes.put("mpe", "video/mpeg");
        mimeTypes.put("qt", "video/quicktime");
        mimeTypes.put("mov", "video/quicktime");
        mimeTypes.put("avi", "video/x-msvideo");
        mimeTypes.put("movie", "video/x-sgi-movie");
        
        //Image mimetypes with extension
        mimeTypes.put("bmp", "image/bmp");
        mimeTypes.put("gif", "image/gif");
        mimeTypes.put("ief", "image/ief");
        mimeTypes.put("jpg", "image/jpeg");
        mimeTypes.put("jpeg", "image/jpeg");
        mimeTypes.put("jpe", "image/jpeg");
        mimeTypes.put("png", "image/png");
        mimeTypes.put("tif", "image/tiff");
        mimeTypes.put("tiff", "image/tiff");
        mimeTypes.put("xbm", "image/x-xbitmap");
        mimeTypes.put("xbm", "image/x-xbitmap");
    }
}
