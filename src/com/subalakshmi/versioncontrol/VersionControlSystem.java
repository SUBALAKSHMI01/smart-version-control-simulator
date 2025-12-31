package com.subalakshmi.versioncontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class VersionControlSystem {

    // Data Structures
    private List<Version> versionList;
    private Stack<Version> versionStack;
    private Map<Integer, Version> versionMap;

    // Constructor
    public VersionControlSystem() {
        versionList = new ArrayList<>();
        versionStack = new Stack<>();
        versionMap = new HashMap<>();
    }

    // DAY 3: Commit a new version
    public void commit(String content) {
        int newVersionId = versionList.size() + 1;
        Version version = new Version(newVersionId, content);

        versionList.add(version);
        versionStack.push(version);
        versionMap.put(newVersionId, version);
    }

    // DAY 4: Undo last version (Stack)
    public void undoLastVersion() {
        if (versionStack.isEmpty()) {
            System.out.println("No versions to undo.");
            return;
        }

        Version lastVersion = versionStack.pop();
        versionList.remove(lastVersion);
        versionMap.remove(lastVersion.getVersionId());

        System.out.println("Undo successful: Version " + lastVersion.getVersionId());
    }

    // DAY 5: Retrieve version by ID (HashMap → O(1))
    public Version getVersionById(int id) {
        return versionMap.get(id);
    }

    // DAY 6: Show version history (Ordered)
    public void showVersionHistory() {
        if (versionList.isEmpty()) {
            System.out.println("No versions available.");
            return;
        }

        System.out.println("=== Version History ===");
        for (Version v : versionList) {
            System.out.println(
                    "Version ID: " + v.getVersionId() +
                            " | Time: " + v.getTimestamp() +
                            " | Content: " + v.getContent()
            );
        }
    }
}
