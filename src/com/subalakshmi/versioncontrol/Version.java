package com.subalakshmi.versioncontrol;

import java.time.LocalDateTime;

// Represents a single version (commit) in the system
public class Version {

    private int versionId;
    private String content;
    private LocalDateTime timestamp;

    // Constructor: timestamp is generated automatically
    public Version(int versionId, String content) {
        this.versionId = versionId;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public int getVersionId() {
        return versionId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Version ID: " + versionId +
                " | Time: " + timestamp +
                " | Content: " + content;
    }
}

