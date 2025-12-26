package com.subalakshmi.versioncontrol;

import java.util.ArrayList;
import java.util.List;

public class VersionControlSystem {

    private List<Version> versions = new ArrayList<>();

    public void commit(String content) {
        int newVersionId = versions.size() + 1;
        versions.add(new Version(newVersionId, content));
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


