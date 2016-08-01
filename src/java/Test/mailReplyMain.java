/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author vishu
 */
public class mailReplyMain {
    public static void main(String[] args) {
        mailSend obj = new mailSend();
        String sendto="jennyscott00001@hotmail.com";
        String msg="hiiiiiiiiiiiiiiiiii";
        obj.replymethod(msg, sendto);
    }
}
