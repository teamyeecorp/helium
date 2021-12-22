package helium.common.packet;

class TimePacket implements Serializable {
  protected int time;

  public TimePacket(final int time) {
    this.time = time;
  }
}
