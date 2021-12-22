package helium.common.packet;

import java.io.Serializable;

class PositionPacket implements Serializable {
  protected short player;
  protected int x;
  protected int y;

  public PositionPacket(final short player, final short x, final short y) {
    this.player = player;
    this.x = x;
    this.y = y;
  }

}
