package com.subalakshmi.versioncontrol;

public class Main {

    public static void main(String[] args) {

        VersionControlSystem vcs = new VersionControlSystem();

        vcs.createVersion("Initial version");
        vcs.createVersion("Added login feature");
        vcs.createVersion("Fixed bugs");

        vcs.showHistory();
    }
}


