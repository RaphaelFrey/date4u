package com.rfrey.date4u;

import org.springframework.stereotype.Service;

import java.io.UncheckedIOException;
import java.util.Optional;

/**
 * Created by Raphael Frey on 27.02.2023
 */
@Service
public class PhotoService {

    private final FileSystem fs;

    public PhotoService(FileSystem fs) {
        this.fs = fs;
    }

    public Optional<byte[]> download(String name) {
        try {
            return Optional.of(fs.load(name + ".jpg"));
        } catch (UncheckedIOException e) {
            return Optional.empty();
        }
    }
}
