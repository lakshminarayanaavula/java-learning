package com.aln.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample1 {

    public static void main(String[] args) {
        int cpuCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(cpuCount);
        for (int i = 0; i < cpuCount; i++) {
            executorService.submit(new IoIntensiveTask());
        }
        executorService.shutdown();
    }

    static class IoIntensiveTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Starting IO intensive task on thread: " + Thread.currentThread().getName());
            
            long startTime = System.currentTimeMillis();
            
            try {
                // Simulate multiple IO operations
                for (int i = 0; i < 10; i++) {
                    // File IO operations
                    String fileName = "temp_file_" + Thread.currentThread().getId() + "_" + i + ".txt";
                    
                    // Write to file
                    try (java.io.FileWriter writer = new java.io.FileWriter(fileName)) {
                        writer.write("Thread " + Thread.currentThread().getName() + " writing data " + i + "\n");
                        writer.write("This is some sample data for IO intensive task\n");
                        writer.write("Performing file operations to simulate IO load\n");
                    }
                    
                    // Read from file
                    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(fileName))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            // Simulate some processing of the read data
                            if (line.contains("data")) {
                                // Small delay to simulate processing
                                Thread.sleep(10);
                            }
                        }
                    }
                    
                    // Delete the file
                    new java.io.File(fileName).delete();
                    
                    // Simulate network IO delay
                    Thread.sleep(100);
                    
                    System.out.println("Thread " + Thread.currentThread().getName() + " completed IO operation " + (i + 1));
                }
                
            } catch (Exception e) {
                System.err.println("Error in IO task: " + e.getMessage());
            }
            
            long endTime = System.currentTimeMillis();
            System.out.println("IO intensive task completed on thread: " + Thread.currentThread().getName() + 
                             " in " + (endTime - startTime) + "ms");
        }
    }
}
