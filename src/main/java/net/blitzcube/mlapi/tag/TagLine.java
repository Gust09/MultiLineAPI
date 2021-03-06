package net.blitzcube.mlapi.tag;

import com.google.common.collect.Maps;
import net.blitzcube.mlapi.util.PacketUtil;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

/**
 * Class by iso2013 @ 2017.
 * <p>
 * Licensed under LGPLv3. See LICENSE.txt for more information.
 * You may copy, distribute and modify the software provided that modifications are described and licensed for free
 * under LGPL. Derivatives works (including modifications or anything statically linked to the library) can only be
 * redistributed under LGPL, but applications that use the library don't have to be.
 */

public abstract class TagLine {
    private Map<UUID, PacketUtil.FakeEntity> line = Maps.newHashMap();
    private String cached;

    final PacketUtil.FakeEntity getLine(UUID entity) {
        return this.line.get(entity);
    }

    final void setLine(PacketUtil.FakeEntity line, UUID entity) {
        this.line.put(entity, line);
    }

    final PacketUtil.FakeEntity removeLine(UUID entity) {
        return this.line.remove(entity);
    }

    final String getCached() {
        return cached;
    }

    final void setCached(String cached) {
        this.cached = cached;
    }

    public abstract String getText(Player forWho);

    public boolean keepSpaceWhenNull() {return false;}
}
