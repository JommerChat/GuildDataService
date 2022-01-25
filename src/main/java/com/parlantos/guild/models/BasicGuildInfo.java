package com.parlantos.guild.models;

import com.parlantos.guild.models.entities.TextChannelEntity;
import com.parlantos.guild.models.entities.VoiceChannelEntity;

import java.math.BigInteger;
import java.util.List;

/**
 * Guild info object that contains the basic guild info for initially providing the display of all of the guilds
 */
public class BasicGuildInfo {

    List<TextChannelEntity> textChannelEntity;
    List<VoiceChannelEntity> voiceChannelEntity;
    int currentTextChannelIndex;
    String name;
    String icon;
    String description;
    BigInteger id;

    public List<TextChannelEntity> getTextChannelEntity() {
        return textChannelEntity;
    }

    public void setTextChannelEntity(List<TextChannelEntity> textChannelEntity) {
        this.textChannelEntity = textChannelEntity;
    }

    public List<VoiceChannelEntity> getVoiceChannelEntity() {
        return voiceChannelEntity;
    }

    public void setVoiceChannelEntity(List<VoiceChannelEntity> voiceChannelEntity) {
        this.voiceChannelEntity = voiceChannelEntity;
    }

    public int getCurrentTextChannelIndex() {
        return currentTextChannelIndex;
    }

    public void setCurrentTextChannelIndex(int currentTextChannelIndex) {
        this.currentTextChannelIndex = currentTextChannelIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
