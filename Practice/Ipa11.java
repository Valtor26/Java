package Practice;

import java.util.Scanner;

class Player{
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public Player(int playerId, String skill, String level, int points){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId(){
        return this.playerId;
    }

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getSkill(){
        return this.skill;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }

    public String getLevel(){
        return this.level;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public int getPoints(){
        return this.points;
    }

    public void setPoints(int points){
        this.points = points;
    }
}

public class Ipa11{
    public static int findPointsForGivenSkill(Player p[], String skill){
        int pointsSum = 0;

        for(Player pl : p){
            if(pl.getSkill().equalsIgnoreCase(skill)){
                pointsSum += pl.getPoints();
            }
        }
        if(pointsSum == 0) return 0;

        return pointsSum;
    }

    public static Player getPlayerBasedOnLevel(String level,String skill, Player p[]){
        for(Player pl : p){
            if(pl.getLevel().equalsIgnoreCase(level) && pl.getSkill().equalsIgnoreCase(skill) && pl.getPoints() >= 20) return pl;
        }

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Player p[] = new Player[n];

        for(int i=0;i<n;i++){
            int playerId = sc.nextInt(); sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt(); sc.nextLine();

            p[i] = new Player(playerId, skill, level, points);
        }

        String searchSkill = sc.nextLine();
        String searchLevel = sc.nextLine();

        int getPoints = findPointsForGivenSkill(p, searchSkill);
        Player pObj = getPlayerBasedOnLevel(searchLevel, searchSkill, p);

        if(getPoints > 0){
            System.out.println(getPoints);
        } else{
            System.out.println("The given Skill is not available");
        }
        
        if(pObj != null){
            System.out.println(pObj.getPlayerId());
        }else{
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }
}