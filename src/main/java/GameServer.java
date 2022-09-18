import util.HttpUtil;

public class GameServer extends Thread {

    @Override
    public void run() {
        while (true) {
            //替换你的token
            String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2OTQzNTQzNTUsIm5iZiI6MTY2MzI1MjE1NSwiaWF0IjoxNjYzMjUwMzU1LCJqdGkiOiJDTTpjYXRfbWF0Y2g6bHQxMjM0NTYiLCJvcGVuX2lkIjoiIiwidWlkIjo2NTIwMTY0OSwiZGVidWciOiIiLCJsYW5nIjoiIn0.NuMwjFjxPBOvqeOnnXg0wK9tWYVZmilBQC3jrS2xnLU";
            com_game2(token);
        }
    }

    public void com_game2(String token) {
        String finish_api = "https://cat-match.easygame2021.com/sheep/v1/game/game_over?rank_score=1&rank_state=1&rank_time=2&rank_role=1&skin=1";
        HttpUtil.sendGet(finish_api,token);
    }

    public static void main(String[] args) {
        new GameServer().com_game2("");
    }

}
