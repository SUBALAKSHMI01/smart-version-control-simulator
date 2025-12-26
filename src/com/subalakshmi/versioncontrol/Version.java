package com.subalakshmi.versioncontrol;

import java.time.LocalDateTime;

public class Version {

    private int versionId;
    private String content;
    private LocalDateTime timestamp;

    public Version(int versionId, String content, LocalDateTime timestamp) {
        this.versionId = versionId;
        this.content = content;
        this.timestamp = timestamp;
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
        return "Version{" +
                "id=" + versionId +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
