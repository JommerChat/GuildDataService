package com.parlantos.guild.models.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class GuildMemberId implements Serializable {

  private MemberEntity memberEntity;

  private GuildEntity guildEntity;

  public MemberEntity getMemberEntity() {
    return memberEntity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GuildMemberId that = (GuildMemberId) o;
    return memberEntity.equals(that.memberEntity) && guildEntity.equals(that.guildEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberEntity, guildEntity);
  }

  public void setMemberEntity(MemberEntity memberEntity) {
    this.memberEntity = memberEntity;
  }

  public GuildEntity getGuildEntity() {
    return guildEntity;
  }

  public void setGuildEntity(GuildEntity guildEntity) {
    this.guildEntity = guildEntity;
  }
}
