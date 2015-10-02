package Util;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Matías
 */
@WebService(serviceName = "Crypto")
@SOAPBinding
public class Crypto {
    private Endpoint endpoint = null;
    private Logger log = Logger.getLogger(Crypto.class.getName());
    
    public Crypto() {
    }
     
    @WebMethod
    public String generatePwd (String pass){
        String passwordToHash = pass;
        String generatedPassword = null;
        try {
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } 
        catch (NoSuchAlgorithmException ex) 
        {
            Logger.getLogger(Crypto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return generatedPassword;
    }
    

    
    @WebMethod(exclude = true)
	public Endpoint getEndpoint() {
		return endpoint;
	}
}