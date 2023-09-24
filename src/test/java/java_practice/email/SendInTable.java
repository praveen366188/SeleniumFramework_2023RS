package java_practice.email;

import org.apache.commons.mail.EmailException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SendInTable {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String s1="<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>HTML Table Generator</title> \n" +
                "\t<style>\n" +
                "\t\ttable {\n" +
                "\t\t\twidth:100%;\n" +
                "\t\t\theight:100%;\n" +
                "\t\t\tborder:2px double #1a1a1a;\n" +
                "\t\t\tborder-collapse:collapse;\n" +
                "\t\t\tpadding:5px;\n" +
                "\t\t}\n" +
                "\t\ttable th {\n" +
                "\t\t\tborder:2px double #1a1a1a;\n" +
                "\t\t\tpadding:5px;\n" +
                "\t\t\tbackground: #2c53c9;\n" +
                "\t\t\tcolor: #f9f5f5;\n" +
                "\t\t}\n" +
                "\t\ttable td {\n" +
                "\t\t\tborder:2px double #1a1a1a;\n" +
                "\t\t\ttext-align:center;\n" +
                "\t\t\tpadding:5px;\n" +
                "\t\t\tbackground: #e1e3f9;\n" +
                "\t\t\tcolor: #313030;\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<table>\n" +
                "\t\t<thead>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<th>CHARLIE</th>\n" +
                "\t\t\t\t<th>SMOKE TEST RESULTS</th>\n" +
                "\t\t\t\t<th><span style=\"font-style: normal; font-weight: 700;\">"+formatter.format(date)+"</span>&nbsp;</th>\n" +
                "\t\t\t</tr>\n" +
                "\t\t</thead>\n" +
                "\t\t<tbody>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td>TEST 001&nbsp;</td>\n" +
                "\t\t\t\t<td>LOGGING IN PAGE&nbsp;</td>\n" +
                "\t\t\t\t<td>PASS&nbsp;</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">TEST 002</span>&nbsp;</td>\n" +
                "\t\t\t\t<td>&nbsp;SIGN IN PAGE</td>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">PASS</span>&nbsp;</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">TEST 003</span>&nbsp;</td>\n" +
                "\t\t\t\t<td>&nbsp;HOME PAGE</td>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">PASS</span>&nbsp;</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">TEST 004</span>&nbsp;</td>\n" +
                "\t\t\t\t<td>MESSAGES PAGE&nbsp;</td>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">PASS</span>&nbsp;</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">TEST 005</span>&nbsp;</td>\n" +
                "\t\t\t\t<td>&nbsp;REALS PAGE</td>\n" +
                "\t\t\t\t<td>FAIL&nbsp;</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">TEST 006</span>&nbsp;</td>\n" +
                "\t\t\t\t<td>PROFILE PAGE&nbsp;</td>\n" +
                "\t\t\t\t<td><span style=\"font-style: normal; font-weight: 400;\">PASS</span>&nbsp;</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t</tbody>\n" +
                "\t</table>\n" +
                "</body>\n" +
                "</html>";
        SendEmail.SendTheEmail("Smoke Test Results",s1);
    }
}
