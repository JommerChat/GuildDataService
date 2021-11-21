package com.parlantos.guild.models.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@IdClass(GuildMemberId.class)
@Table(name = "guild_member")
public class GuildMemberEntity {

  @Id
  @ManyToOne
  @JoinColumn(name = "member_id", nullable = false, referencedColumnName = "id")
  private MemberEntity memberEntity;

  @Id
  @ManyToOne
  @JoinColumn(name = "guild_id", nullable = false, referencedColumnName = "id")
  private GuildEntity guildEntity;

  @Column(name = "id")
  private BigInteger id;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  public MemberEntity getMemberEntity() {
    return memberEntity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GuildMemberEntity that = (GuildMemberEntity) o;
    return Objects.equals(memberEntity, that.memberEntity) && Objects.equals(guildEntity, that.guildEntity) && Objects.equals(id, that.id) && Objects.equals(createdAt, that.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberEntity, guildEntity, id, createdAt);
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

  public BigInteger getId() {
    return id;
  }

  public void setId(BigInteger id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
