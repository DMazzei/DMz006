package org.dmz.studio.WoWConn.constants;

import org.dmz.studio.WoWConn.response.*;
import org.dmz.studio.WoWConn.response.data.*;
import org.dmz.studio.WoWConn.response.data.character.*;
import org.dmz.studio.WoWConn.response.data.guild.*;

import java.util.Arrays;
import java.util.List;

public enum RequestType {
    CHARACTER("wow/character/<realm>/<characterName>", CharacterProfile.class, RequestParams.REALM, RequestParams.CHARACTER_NAME),
    CHALLENGE_MODE_REALM_LEADERBOARD("wow/challenge/<realm>", RealmLeaderboard.class, RequestParams.REALM),
    ACHIEVEMENT("wow/achievement/<id>", Achievement.class, RequestParams.ID),
    BOSS("wow/boss/<id>", Boss.class, RequestParams.ID),
    BOSS_MASTER_LIST("wow/boss/", BossMasterList.class),
    GUILD("wow/guild/<realm>/<guildName>", GuildProfile.class, RequestParams.REALM, RequestParams.GUILD_NAME),
    MOUNT_MASTER_LIST("wow/mount/", MountMasterList.class),
    PET_MASTER_LIST("wow/pet/", PetMasterList.class),
    PET_SPECIES("wow/pet/species/<id>", PetSpecies.class, RequestParams.ID),
    PET_ABILITY("wow/pet/ability/<id>", PetAbility.class, RequestParams.ID),
    PET_STATS("wow/pet/stats/<id>", PetStats.class, RequestParams.ID),
    LEADERBOARD("wow/leaderboard/<bracket>", Leaderboard.class, RequestParams.BRACKET),
    QUEST("wow/quest/<id>", Quest.class, RequestParams.ID),
    REALM_STATUS("wow/realm/status", RealmStatus.class),
    RECIPE("wow/recipe/<id>", Recipe.class, RequestParams.ID),
    SPELL("wow/spell/<id>", Spell.class, RequestParams.ID),
    ZONE_MASTER_LIST("wow/zone/", ZoneMasterList.class),
    ZONE("wow/zone/<id>", Zone.class, RequestParams.ID),
    DATA_BATTLEGROUPS("wow/data/battlegroups", Battlegroups.class),
    DATA_CHARACTER_RACES("wow/data/character/races", Races.class),
    DATA_CHARACTER_CLASSES("wow/data/character/classes", Classes.class),
    DATA_CHARACTER_ACHIEVEMENTS("wow/data/character/achievements", org.dmz.studio.WoWConn.response.data.character.Achievements.class),
    DATA_GUILD_REWARDS("wow/data/guild/rewards", Rewards.class),
    DATA_GUILD_PERKS("wow/data/guild/perks", Perks.class),
    DATA_GUILD_ACHIEVEMENTS("wow/data/guild/achievements", org.dmz.studio.WoWConn.response.data.guild.Achievements.class),
    DATA_ITEM_CLASSES("wow/data/item/classes", org.dmz.studio.WoWConn.response.data.item.Classes.class),
    DATA_TALENTS("wow/data/talents", Talents.class),
    DATA_PET_TYPES("wow/data/pet/types", PetTypes.class);

    private String dir;
    private Class responseType;
    private List<RequestParams> requiredParams;

    RequestType(String dir, Class responseType, RequestParams... requiredParams) {
        this.dir = dir;
        this.responseType = responseType;
        this.requiredParams = Arrays.asList(requiredParams);
    }

    public String getDir() {
        return dir;
    }

    public Class getResponseType() {
        return responseType;
    }

    public List<RequestParams> getRequiredParams() {
        return requiredParams;
    }
}