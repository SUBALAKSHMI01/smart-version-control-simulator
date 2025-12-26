package com.subalakshmi.versioncontrol;

public class Main {
    public static void main(String[] args) {

        VersionControlSystem vcs = new VersionControlSystem();

        vcs.commit("Initial version");
        vcs.commit("Added login feature");
        vcs.commit("Fixed bugs");

        System.out.println("Version History:");
        vcs.showHistory();
    }
}

