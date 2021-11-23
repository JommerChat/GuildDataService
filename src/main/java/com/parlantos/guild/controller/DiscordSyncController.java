package com.parlantos.guild.controller;

import com.parlantos.guild.models.entities.TextChannelEntity;
import com.parlantos.guild.service.DiscordSyncService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.ValidationException;
import java.util.List;

@RequestMapping("/guild/data/discord/sync")
@Controller
public class DiscordSyncController {

  private DiscordSyncService discordSyncService;

  DiscordSyncController(DiscordSyncService discordSyncService) {
    this.discordSyncService = discordSyncService;
  }

  @GetMapping("/importTextChannels")
  public ResponseEntity<List<TextChannelEntity>> importAllDiscordChannels(@RequestParam String guildId,
                                                                        @RequestParam String discordGuildId) throws ValidationException {
    return new ResponseEntity<>(this.discordSyncService.importAllDiscordChannels(guildId, discordGuildId), HttpStatus.OK);
  }
}
