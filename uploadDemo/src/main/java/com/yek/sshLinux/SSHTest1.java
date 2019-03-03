package com.yek.sshLinux;

import com.jcraft.jsch.Session;

import java.util.Date;

/**
 * Created by yek on 2019-03-03.
 */
public class SSHTest1 {
    public static void main(String[] args) {
        try {
            System.out.println(new Date());
            // timeout 设置连接时间，建议5秒之内，不然等太久
            SSHUtils.DestHost host = new SSHUtils.DestHost("126.0.0.11", "11", "11",3000);
            String stdout = "";
//			stdout = SSHUtils.execCommandByJSch(host, "whoami");
            Session shellSession = SSHUtils.getJSchSession(host);
            System.out.println(new Date());
            stdout = SSHUtils.execCommandByJSch(shellSession, "cd ~/Downloads");
            System.out.println(stdout);
            stdout = SSHUtils.execCommandByJSch(shellSession, "ls ~/Downloads --full-time -lh");
            System.out.println(stdout);
            stdout = SSHUtils.execCommandByJSch(shellSession, "echo 'whoami'");
            System.out.println(stdout);

            shellSession.disconnect();
//        response.getWriter().println(stdout);
        } catch (Exception e) {
            System.out.println(new Date());
            e.printStackTrace();
        }

    }
}