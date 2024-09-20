package ru.academits.lesson3D;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's date in the format DD.MM.YYYY: ");
        String todayDate = scanner.nextLine();

        Pattern datePattern = Pattern.compile("(\\d{2})\\.(\\d{2})\\.(\\d{4})");
        Matcher dateMatcher = datePattern.matcher(todayDate);

        if (!dateMatcher.matches()) {
            System.out.println("Incorrect format of the entered data.");
            return;
        }

        int todayDay = Integer.parseInt(dateMatcher.group(1));
        int todayMonth = Integer.parseInt(dateMatcher.group(2));
        int todayYear = Integer.parseInt(dateMatcher.group(3));

        if (todayDay < 1 || todayMonth < 1 || todayMonth > 12 || todayYear < 1) {
            System.out.println("Entered incorrect date.");
            return;
        }

        int todayMonthDaysCount;

        if (todayMonth == 2) {
            if ((todayYear % 4 == 0 && todayYear % 100 != 0) || todayYear % 400 == 0) {
                todayMonthDaysCount = 29;
            } else {
                todayMonthDaysCount = 28;
            }
        } else if (todayMonth < 8) {
            todayMonthDaysCount = todayMonth % 2 == 0 ? 30 : 31;
        } else {
            todayMonthDaysCount = todayMonth % 2 == 0 ? 31 : 30;
        }

        if (todayDay > todayMonthDaysCount) {
            System.out.println("Entered incorrect date.");
            return;
        }

        int nextDay;
        int nextMonth;
        int nextYear;

        if (todayDay < todayMonthDaysCount) {
            nextDay = todayDay + 1;
            nextMonth = todayMonth;
            nextYear = todayYear;
        } else {
            nextDay = 1;

            if (todayMonth < 12) {
                nextMonth = todayMonth + 1;
                nextYear = todayYear;
            } else {
                nextMonth = 1;
                nextYear = todayYear + 1;
            }
        }

        System.out.printf("Tomorrow date: %02d.%02d.%04d", nextDay, nextMonth, nextYear);
    }
}