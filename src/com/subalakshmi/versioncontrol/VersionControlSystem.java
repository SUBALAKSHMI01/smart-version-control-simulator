package com.subalakshmi.versioncontrol;

import java.util.*;

public class VersionControlSystem {

    private List<Version> versionList = new ArrayList<>();
    private Stack<Version> versionStack = new Stack<>();
    private Map<Integer, Version> versionMap = new HashMap<>();

    public void commit(String content) {
        int newVersionId = versionList.size() + 1;

        Version version = new Version(newVersionId, content);

        versionList.add(version);
        versionStack.push(version);
        versionMap.put(newVersionId, version);
    }


    public Version getVersionById(int id) {
        return versionMap.get(id);
    }

    public void showHistory() {
        for (Version v : versionList) {
            System.out.println(v);
        }
    }
}
