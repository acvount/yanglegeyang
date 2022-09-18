public class SheepApplication {

    // 替换你的token

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new GameServer().start();
        }
    }

}
