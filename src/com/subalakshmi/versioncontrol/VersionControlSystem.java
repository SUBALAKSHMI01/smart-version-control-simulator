package com.subalakshmi.versioncontrol;

import java.time.LocalDateTime;
import java.util.*;

public class VersionControlSystem {

    private List<Version> versionList = new ArrayList<>();
    private Map<Integer, Version> versionMap = new HashMap<>();
    private Stack<Version> versionStack = new Stack<>();

    public void createVersion(String content) {
        int newVersionId = versionList.size() + 1;

        Version version = new Version(
                newVersionId,
                content,
                LocalDateTime.now()
        );

        versionList.add(version);
        versionMap.put(newVersionId, version);
        versionStack.push(version);
    }

    public void showHistory() {
        System.out.println("Version History:");
        for (Version v : versionList) {
            System.out.println(v);
        }
    }
}
