package Model.Service;

import java.util.Scanner;

public class StudenImp implements StudentSevice{
    @Override
    public void addNewStudent() {
        try
        {
            System.out.println(">>>INSET STUDENT'S INFO");
            System.out.print("[+] Insert student's name:");
            String names = new Scanner(System.in).nextLine();
        }catch (Exception e)
        {
            e.getMessage();
            System.out.println("[+]Please input name not input number");
        }
    }
}
