import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Accessorytype implements Serializable {
	Image aImage;
	int id;
	boolean beequipment;
	Bullettype btype;
	boolean stoneDirect;
	
	public Accessorytype(int id_in,Image aImage_in){
		id=id_in;
		aImage=aImage_in;
		beequipment = false;
	}
	public Accessorytype(int id_in,Image aImage_in,boolean stoneDirect_in){
		id=id_in;
		aImage=aImage_in;
		beequipment=false;
		stoneDirect=stoneDirect_in;
	}
	public Accessorytype(int id_in,Image aImage_in,Bullettype btype_in){
		id=id_in;
		aImage=aImage_in;
		beequipment=true;
		btype=btype_in;
	}

	
}
