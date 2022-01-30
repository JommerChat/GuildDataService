package com.parlantos.guild.mappers;

import com.parlantos.guild.models.BasicGuildInfo;
import com.parlantos.guild.models.entities.GuildEntity;
import com.parlantos.guild.models.entities.TextChannelEntity;
import com.parlantos.guild.models.entities.VoiceChannelEntity;

import java.util.LinkedList;
import java.util.List;

public class GuildMapper {

    public static List<BasicGuildInfo> mapGuildsToBasicGuildInfo(List<GuildEntity> guildEntities,
                                                                 List<List<TextChannelEntity>> textChannels,
                                                                 List<List<VoiceChannelEntity>> voiceChannels) {
        List<BasicGuildInfo> basicGuildInfos = new LinkedList<>();
        var currentIndex = 0;
        for(var i : guildEntities) {
            BasicGuildInfo basicGuildInfo = new BasicGuildInfo();
            basicGuildInfo.setDescription(i.getDescription());
            basicGuildInfo.setIcon(i.getImage());
            basicGuildInfo.setId(i.getId());
            basicGuildInfo.setName(i.getName());
            basicGuildInfo.setCurrentTextChannelIndex(0); // change this when storing access history is implemented
            basicGuildInfo.setTextChannelEntity(textChannels.get(currentIndex));
            basicGuildInfo.setVoiceChannelEntity(voiceChannels.get(currentIndex));
            basicGuildInfos.add(basicGuildInfo);
            currentIndex++;
        }
        return basicGuildInfos;
    }
}
