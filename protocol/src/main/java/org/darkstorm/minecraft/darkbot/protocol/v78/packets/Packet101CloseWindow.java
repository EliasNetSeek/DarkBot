package org.darkstorm.minecraft.darkbot.protocol.v78.packets;

import org.darkstorm.minecraft.darkbot.protocol.*;

import java.io.*;

public class Packet101CloseWindow extends AbstractPacket implements
		ReadablePacket, WriteablePacket {
	public int windowId;

	public Packet101CloseWindow() {
	}

	public Packet101CloseWindow(int par1) {
		windowId = par1;
	}

	public void readData(DataInputStream in) throws IOException {
		windowId = in.readByte();
	}

	public void writeData(DataOutputStream out) throws IOException {
		out.writeByte(windowId);
	}

	@Override
	public int getId() {
		return 101;
	}
}