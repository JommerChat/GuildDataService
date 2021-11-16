package com.parlantos.guild.dto;

import com.parlantos.guild.models.DiscordGuild;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class DiscordDto {

  private final Logger logger = LoggerFactory.getLogger(DiscordDto.class);

  @Value("${discord_bot.baseUrl:http://192.168.1.49:8093/discord}")
  private String discordBotUrl;

  private final WebClient webClient = WebClient.create();

  public Mono<DiscordGuild> fetchGuildInfo(String guildId) {
    logger.info("Fetching the guild info for guildID: {}", guildId);
    String targetUrl = discordBotUrl + "/server/" + guildId;
    return this.webClient.get()
            .uri(targetUrl)
            .retrieve()
            .bodyToMono(DiscordGuild.class);
  }


}
