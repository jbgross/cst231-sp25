package wk09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sec3_ParallelWrite {
    public static void main(String[] args) throws IOException {
        String groupFile = "src/wk09/sec3_group.txt";
        String memberFile = "src/wk09/sec3_member.txt";
        FileWriter groupFileWriter = new FileWriter(groupFile);
        PrintWriter groupPrintWriter = new PrintWriter(groupFileWriter);

        FileWriter memberFileWriter = new FileWriter(memberFile);
        PrintWriter memberPrintWriter = new PrintWriter(memberFileWriter);

        Scanner in = new Scanner(System.in);
        String leader;
        do {
            System.out.print("Enter group leader name (0 to quit): ");
            leader = in.next();
            if(leader.equals("0")) {
                break;
            }
            groupPrintWriter.println(leader);
            System.out.print("How many people? ");
            int groupSize = in.nextInt();
            groupPrintWriter.println(groupSize);
            for(int member = 0; member < groupSize; member++) {
                System.out.print("\tEnter member name: ");
                String memberName = in.next();
                memberPrintWriter.println(memberName);
            }
        } while(! leader.equals("0"));

        groupFileWriter.close();
        memberFileWriter.close();
    }
}
