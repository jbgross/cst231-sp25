package wk09;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParallelFileReader {
    public static void main(String[] args) throws IOException {

        String groupFileName = "src/wk09/group.txt";
        String memberFileName = "src/wk09/member.txt";

        FileReader groupFileReader = new FileReader(groupFileName);
        Scanner groupScanner = new Scanner(groupFileReader);

        FileReader memberFileReader = new FileReader(memberFileName);
        Scanner memberScanner = new Scanner(memberFileReader);

        int groupCount = groupScanner.nextInt();
        for(int group = 0; group < groupCount; group++) {
            String leaderName = groupScanner.next();
            int groupSize = groupScanner.nextInt();
            System.out.print(leaderName + "'s group has " + groupSize + " members: ");
            for(int member = 0; member < groupSize; member++) {
                System.out.print(memberScanner.next() + " ");
            }
            System.out.println();
        }

        groupFileReader.close();
        memberFileReader.close();
    }
}
