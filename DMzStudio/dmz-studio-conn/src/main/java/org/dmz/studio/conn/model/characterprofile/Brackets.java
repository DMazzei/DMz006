package org.dmz.studio.conn.model.characterprofile;

import org.dmz.studio.conn.model.characterprofile.pvp.Bracket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Brackets {
    private Bracket twoVsTwo;

    private Bracket twoVsTwoSkirmish;

    private Bracket threeVsThree;

    private Bracket rbg;

    private Bracket unknown;

    public Bracket getTwoVsTwo() {
        return twoVsTwo;
    }

    public void setTwoVsTwo(Bracket twoVsTwo) {
        this.twoVsTwo = twoVsTwo;
    }

    public Bracket getTwoVsTwoSkirmish() {
        return twoVsTwoSkirmish;
    }

    public void setTwoVsTwoSkirmish(Bracket twoVsTwoSkirmish) {
        this.twoVsTwoSkirmish = twoVsTwoSkirmish;
    }

    public Bracket getThreeVsThree() {
        return threeVsThree;
    }

    public void setThreeVsThree(Bracket threeVsThree) {
        this.threeVsThree = threeVsThree;
    }

    public Bracket getRbg() {
        return rbg;
    }

    public void setRbg(Bracket rbg) {
        this.rbg = rbg;
    }

    public Bracket getUnknown() {
        return unknown;
    }

    public void setUnknown(Bracket unknown) {
        this.unknown = unknown;
    }
}
