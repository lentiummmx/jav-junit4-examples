package com.globant.howtodoinjava.rules;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testWrite() throws IOException {
        // Create a temporary file
        final File tempFile = folder.newFile("tempFile.txt");

        // Write something to it
        FileUtils.writeStringToFile(tempFile, "hello world");

        // Read it from temp file
        final String s = FileUtils.readFileToString(tempFile);

        // Verify the content
        Assert.assertEquals("hello world", s);

        // Note: File is guaranteed to be deleted after the test finishes
    }
}
