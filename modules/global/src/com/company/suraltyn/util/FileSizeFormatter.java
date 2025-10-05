package com.company.suraltyn.util;

import java.text.DecimalFormat;

public class FileSizeFormatter {

    private static final String[] UNITS = {"KB", "MB"};

    public static String formatSize(long sizeInBytes) {
        double size = sizeInBytes / 1024.0;
        int unitIndex = 0;
        while (size >= 1024 && unitIndex < UNITS.length - 1) {
            size /= 1024;
            unitIndex++;
        }
        return new DecimalFormat("#.##").format(size) + " " + UNITS[unitIndex];
    }
}
