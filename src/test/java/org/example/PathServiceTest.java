package org.example;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathServiceTest {

    @Test
    void buildPathShouldCombineFolderAndFileNameCorrectly() {
        Path expected = Path.of("logs", "app.log");
        Path actual = PathService.buildPath("logs", "app.log");

        assertEquals(expected, actual);
    }
}
