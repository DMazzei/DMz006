package org.dmz.studio.WoWConn.response;

import org.dmz.studio.WoWConn.model.characterprofile.collectable.Mount;

import java.util.List;

public class MountMasterList extends AbstractResponse {
    private List<Mount> mounts;

    public List<Mount> getMounts() {
        return mounts;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }
}
