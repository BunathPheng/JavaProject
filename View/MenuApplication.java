package View;

import Model.Service.StudenImp;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;

import static java.lang.System.exit;

public class MenuApplication {
    public static void Menu()
    {
        System.out.println("\t\t\t\t\t\t\tMENU FOR STUDENT");
        System.out.println("==========================================================================");
        Table table = new Table(3, BorderStyle. UNICODE_ROUND_BOX, ShownBorders.ALL);
        for(int i=0;i<3;i++)
        {
            table.setColumnWidth(i,25,25);
        }
        table.addCell("1.ADD NEW STUDENT", new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("2.LIST ALL STUDENTS", new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("3.COMMIT DATA TO FILE", new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("4.SEARCH FOR STUDENT" , new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("5.UPDATE STUDENT'S BY ID " , new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("6.DELETE STUDENT'S DATA" , new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("7.GENERATE DATA TO FILE", new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("8.DELETE/CLEAR DATA" , new CellStyle(CellStyle.HorizontalAlign.CENTER));
        table.addCell("0,99.Exit", new CellStyle(CellStyle.HorizontalAlign.CENTER));
        System.out.println(table.render());
        System.out.println("==========================================================================");
    }
    public static void main(String[] args) {
        System.out.println("\t\t\t\t<WELCOME TO STUDENT MANAGEMENT SYSTEM>");
        System.out.println("==========================================================================");
        System.out.println(
                "\t\t▄████████   ▄████████      ███        ▄████████  ████████▄\n"+
                "\t\t███    ███   ███    ███ ▀█████████▄   ███    ███ ███   ▀███\n"+
                "\t\t███    █▀    ███    █▀     ▀███▀▀██   ███    ███ ███    ███\n"+
                "\t\t███          ███            ███   ▀   ███    ███ ███    ███\n"+
                "\t\t███        ▀███████████     ███     ▀███████████ ███    ███\n"+
                "\t\t███    █▄           ███     ███       ███    ███ ███    ███\n"+
                "\t\t███    ███    ▄█    ███     ███       ███    ███ ███   ▄███\n"+
                "\t\t████████▀   ▄████████▀     ▄████▀     ███    █▀  ████████▀\n"
        );
        System.out.println("==========================================================================");
        MenuApplication.Menu();
        while (true)
        {
            System.out.print("---->Please inset one option:");
            try
            {
                int option = new Scanner(System.in).nextInt();
                System.out.println("==========================================================================");
                switch (option)
            {
                case 1:
                    StudenImp studenImp = new StudenImp();
                    studenImp.addNewStudent();

                case 2:
                    exit(0);
            }
            }catch (Exception e)
            {
                e.getMessage();
                System.out.println("[+] please input number can't input Sting");
            }
        }


    }
}
