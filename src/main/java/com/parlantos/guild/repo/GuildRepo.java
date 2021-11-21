package com.parlantos.guild.repo;

import com.parlantos.guild.models.entities.GuildEntity;
import com.parlantos.guild.models.entities.MessageEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;

public interface GuildRepo extends CrudRepository<GuildEntity, BigInteger> {

    @Query(value = "SELECT * FROM guild g where g.public = true LIMIT :limit", nativeQuery = true)
    List<GuildEntity> findRecentMessagesWithLimit(@Param("limit") BigInteger limit);
}
