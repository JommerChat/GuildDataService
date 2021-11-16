package com.parlantos.guild.service;

import com.parlantos.guild.dto.DiscordDto;
import com.parlantos.guild.models.DiscordGuild;
import com.parlantos.guild.models.entities.GuildEntity;
import com.parlantos.guild.models.entities.TextChannelEntity;
import com.parlantos.guild.repo.GuildRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiscordSyncService {

  private GuildRepo guildRepo;
  private GuildService guildService;
  private DiscordDto discordGuildDto;

  Logger logger = LoggerFactory.getLogger(DiscordSyncService.class);

  DiscordSyncService(GuildRepo guildRepo, GuildService guildService, DiscordDto discordGuildDto) {
    this.guildRepo = guildRepo;
    this.guildService = guildService;
    this.discordGuildDto = discordGuildDto;
  }

  public List<TextChannelEntity> importAllDiscordChannels(String guildId, String discordGuildId) throws ValidationException {
    //find the guild entity that text channels will be added to
    GuildEntity guildEntity = this.guildRepo.findById(new BigInteger(guildId)).orElseThrow(() -> new ValidationException("The guild id does not exist"));

    DiscordGuild discordGuild = this.discordGuildDto.fetchGuildInfo(discordGuildId).block();

    return new ArrayList<TextChannelEntity>();
  }
}
