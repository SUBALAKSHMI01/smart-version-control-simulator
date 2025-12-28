package com.subalakshmi.versioncontrol;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VersionControlSystem {

    private List<Version> versions = new ArrayList<>();
    private Stack<Version> undoStack = new Stack<>();
    private Version currentVersion;

    public void createVersion(String content) {
        int newVersionId = versions.size() + 1;
        Version v = new Version(newVersionId, content, LocalDateTime.now());

        versions.add(v);
        undoStack.push(v);
        currentVersion = v;

        System.out.println("Created: " + v);
    }

    public void undoLastVersion() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
            return;
        }

        Version removed = undoStack.pop();
        versions.remove(removed);

        if (!undoStack.isEmpty()) {
            currentVersion = undoStack.peek();
            System.out.println("Undo successful. Current: " + currentVersion);
        } else {
            currentVersion = null;
            System.out.println("All versions removed.");
        }
    }

    public void showCurrentVersion() {
        if (currentVersion == null) {
            System.out.println("No current version.");
        } else {
            System.out.println("Current Version: " + currentVersion);
        }
    }
}
