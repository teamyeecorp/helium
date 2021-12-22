package helium.common.map;

public class Map {
	
	protected EnumBlock[] blocks;
	/// the time in seconds
	protected int time;
	
	public Map(EnumBlock[] blocks) {
		this.blocks = blocks;
		this.time = 0;
	}
	
	@Override
	public String toString() {
		int j = 0;
		String s = "";
		for (EnumBlock block : this.blocks) {
			s += block.ordinal();
			j++;
			if (j == Map.MAP_WIDTH) {
				s += "\n";
				j = 0;
			}
		}
		return s;
	}
	
	public String serialize() {
		String s = "";
		for (EnumBlock block : this.blocks) {
			s += block.ordinal();
		}
		return s;
	}
	
	public static final int MAP_WIDTH = 10;
	public static  final int MAP_HEIGHT = 10;
	
	public static Map load(String map) throws Exception {
		char[] blockIds = map.toCharArray();
		EnumBlock[] blocks = new EnumBlock[MAP_WIDTH * MAP_HEIGHT];
		for (int i = 0; i < blockIds.length; i++) {
			char c = blockIds[i];
			int id = Integer.parseInt(Character.toString(c));
			if (id >= EnumBlock.values().length) {
				throw new Exception("unknown block id " + id);
			}
			EnumBlock block = EnumBlock.values()[id];
			blocks[i] = block;
		}
		
		return new Map(blocks);
	}

	public EnumBlock[] getBlocks() {
		return blocks;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}

}
