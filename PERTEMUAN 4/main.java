public class main {
    public static void main(String[] args) throws Exception {
        gameplayer player=new gameplayer();
        player.setDimension(12,12);
        player.setPotition(10,220);
        System.out.println("Posisi Player: "+player.getx()+","+player.gety());
        player.run(12);
        System.out.println("Posisi Player: "+player.getx()+","+player.gety());
        
        gameplayer kawan=new gameplayer();
        kawan.setDimension(12,32);
        kawan.setPotition(10,10);
        
        gameenemy musuh=new gameenemy();
        musuh.setDimension(12,32);
        musuh.setPotition(10,10);
        
        gameenvironment scene = new gameenvironment();
        scene.addPlayer(player);
        scene.addPlayer(player);
        scene.addPlayer(kawan);
        scene.getAllPlayers();
        scene.removePlayer(player);
        scene.getAllPlayers();
        scene.addEnemy(musuh);
        scene.interaction();
    }
}