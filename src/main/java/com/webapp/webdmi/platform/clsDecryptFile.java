/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.webdmi.platform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;


/**
 *
 * @author narayan.punekar@yahoo.com
 * Decrypt Files
 *
 */
public class clsDecryptFile {
    private static final Logger log = Logger.getLogger(clsDecryptFile.class.getName());

    public clsDecryptFile() {
        try {
            String algorithm = "AES";
            Key secretKey = KeyGenerator.getInstance(algorithm).generateKey();
            String transformation = algorithm + "/CBC/NoPadding";
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            Path pathToFile = Paths.get("../webapps/cardlayoutweb/ProductBacklog.xml");
            File plaintext = pathToFile.toFile();

            File ciphertext = Paths.get("../webapps/cardlayoutweb/ProductBacklogCipher").toFile();
            //if (ciphertext.exists()) {
            //    ciphertext.delete();
            //}

            try (FileInputStream fileInputStream = new FileInputStream(plaintext);
                 FileOutputStream fileOutputStream = new FileOutputStream(ciphertext);
                 CipherOutputStream cipherOutputStream = new CipherOutputStream(fileOutputStream, cipher)) {
                fileOutputStream.write(cipher.getIV());
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fileInputStream.read(buffer)) > 0){
                    cipherOutputStream.write(buffer, 0, length);
                }
            }
            
            //plaintext.delete();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
        throws IOException {
        new clsDecryptFile();
    }
}
