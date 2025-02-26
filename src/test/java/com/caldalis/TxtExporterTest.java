package com.caldalis;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TxtExporterTest {
    @Test
    public void testExport() throws IOException {
        List<String> mockData = Arrays.asList("2023-01-01 Hello", "2023-01-02 World");
        TxtExporter.exportToFile(mockData, "test_output.txt");

        // 验证文件内容
        List<String> lines = Files.readAllLines(Paths.get("test_output.txt"));
        assertEquals(2, lines.size());
    }
}
