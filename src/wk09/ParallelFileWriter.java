package wk09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParallelFileWriter {
    public static void main(String[] args) throws IOException {
        String groupFileName = "src/wk09/group.txt";
        String memberFileName = "src/wk09/member.txt";

        Scanner in = new Scanner(System.in);

        FileWriter groupFileWriter = new FileWriter(groupFileName);
        PrintWriter groupPrintWriter = new PrintWriter(groupFileWriter);

        FileWriter memberFileWriter = new FileWriter(memberFileName);
        PrintWriter memberPrintWriter = new PrintWriter(memberFileWriter);

        System.out.print("How many groups? ");
        int groupCount = in.nextInt();
        groupPrintWriter.println(groupCount);

        for(int group = 0; group < groupCount; group++) {
            // read in the group leader name
            System.out.print("What is the name of the group leader? ");
            String groupLeader = in.next();
            // read in the size of the group
            System.out.print("How many people in this group? ");
            int groupSize = in.nextInt();
            // write both out to file
            groupPrintWriter.println(groupLeader);
            groupPrintWriter.println(groupSize);

            for(int member = 0; member < groupSize; member++) {
                System.out.print("\tEnter group member name: ");
                String memberName = in.next();
                memberPrintWriter.println(memberName);
            }
        }


        groupFileWriter.close();
        memberFileWriter.close();
    }
}
