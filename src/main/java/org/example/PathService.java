package org.example;

import java.nio.file.Path;

public class PathService {

    public static Path buildPath(String folder, String fileName) {
        return Path.of(folder).resolve(fileName);
    }
}
