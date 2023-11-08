package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
  |Author: Skylifee7|
 */

public class Player {

    @SerializedName("FBIRaidChance")
    @Expose
    private String fBIRaidChance;
    @SerializedName("drugRate")
    @Expose
    private double drugRate;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("health")
    @Expose
    private double health;
    @SerializedName("inPrison")
    @Expose
    private boolean inPrison;
    @SerializedName("money")
    @Expose
    private double money;
    @SerializedName("upgrades")
    @Expose
    private ArrayList<Upgrade> upgrades;
    @SerializedName("achievements")
    @Expose
    private ArrayList<Achievement> achievements;
    @SerializedName("rank")
    @Expose
    private int rank;
    @SerializedName("experience")
    @Expose
    private int totalExperience;
    @SerializedName("bullet")
    @Expose
    private long bulletCount;

    /**
     * No args constructor for use in serialization
     */
    public Player() {

    }

    public static class Builder {

        private String playerName;
        private String fBIRaidChance;
        private double drugRate;
        private double health;
        private boolean inPrison;
        private double money;
        private ArrayList<Upgrade> upgrades;
        private ArrayList<Achievement> achievements;
        private int rank;
        private int totalExperience;
        private long bulletCount;


        public Builder name(String playerName) {
            this.name = playerName;
            return this;
        }

        public Builder fBIRaidChance(String fBIRaidChance) {
            this.fBIRaidChance = fBIRaidChance;
            return this;
        }

        public Builder inPrison(Boolean inPrison) {
            this.inPrison = inPrison;
            return this;
        }

        public Builder rank(int rank) {
            this.rank = rank;
            return this;
        }

        public Builder money(double money) {
            this.money = money;
            return this;
        }

        public Builder totalExperience(int totalExperience) {
            this.totalExperience = totalExperience;
            return this;
        }

        public Builder health(double health) {
            this.health = health;
            return this;
        }

        public Builder drugRate(double drugRate) {
            this.drugRate = drugRate;
            return this;
        }

        public Builder bulletCount(long bulletCount) {
            this.bulletCount = bulletCount;
            return this;
        }

        public Builder upgrades(ArrayList<Upgrade> upgrades) {
            this.upgrades = upgrades;
            return this;
        }

        public Builder achiements(ArrayList<Achievement> achievements) {
            this.achievements = achievements;
            return this;
        }


        public Player build() {
            return new Player(this);
        }

    }

    private Player(Builder builder) {

        playerName = builder.name;
        inPrison = builder.inPrison;
        money = builder.money;
        rank = builder.rank;
        totalExperience = builder.totalExperience;
        health = builder.health;
        fBIRaidChance = builder.fBIRaidChance;
        drugRate = builder.drugRate;
        bulletCount = builder.bulletCount;
        achievements = builder.achievements;
        upgrades = builder.upgrades;
    }


    /*
     *  Public accessors and mutators
     * to obey the encapsulation and information hiding principles.
     */

    public String getFBIRaidChance() {
        return fBIRaidChance;
    }

    public void setFBIRaidChance(String fBIRaidChance) {
        this.fBIRaidChance = fBIRaidChance;
    }

    public int getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }


    public double getDrugRate() {
        return drugRate;
    }

    public void setDrugRate(double drugRate) {
        this.drugRate = drugRate;
    }

    public String getFirstname() {
        return playerName;
    }

    public void setFirstname(String name) {
        this.name = playerName;
    }

    public double getHealth() {
        return health;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Boolean getInPrison() {
        return inPrison;
    }

    public void setInPrison(boolean inPrison) {
        this.inPrison = inPrison;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Upgrade> getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(ArrayList<Upgrade> upgrades) {
        this.upgrades = upgrades;
    }

    public ArrayList<Achievement> getAchiements() {
        return achievements;
    }

    public void setAchiements(ArrayList<Achievement> achiements) {
        this.achievements = achiements;
    }

    public void increment(TYPE type, int amount) {

        switch (type) {

            case MONEY:
                money += amount;
                break;

            case HEALTH:
                health += amount;
                break;

            case EXPERIENCE:
                totalExperience += amount;
                break;

            case RANK:
                rank++;
                break;

            default:
                totalExperience += amount;
                break;
        }
    }

    @Override
    public String toString() {

        return "Player{" +
                "playerName='" + playerName + '\'' +
                "rank=" + rank +
                ",money=" + money +
                "health=" + health +
                '}';
    }

    public enum TYPE {
        HEALTH, MONEY, EXPERIENCE, RANK
    }

}
