import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class fieldmode implements Serializable {
    boolean biperson;//˫��ģʽ
    boolean endless;//�޾�ģʽ
    boolean advance;//����ģʽ
    int degree;//�Ѷ�
    int id;

    public fieldmode(int id_in, int difficulty) {
        biperson = false;
        endless = true;
        advance = false;
        this.id = id_in;

        degree = difficulty;
    }

}
