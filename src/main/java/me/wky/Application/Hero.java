package me.wky.Application;

public class Hero {
    private String name;
    private int age;
    private String heroType;
    private String attackType;

    public Hero(String name, int age, int heroType) {
        this.name = name;
        this.age = age;
        switch (heroType){
            case 1:
                this.heroType = "guerreiro";
                this.attackType = "espada";
                break;
            case 2:
                this.heroType = "mago";
                this.attackType = "magia";
                break;
            case 3:
                this.heroType = "monge";
                this.attackType = "artes marciais";
                break;
            case 4:
                this.heroType = "ninja";
                this.attackType = "shuriken";
                break;
        }

    }

    public void attack(){
        System.out.println("O " + heroType + " " + name + " atacou usando " + attackType);
    }

}
