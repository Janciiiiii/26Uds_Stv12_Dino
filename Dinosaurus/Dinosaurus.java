import java.awt.Graphics;
import java.awt.Rectangle;

public class Dinosaurus {

    private int x;
    private int y;
    private int sirka;
    private int vyska;

    private int rychlostSkoku;
    private boolean skace;
    
    private int yNaZemi;

    public Dinosaurus() {
        this.x = 50;
        this.y = 200;
        this.sirka = 40;
        this.vyska = 40;
        this.rychlostSkoku = 0;
        this.skace = false;
        this.yNaZemi = 200;
    }
    
        public void jump() {
        if (!this.skace) {
            this.rychlostSkoku = -12;
            this.skace = true;
        }
    }
    
        public void update() {
        if (this.skace) {
            this.y += this.rychlostSkoku;
            this.rychlostSkoku += 1;
    
            if (this.y >= this.yNaZemi) {
                this.y = this.yNaZemi;
                this.rychlostSkoku = 0;
                this.skace = false;
            }
        }
    }
    
        public void draw(Graphics g) {
        g.fillRect(this.x, this.y, this.sirka, this.vyska);
    }
    
        public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.sirka, this.vyska);
    }
    
}