package com.o2o.core.util;

import java.io.UnsupportedEncodingException;
import java.security.*;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/**
 * IDEA
 * <p/>
 * 密码加密工具类
 *
 * @Description Created by bowen.ma on 14-10-2.
 */
public final class AesUtil {
    private static final String KEY_ALGORITHM = "AES";
    private static final int KEY_SIZE = 128;
    private static final String ENCODING = "UTF-8";

    private static byte[] _encrypt(String content, String password) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(KEY_ALGORITHM);
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(password.getBytes());
            kgen.init(KEY_SIZE, random);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);// 创建密码器
            byte[] byteContent = content.getBytes(ENCODING);
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(byteContent);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * /** 加密
     *
     * @param content  需要加密的内容
     * @param password 加密密码
     * @return
     */
    public static String encrypt(String content, String password) {
        return parseByte2HexStr(_encrypt(content, password));
    }

    /**
     * 解密
     *
     * @param content  待解密内容
     * @param password 解密密钥
     * @return
     */
    public static byte[] decrypt(byte[] content, String password) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(KEY_ALGORITHM);
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(password.getBytes());
            kgen.init(KEY_SIZE, random);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(content);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String content, String key) {
        try {
            byte[] decryptFrom = parseHexStr2Byte(content);
            byte[] result = decrypt(decryptFrom, key);
            return new String(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将二进制转换成16进制
     *
     * @param buf
     * @return
     */
    private static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    private static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String content = "123456";
        String key = "TvQt9#tMVX6A!@#$TvQt9#tM";
        System.out.println("密 钥：" + key);
        System.out.println("加密前：" + content);
        // 加密
        long start = System.currentTimeMillis();
        String encryptResult;
        System.out.println("time：" + (System.currentTimeMillis() - start));
        encryptResult = encrypt(content, key);
        System.out.println("time：" + (System.currentTimeMillis() - start));
        System.out.println("加密后：" + encryptResult);
        // 解密
        String decryptResult = decrypt(encryptResult, key);
        System.out.println("解密后：" + decryptResult);


        encryptResult = aesEncrypt(content, key);
        System.out.println("加密后：" + encryptResult);
        decryptResult = aesDecrypt(encryptResult, key);
        System.out.println("解密后：" + decryptResult);
    }


    public static String aesEncrypt(String content, String passwd) {
        try {
            Cipher aesECB = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec key = new SecretKeySpec(passwd.getBytes(), "AES");
            aesECB.init(Cipher.ENCRYPT_MODE, key);
            byte[] result = aesECB.doFinal(content.getBytes());
            return new String(Base64.encode(result));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String aesDecrypt(String content, String passwd) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");// 创建密码器
            SecretKeySpec key = new SecretKeySpec(passwd.getBytes(), "AES");
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
            byte[] result = Base64.decode(content.getBytes());
            return new String(cipher.doFinal(result)); // 解密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

}
