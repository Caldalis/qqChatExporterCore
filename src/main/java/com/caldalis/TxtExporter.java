package com.caldalis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxtExporter {
    public static void exportToFile(List<String> logEntries, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String entry : logEntries) {
                writer.write(entry);
                writer.newLine();  // 换行符自动适配操作系统
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("导出失败: " + e.getMessage());
        }
    }
}
