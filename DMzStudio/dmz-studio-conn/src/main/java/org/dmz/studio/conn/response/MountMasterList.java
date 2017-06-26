package org.dmz.studio.conn.response;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.collectable.Mount;

public class MountMasterList extends AbstractResponse {
    private List<Mount> mounts;

    public List<Mount> getMounts() {
        return mounts;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }
}
