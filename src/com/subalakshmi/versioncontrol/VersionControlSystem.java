package com.subalakshmi.versioncontrol;

import java.util.ArrayList;
import java.util.List;

public class VersionControlSystem {

    private List<Version> versions = new ArrayList<>();

    public void commit(String content) {
        int newVersionId = versions.size() + 1;
        String timestamp = java.time.LocalDateTime.now().toString();
        versions.add(new Version(newVersionId, content, timestamp));
    }

    public void showHistory() {
        for (Version v : versions) {
            System.out.println(
                    "Version " + v.getVersionId() +
                            " | " + v.getTimestamp()
            );
        }
    }
}

