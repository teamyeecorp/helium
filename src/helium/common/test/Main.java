package helium.common.test;

import helium.common.map.EnumBlock;
import helium.common.map.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		String tmp = "0000000110000000011001000001100111111112010000011001000000000101001001000100100100010010010001001001";
		Map mp = Map.load(tmp);
		EnumBlock[] blocks = mp.getBlocks();
		int j = 0;
		for (int i = 0; i < blocks.length; i++) {
			EnumBlock block = blocks[i];
			System.out.print(block.ordinal());
			j++;
			if (j == Map.MAP_WIDTH) {
				System.out.print("\n");
				j = 0;
			}
		}
	}
}
