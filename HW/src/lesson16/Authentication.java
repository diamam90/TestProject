package lesson16;

import lesson16.exceptions.WrongLoginException;
import lesson16.exceptions.WrongPasswordException;

public class Authentication {
    public static boolean authenticate(String login, String password, String confirmPass) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("�����" + login + " ������� 20 ��������");
        }
        if (password.length() >= 20 || password.equals(confirmPass)) {
            throw new WrongPasswordException("������ ��������");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
        try {
            System.out.println(authenticate("login1", "password1", "cpassword1"));
            System.out.println(authenticate("login1", "password1", "password1"));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
