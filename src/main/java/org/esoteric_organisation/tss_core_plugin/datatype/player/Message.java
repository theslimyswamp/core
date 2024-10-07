package org.esoteric_organisation.tss_core_plugin.datatype.player;

public enum Message {
    // -- The Slimy Swamp Messages

    // - General
    THE_SLIMY_SWAMP,
    NONEXISTENT_PLAYER,
    RANK_REQUIRED,
    CLOSE,
    INFO,
    TIPS_AND_TRICKS,

    // - TSS-Core
    UNABLE_TO_LOAD_DATA,

    // - TSS-SlimeLabs
    ACTIVE_LAUNCH_ANALYSIS_TASK,
    LAUNCH,
    VIEW_LAUNCH_STATISTICS,
    STOP_LAUNCH_ANALYSIS,
    ENTITY,
    TIME,
    ON_GROUND,

    NO_ANALYSIS_TASK,
    LAUNCH_STATISTICS,

    CHUNK_PERSISTENT_DATA_CONTAINER,

    // - TSS-Lobby
    WELCOME_SUBTITLE,
    WELCOME_CHAT_MESSAGE,

    // Cosmetics
    COSMETICS,

    COSMETICS_ITEM_DISPLAY_NAME,
    COSMETICS_ITEM_DESCRIPTION,

    HATS,

    HATS_ITEM_DISPLAY_NAME,
    HATS_ITEM_DESCRIPTION,

    TRAILS,

    TRAILS_ITEM_DISPLAY_NAME,
    TRAILS_ITEM_DESCRIPTION,

    LOCKED,
    COSMETIC_IS_LOCKED,

    CLICK_TO_EQUIP,
    CLICK_TO_UNEQUIP,

    EQUIPPED_COSMETIC,
    UNEQUIPPED_COSMETIC,

    TOP_HAT_DISPLAY_NAME,
    TOP_HAT_DESCRIPTION,

    TIGER_HAT_DISPLAY_NAME,
    TIGER_HAT_DESCRIPTION,

    DOG_HAT_DISPLAY_NAME,
    DOG_HAT_DESCRIPTION,

    HEART_TRAIL_DISPLAY_NAME,
    HEART_TRAIL_DESCRIPTION,

    FIRE_TRAIL_DISPLAY_NAME,
    FIRE_TRAIL_DESCRIPTION,

    WATER_TRAIL_DISPLAY_NAME,
    WATER_TRAIL_DESCRIPTION,

    BUBBLE_TRAIL_DISPLAY_NAME,
    BUBBLE_TRAIL_DESCRIPTION,

    EXPLOSIVE_TRAIL_DISPLAY_NAME,
    EXPLOSIVE_TRAIL_DESCRIPTION,

    SLIME_TRAIL_DISPLAY_NAME,
    SLIME_TRAIL_DESCRIPTION,

    // - TSS-Ranks
    NONEXISTENT_RANK,
    RANK_ALREADY_SET,
    RANK_ALREADY_SET_OTHER,
    RANK_SUCCESSFULLY_SET,
    RANK_SUCCESSFULLY_SET_OTHER,
    RANK_SET_NOTIFICATION,

    // - TSS-Survival
    CHUNK_ALREADY_CLAIMED,
    CANT_CLAIM_HERE,
    NOT_ENOUGH_CHUNKS,
    CHUNK_CLAIMED_SUCCESSFULLY,

    UNCLAIM_CHUNK_LOCATION_ALL,
    UNCLAIM_CHUNK_LOCATION_CONNECTED,
    UNCLAIM_CHUNK_LOCATION_CHUNK,

    CHUNK_NOT_CLAIMED,
    NOT_YOUR_CHUNK,
    CLAIMED_TOO_RECENTLY,
    FOUND_NO_CHUNKS,
    UNCLAIMED_CHUNK,

    TRUSTED_PLAYER,
    TRUSTED_PLAYERS,
    UNCLAIM,

    TRUST_PLAYER_LOCATION_ALL,
    TRUST_PLAYER_LOCATION_CONNECTED,
    TRUST_PLAYER_LOCATION_CHUNK,

    CANT_TRUST_YOURSELF,
    PLAYER_ALREADY_TRUSTED,
    PLAYER_SUCCESSFULLY_TRUSTED,

    UNTRUST_PLAYER_LOCATION_ALL,
    UNTRUST_PLAYER_LOCATION_CONNECTED,
    UNTRUST_PLAYER_LOCATION_CHUNK,

    CANT_UNTRUST_YOURSELF,
    PLAYER_SUCCESSFULLY_UNTRUSTED,

    CANT_INTERACT_BECAUSE_CHUNK_CLAIMED,

    SURVIVAL_SCOREBOARD_TITLE,

    WILDERNESS,
    PLAYER_CLAIM,


    CANT_PLACE_IN_WILDERNESS,
    CANT_BREAK_IN_WILDERNESS,

    START_OF_SKILL_ADVENTURE,

    COMBAT,
    COMBAT_DESCRIPTION,
    COMBAT_INFO,
    COMBAT_TIPS_TRICKS,

    MINING,
    MINING_DESCRIPTION,
    MINING_INFO,
    MINING_TIPS_TRICKS,

    FORAGING,
    FORAGING_DESCRIPTION,
    FORAGING_INFO,
    FORAGING_TIPS_TRICKS,

    FARMING,
    FARMING_DESCRIPTION,
    FARMING_INFO,
    FARMING_TIPS_TRICKS,

    ENCHANTING,
    ENCHANTING_DESCRIPTION,
    ENCHANTING_INFO,
    ENCHANTING_TIPS_TRICKS,

    ALCHEMY,
    ALCHEMY_DESCRIPTION,
    ALCHEMY_INFO,
    ALCHEMY_TIPS_TRICKS,

    FISHING,
    FISHING_DESCRIPTION,
    FISHING_INFO,
    FISHING_TIPS_TRICKS,

    FORGING,
    FORGING_DESCRIPTION,
    FORGING_INFO,
    FORGING_TIPS_TRICKS,

    SKILL_LEVEL_UP,

    CANT_TRADE_WITH_YOURSELF,
    SENT_TRADE_REQUEST,
    TRADING_GUI_TITLE,

    // TSS-Social
    CANT_MESSAGE_YOURSELF,
    YOU,
    NO_RECENT_MESSAGES,

    CANT_PARTY_YOURSELF,
    INVITED_TO_PARTY,
    NO_PARTY_INVITES,
    ACCEPT_PARTY_INVITE,
    ACCEPT,
    JOINED_PARTY,
    PLAYER_JOINED_PARTY,
    NOT_IN_PARTY,
    NOT_YOUR_PARTY,
    PLAYER_ALREADY_INVITED,
    PLAYER_NOT_IN_PARTY,
    KICKED_FROM_PARTY,
    SUCCESSFUL_PARTY_PLAYER_KICK,
    CANT_KICK_YOURSELF,
    ALREADY_IN_PARTY,
    LEFT_PARTY,
    PLAYER_LEFT,
    PARTY_DISBANDED,
    YOU_ARE_NEW_PARTY_OWNER,
    NEW_PARTY_OWNER,
    PLAYER_DISCONNECTED_FROM_PARTY,
    PLAYER_KICKED_BY_DISCONNECT,
    PLAYER_HAS_REJOINED,

    ALL_CHAT,
    ALL_CHAT_SHORT_NAME,
    ALL_CHAT_DESCRIPTION,

    PARTY_CHAT,
    PARTY_CHAT_SHORT_NAME,
    PARTY_CHAT_DESCRIPTION,

    MESSAGE_CHAT,
    MESSAGE_CHAT_SHORT_NAME,
    MESSAGE_CHAT_DESCRIPTION,

    CHAT_MODE_ALREADY_SELECTED,
    CHAT_MODE_SUCCESSFULLY_SELECTED;

    private final String key;

    Message() {
        key = name().toLowerCase().replace('_', '-');
    }

    public String getKey() {
        return key;
    }
}
