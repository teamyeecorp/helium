package helium.common.packet;

import java.io.Serializable;

class MapPacket implements Serializable {
  protected String mapData;

  public MapPacket(final String mapData) {
    this.mapData = mapData;
  }
  
}
