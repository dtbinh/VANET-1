import java.io.*; 
		DatagramSocket echoSocket = new DatagramSocket(); 
	    byte[] outData = new byte[1400]; 
		int inPacketLength;
		while ((userInput = stdIn.readLine()) != null) { 
		  	DatagramPacket outPacket = new DatagramPacket(outData, outData.length, serverIPAddress, 2000); 
			System.out.println("OutData length:" + outData.length);
	  		inPacketLength = inPacket.getLength();
	  		System.out.println("Echo from UDP Server: " + echoString); 