package com.teamremastered.endrem.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class FileUtils {

    public static ArrayList<String> getFilesFromDirectory(String path, String extension) {
        ArrayList<String> result = new ArrayList<String>();
        File[] files = new File(path).listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extension);
            }
        });

        for (File file : files) {
            if (file.isFile()) {
                result.add(file.getName());
            }
        }

        return result;
    }

    public static ArrayList<String> createStringArrayList(String... strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            result.add(string);
        }
        return result;
    }
}
