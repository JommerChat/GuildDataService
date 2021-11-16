package com.parlantos.guild.models.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class DiscordMessageId implements Serializable {

  private MessageEntity messageEntity;

  private BigInteger discordMessageId;

  public void setMessageId(MessageEntity messageId) {
    this.messageEntity = messageId;
  }

  public DiscordMessageId(MessageEntity messageId, BigInteger discordMessageId) {
    this.messageEntity = messageId;
    this.discordMessageId = discordMessageId;
  }

  public MessageEntity getMessageId() {
    return messageEntity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscordMessageId that = (DiscordMessageId) o;
    return Objects.equals(messageEntity, that.messageEntity) && Objects.equals(discordMessageId, that.discordMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageEntity, discordMessageId);
  }

  public BigInteger getDiscordMessageId() {
    return discordMessageId;
  }

  public void setDiscordMessageId(BigInteger discordMessageId) {
    this.discordMessageId = discordMessageId;
  }

}
