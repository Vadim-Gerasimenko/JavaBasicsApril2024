package ru.academits.lesson12;

public class Url {
    private static final String PROTOCOL_DELIMITER = "://";
    private static final String HIERARCHY_DELIMITER = "/";

    public static String getServerName(String url) {
        int serverNameIndex = url.indexOf(PROTOCOL_DELIMITER) + PROTOCOL_DELIMITER.length();

        int hierarchyDelimiterIndex = url.indexOf(HIERARCHY_DELIMITER, serverNameIndex);

        if (hierarchyDelimiterIndex != -1) {
            return url.substring(serverNameIndex, hierarchyDelimiterIndex);
        }

        return url.substring(serverNameIndex);
    }

    public static void main(String[] args) {
        String url = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println("Имя сервера: " + getServerName(url));
    }
}