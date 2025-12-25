package com.subalakshmi.versioncontrol;

public class Version {

        private int versionId;
        private String content;
        private String timestamp;

        public Version(int versionId, String content, String timestamp) {
            this.versionId = versionId;
            this.content = content;
            this.timestamp = timestamp;
        }

        public int getVersionId() {
            return versionId;
        }

        public String getContent() {
            return content;
        }

        public String getTimestamp() {
            return timestamp;
        }


}
