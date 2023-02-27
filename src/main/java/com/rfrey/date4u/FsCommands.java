package com.rfrey.date4u;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.util.unit.DataSize;

/**
 * Created by Raphael Frey on 27.02.2023
 */
@ShellComponent
public class FsCommands {

    private final FileSystem fs;

    public FsCommands(FileSystem fs) {
        this.fs = fs;
    }

    @ShellMethod("Display required free disk space")
    public long minimumFreeDiskSpace() {
        return 1_000_000;
    }

    @ShellMethod("Display free disk space")
    public String freeDiskSpace() {
        return DataSize.ofBytes(fs.getFreeDiskSpace()).toGigabytes() + " GB";
    }
}
