package com.subalakshmi.versioncontrol;

public class Main {
    public static void main(String[] args) {

        VersionControlSystem vcs = new VersionControlSystem();

        vcs.commit("Initial commit");
        vcs.commit("Added login feature");
        vcs.commit("Bug fixes");

        System.out.println("Version History:");
        vcs.showHistory();

        System.out.println("\nRetrieve Version by ID:");
        Version v = vcs.getVersionById(2);
        System.out.println(v);
    }
}
