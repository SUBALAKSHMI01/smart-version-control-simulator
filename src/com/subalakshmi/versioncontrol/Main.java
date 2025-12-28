package com.subalakshmi.versioncontrol;

public class Main {
    public static void main(String[] args) {

        VersionControlSystem vcs = new VersionControlSystem();

        vcs.createVersion("Initial code");
        vcs.createVersion("Added login");
        vcs.createVersion("Bug fix");

        vcs.showCurrentVersion();

        vcs.undoLastVersion();
        vcs.showCurrentVersion();

        vcs.undoLastVersion();
        vcs.undoLastVersion();
        vcs.undoLastVersion(); // edge case
    }
}
