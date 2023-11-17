package pl.javastart.bootcamp.utils;

import java.util.Scanner;

public class YouTubeLinkConverter {

    public static String convertLinksToOneFormat(String videoLinks) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        Scanner sc = new Scanner(videoLinks);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (line.startsWith("http")) {
                char[] charArray = line.toCharArray();
                for (int i = charArray.length - 1; i >= 0; i--) {
                    if (charArray[i] != '=' && charArray[i] != '/') {
                        stringBuilder2.append(charArray[i]);
                    } else {
                        break;
                    }
                }
                stringBuilder2.reverse();
                stringBuilder.append(stringBuilder2.append("\r\n"));
            } else {
                stringBuilder.append(line).append("\r\n");
            }
        }
        return stringBuilder.toString();
    }
}
