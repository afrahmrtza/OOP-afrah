public class Player {
    String name = "maritt";
    int x;
    int y;
    int health = 100;
    int speed = 1;
    int dash = 5;
    int attack = 2;
    int defense = 10;
    boolean firstSkill = true;
    boolean secondSKill = true;
    boolean ultimateSkill = true;

    public void getInfo(){
        System.out.println("Player Information nickname : " + name + "\nPosisi x = " + x + "\nPosisi y = " + y + "\nhealth " + health + "\nspeed " + speed + "\nattack " + attack + "\ndefense " + defense);
    }
    public void moveRight(){
        x = x + speed;
        System.out.println("Posisi player " + name + " bertambah " + x );
    }
    public void moveLeft(){
        x = x - speed;
        System.out.println("Posisi player " + name + " berkurang " + x );
    }
    public void moveUp(){
        y = y + speed;
        System.out.println("Posisi player " + name + " bertambah " + y );
    }
    public void moveDown(){
        y = y - speed;
        System.out.println("Posisi player " + name + " berkurang " + y );
    }
    public void getDamage(){
        health = health - 2;
        defense = defense - 1;
        System.out.println("Player Terkena Damage, health = " + health + " defense " + defense);
    }
    public void getPower(){
        attack = attack + 5;
        System.out.println("Player mendapatkan power = " + attack);
    }
    public int attack(){
        System.out.println("Player mengeluarkan damage =  " + attack);
        return attack * 2;
    }
    public void dash(){
        System.out.println("Player menggunakan dash " + dash);
    }
    public void isDead(){
        health = 0;
        System.out.println("Player mati terbunuh health = " + health);
    }
    public void isRespawn(){
        health = 100;
        System.out.println("Player hidup kembali health = " + health);
    }
    public void firstSkill(){
        attack = 4;
        System.out.println("Player menggunakan skill satu " + firstSkill + ", attack = " + attack);
    }
    public void secondSKill(){
        attack = 7;
        System.out.println("Player menggunakan skill dua " + secondSKill + ",  attack = "  + attack);
    }
    public void ultimateSkill(){
        attack = 10;
        System.out.println("Player menggunakan ultimate " + ultimateSkill + ",  attack = "  + attack);
    }
}
