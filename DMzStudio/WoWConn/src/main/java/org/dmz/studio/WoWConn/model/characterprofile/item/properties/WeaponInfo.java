package org.dmz.studio.WoWConn.model.characterprofile.item.properties;

import org.dmz.studio.WoWConn.model.characterprofile.item.properties.weapon.Damage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeaponInfo {
    private Damage damage;
    private float weaponSpeed;
    private float dps;

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public float getWeaponSpeed() {
        return weaponSpeed;
    }

    public void setWeaponSpeed(float weaponSpeed) {
        this.weaponSpeed = weaponSpeed;
    }

    public float getDps() {
        return dps;
    }

    public void setDps(float dps) {
        this.dps = dps;
    }
}
