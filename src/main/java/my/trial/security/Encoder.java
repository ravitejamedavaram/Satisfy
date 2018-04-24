package my.trial.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;

public class Encoder implements PasswordEncoder{

    public String encodeToHash(String password) {
        String salt = "zyxwvut";
        password = salt + password + salt;
        String encodedPassword = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hashedBytes = digest.digest(password.getBytes("UTF-8"));
            BigInteger number = new BigInteger(1, hashedBytes);
            encodedPassword = number.toString(16);
            while (encodedPassword.length() < 32) {
                encodedPassword = "0" + encodedPassword;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return encodedPassword;
    }

    @Override
    public String encode(CharSequence charSequence) {
        return encodeToHash(charSequence.toString());

    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return true;
    }
}
