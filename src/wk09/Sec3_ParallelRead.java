package wk09;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sec3_ParallelRead {
    public static void main(String[] args) throws IOException {
        String groupFile = "src/wk09/sec3_group.txt";
        String memberFile = "src/wk09/sec3_member.txt";

        FileReader groupFileReader = new FileReader(groupFile);
        Scanner groupScanner = new Scanner(groupFileReader);

        FileReader memberFileReader = new FileReader(memberFile);
        Scanner memberScanner = new Scanner(memberFileReader);
        while(groupScanner.hasNext()) {

            String leader = groupScanner.next();
            int groupSize = groupScanner.nextInt();
            System.out.print(leader + "'s group members: ");

            for (int member = 0; member < groupSize; member++) {
                System.out.print(memberScanner.next() + " ");
            }
            System.out.println();
        }

        memberFileReader.close();
        groupFileReader.close();
    }
}
