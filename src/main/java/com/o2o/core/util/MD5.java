package com.o2o.core.util;



import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * IDEA
 *
 * @Description Created by bowen.ma on 14-10-5.
 */
public class MD5 {

    public static String md5(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("MD5");
            digest.update(s.getBytes());
            byte bytes[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte b : bytes) {
                String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1)
                    hex = "0" + hex;
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static byte[] md5byte(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("MD5");
            digest.update(s.getBytes());
            byte bytes[] = digest.digest();

            return bytes;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] aesDecode(byte[] raw, byte[] encrypted)
            throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        // Cipher cipher = Cipher.getInstance("AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }
}
